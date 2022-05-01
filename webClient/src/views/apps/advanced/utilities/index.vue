<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading-3
              :data="{
                title: 'Utilities',
                button: 'Go to Docs',
                url: 'https://getbootstrap.com/docs/4.5/utilities/',
              }"
            />
          </div>
        </div>
        <div class="card">
          <div class="card-body"><vb-hidden-utilities /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading3 from '@/@vb/widgets/Headers/Heading3'
import VbHiddenUtilities from '@/@vb/widgets/Hidden/Utilities'

export default {
  name: 'VbUtilities',
  components: {
    VbHeadersHeading3,
    VbHiddenUtilities,
  },
}
</script>
