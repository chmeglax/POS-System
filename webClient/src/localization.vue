<template>
  <a-config-provider :locale="localeAntd">
    <router-view />
  </a-config-provider>
</template>

<script>
import { watch, computed, ref } from 'vue'
import { useStore } from 'vuex'
import { createI18n, useI18n } from 'vue-i18n/dist/vue-i18n.esm-browser.prod'

import english from '@/locales/en-US'
import french from '@/locales/fr-FR'
import russian from '@/locales/ru-RU'
import chinese from '@/locales/zh-CN'

const locales = {
  'en-US': english,
  'fr-FR': french,
  'ru-RU': russian,
  'zh-CN': chinese,
}

export const i18n = createI18n({
  // legacy: false,
  locale: 'en-US',
  fallbackLocale: 'en-US',
  messages: {
    'en-US': locales['en-US'].messages,
    'fr-FR': locales['fr-FR'].messages,
    'ru-RU': locales['ru-RU'].messages,
    'zh-CN': locales['zh-CN'].messages,
  },
})

export default {
  name: 'Localization',
  setup() {
    const store = useStore()
    const { locale } = useI18n()
    const settingsLocale = computed(() => store.state.settings.locale)
    const localeAntd = ref(locales[settingsLocale.value].localeAntd)

    // set locale from settings on app load
    locale.value = settingsLocale.value

    // watch locale settings change and apply
    watch(settingsLocale, settingsLocale => {
      locale.value = settingsLocale
      localeAntd.value = locales[settingsLocale].localeAntd
    })

    return {
      localeAntd,
    }
  },
}
</script>
