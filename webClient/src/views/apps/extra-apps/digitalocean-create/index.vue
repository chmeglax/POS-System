<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-app-partials-do-head /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header"><vb-headers-heading :data="{ title: 'Choose an Image' }" /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-app-partials-do-image /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header"><vb-headers-heading :data="{ title: 'Choose Plan' }" /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-app-partials-do-plan /></div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
        <div class="card card-top card-top-primary">
          <div class="card-body">
            <vb-controls-button-3
              :data="{ mainTitle: 'Update', mainType: 'primary', additionalTitle: 'Cancel' }"
            />
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbAppPartialsDoHead from '@/@vb/widgets/AppPartials/DoHead'
import VbHeadersHeading from '@/@vb/widgets/Headers/Heading'
import VbAppPartialsDoImage from '@/@vb/widgets/AppPartials/DoImage'
import VbAppPartialsDoPlan from '@/@vb/widgets/AppPartials/DoPlan'
import VbTypography2 from '@/@vb/widgets/Typography/2'
import VbControlsButton3 from '@/@vb/widgets/Controls/Button3'

export default {
  name: 'VbDigitaloceanCreate',
  components: {
    VbAppPartialsDoHead,
    VbHeadersHeading,
    VbAppPartialsDoImage,
    VbAppPartialsDoPlan,
    VbTypography2,
    VbControlsButton3,
  },
}
</script>
