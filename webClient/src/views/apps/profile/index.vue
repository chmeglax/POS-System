<template>
  <div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card card-top card-top-primary">
          <div class="card-body"><vb-widgets-general-10v1 /></div>
        </div>
        <div class="card">
          <div class="card-body text-white bg-primary rounded"><vb-widgets-general-12v1 /></div>
        </div>
        <div class="card">
          <div class="card-body"><vb-widgets-general-1 /></div>
        </div>
        <div class="card">
          <div class="card-body"><vb-widgets-lists-16 /></div>
        </div>
      </div>
      <div class="col-lg-8 col-md-12">
        <div class="card card-top card-top-primary">
          <div class="card-header">
            <vb-headers-heading-2
              :data="{ title: '@mary.ableton (Mary Stanform)', description: '17,256 followers' }"
            />
          </div>
          <div class="card-header py-0"><vb-headers-card-header-tabbed-6 /></div>
          <div class="card-body"><vb-widgets-general-15 /></div>
          <div class="card-body"><vb-app-partials-wp-write /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbWidgetsGeneral10v1 from '@/@vb/widgets/WidgetsGeneral/10v1'
import VbWidgetsGeneral12v1 from '@/@vb/widgets/WidgetsGeneral/12v1'
import VbWidgetsGeneral1 from '@/@vb/widgets/WidgetsGeneral/1'
import VbWidgetsLists16 from '@/@vb/widgets/WidgetsLists/16'
import VbHeadersHeading2 from '@/@vb/widgets/Headers/Heading2'
import VbHeadersCardHeaderTabbed6 from '@/@vb/widgets/Headers/CardHeaderTabbed6'
import VbWidgetsGeneral15 from '@/@vb/widgets/WidgetsGeneral/15'
import VbAppPartialsWpWrite from '@/@vb/widgets/AppPartials/WpWrite'

export default {
  name: 'VbProfile',
  components: {
    VbWidgetsGeneral10v1,
    VbWidgetsGeneral12v1,
    VbWidgetsGeneral1,
    VbWidgetsLists16,
    VbHeadersHeading2,
    VbHeadersCardHeaderTabbed6,
    VbWidgetsGeneral15,
    VbAppPartialsWpWrite,
  },
}
</script>
