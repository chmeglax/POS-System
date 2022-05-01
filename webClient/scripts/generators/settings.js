const { GET_BETWEEN_JSON, REPLACE_BETWEEN } = require('../utils/io')

const settingsFile = 'src/store/settings/index.js'

module.exports = (settings) => {
  // get settings
  const settingsSource = GET_BETWEEN_JSON(
    settingsFile,
    `VB:REPLACE-START:SETTINGS`,
    `VB:REPLACE-END:SETTINGS`,
  )

  const settingsUpdated = {
    ...settingsSource,
    ...settings,
  }
  let code = ``
  Object.keys(settingsUpdated).forEach((key) => {
    const v = settingsUpdated[key]
    const b = (typeof v === 'boolean' || typeof v === 'number') ? v : `'${v}'`
    code = code + `${key}: ${b},\n`
  })

  // replace settings
  REPLACE_BETWEEN(
    settingsFile,
    `VB:REPLACE-START:SETTINGS`,
    `VB:REPLACE-END:SETTINGS`,
    code,
  )
}
