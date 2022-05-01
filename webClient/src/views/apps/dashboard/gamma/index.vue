<template>
  <div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-charts-12 /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-charts-12v1 /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-charts-12v1 /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-widgets-lists-19 /></div>
        </div>
      </div>
      <div class="col-lg-8 col-md-12">
        <div class="card card-top">
          <div class="card-body"><vb-widgets-charts-7 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbWidgetsCharts12 from '@/@vb/widgets/WidgetsCharts/12'
import VbWidgetsCharts12v1 from '@/@vb/widgets/WidgetsCharts/12v1'
import VbWidgetsLists19 from '@/@vb/widgets/WidgetsLists/19'
import VbWidgetsCharts7 from '@/@vb/widgets/WidgetsCharts/7'

export default {
  name: 'VbDashboardGamma',
  components: {
    VbWidgetsCharts12,
    VbWidgetsCharts12v1,
    VbWidgetsLists19,
    VbWidgetsCharts7,
  },
}
</script>
