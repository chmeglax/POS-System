<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading-3
              :data="{
                title: 'Typography',
                button: 'Go to Docs',
                url: 'https://getbootstrap.com/docs/4.5/layout/grid/',
              }"
            />
          </div>
        </div>
        <div class="card">
          <div class="card-body"><vb-hidden-typography /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading3 from '@/@vb/widgets/Headers/Heading3'
import VbHiddenTypography from '@/@vb/widgets/Hidden/Typography'

export default {
  name: 'VbTypography',
  components: {
    VbHeadersHeading3,
    VbHiddenTypography,
  },
}
</script>
