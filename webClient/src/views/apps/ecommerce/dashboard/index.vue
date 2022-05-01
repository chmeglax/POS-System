<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading :data="{ title: 'Ecommerce Dashboard' }" />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-8 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-tables-5 /></div>
        </div>
        <div class="card">
          <div class="card-header py-0"><vb-headers-card-header-tabbed-6 /></div>
          <div class="card-body"><vb-widgets-charts-3 /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body text-white bg-success rounded"><vb-widgets-general-2v3 /></div>
        </div>
        <div class="card">
          <div class="card-body"><vb-widgets-general-2 /></div>
        </div>
        <div class="card">
          <div class="card-body"><vb-widgets-general-2v1 /></div>
        </div>
        <div class="card">
          <div class="card-body"><vb-widgets-lists-11 /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card"><vb-widgets-general-16 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card"><vb-widgets-general-16 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card"><vb-widgets-general-16 /></div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading from '@/@vb/widgets/Headers/Heading'
import VbWidgetsTables5 from '@/@vb/widgets/WidgetsTables/5'
import VbHeadersCardHeaderTabbed6 from '@/@vb/widgets/Headers/CardHeaderTabbed6'
import VbWidgetsCharts3 from '@/@vb/widgets/WidgetsCharts/3'
import VbWidgetsGeneral2v3 from '@/@vb/widgets/WidgetsGeneral/2v3'
import VbWidgetsGeneral2 from '@/@vb/widgets/WidgetsGeneral/2'
import VbWidgetsGeneral2v1 from '@/@vb/widgets/WidgetsGeneral/2v1'
import VbWidgetsLists11 from '@/@vb/widgets/WidgetsLists/11'
import VbWidgetsGeneral16 from '@/@vb/widgets/WidgetsGeneral/16'

export default {
  name: 'VbDashboard',
  components: {
    VbHeadersHeading,
    VbWidgetsTables5,
    VbHeadersCardHeaderTabbed6,
    VbWidgetsCharts3,
    VbWidgetsGeneral2v3,
    VbWidgetsGeneral2,
    VbWidgetsGeneral2v1,
    VbWidgetsLists11,
    VbWidgetsGeneral16,
  },
}
</script>
