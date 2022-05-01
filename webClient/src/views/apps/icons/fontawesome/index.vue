<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading-3
              :data="{ title: 'Fontawesome', button: 'Go to Docs', url: 'http://fontawesome.io/' }"
            />
          </div>
        </div>
        <div class="card">
          <div class="card-body"><vb-hidden-icons-fontawesome /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading3 from '@/@vb/widgets/Headers/Heading3'
import VbHiddenIconsFontawesome from '@/@vb/widgets/Hidden/IconsFontawesome'

export default {
  name: 'VbFontawesome',
  components: {
    VbHeadersHeading3,
    VbHiddenIconsFontawesome,
  },
}
</script>
