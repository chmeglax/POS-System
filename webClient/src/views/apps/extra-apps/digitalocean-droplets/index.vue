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
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-charts-4 /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-charts-4v3 /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-charts-4v1 /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header"><vb-headers-heading :data="{ title: 'Droplets (2)' }" /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card">
          <div class="card-body"><vb-app-partials-do-server /></div>
        </div>
        <div class="card">
          <div class="card-body"><vb-app-partials-do-server /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading :data="{ title: 'Create Something New' }" />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-widgets-lists-8 /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-widgets-lists-6 /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-widgets-lists-5 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbAppPartialsDoHead from '@/@vb/widgets/AppPartials/DoHead'
import VbWidgetsCharts4 from '@/@vb/widgets/WidgetsCharts/4'
import VbWidgetsCharts4v3 from '@/@vb/widgets/WidgetsCharts/4v3'
import VbWidgetsCharts4v1 from '@/@vb/widgets/WidgetsCharts/4v1'
import VbHeadersHeading from '@/@vb/widgets/Headers/Heading'
import VbAppPartialsDoServer from '@/@vb/widgets/AppPartials/DoServer'
import VbWidgetsLists8 from '@/@vb/widgets/WidgetsLists/8'
import VbWidgetsLists6 from '@/@vb/widgets/WidgetsLists/6'
import VbWidgetsLists5 from '@/@vb/widgets/WidgetsLists/5'

export default {
  name: 'VbDigitaloceanDroplets',
  components: {
    VbAppPartialsDoHead,
    VbWidgetsCharts4,
    VbWidgetsCharts4v3,
    VbWidgetsCharts4v1,
    VbHeadersHeading,
    VbAppPartialsDoServer,
    VbWidgetsLists8,
    VbWidgetsLists6,
    VbWidgetsLists5,
  },
}
</script>
