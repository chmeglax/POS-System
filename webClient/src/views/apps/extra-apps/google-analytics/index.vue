<template>
  <div>
    <div class="row">
      <div class="col-lg-8 col-md-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Google Analytics Home' }" />
          </div>
        </div>
        <div class="card"><vb-widgets-charts-2 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Ask analytics Intelligence' }" />
          </div>
        </div>
        <div class="card">
          <div class="card-body"><vb-widgets-lists-20 /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-charts-9 /></div>
        </div>
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'How do you acquire users?' }" />
          </div>
        </div>
        <div class="card">
          <div class="card-body"><vb-widgets-charts-5 /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-charts-10 /></div>
        </div>
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-card-header
              :data="{ title: 'How are your active users trending over time?' }"
            />
          </div>
        </div>
        <div class="card">
          <div class="card-body"><vb-widgets-charts-1 /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-lists-16 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersCardHeader from '@/@vb/widgets/Headers/CardHeader'
import VbWidgetsCharts2 from '@/@vb/widgets/WidgetsCharts/2'
import VbWidgetsLists20 from '@/@vb/widgets/WidgetsLists/20'
import VbWidgetsCharts9 from '@/@vb/widgets/WidgetsCharts/9'
import VbWidgetsCharts5 from '@/@vb/widgets/WidgetsCharts/5'
import VbWidgetsCharts10 from '@/@vb/widgets/WidgetsCharts/10'
import VbWidgetsCharts1 from '@/@vb/widgets/WidgetsCharts/1'
import VbWidgetsLists16 from '@/@vb/widgets/WidgetsLists/16'

export default {
  name: 'VbGoogleAnalytics',
  components: {
    VbHeadersCardHeader,
    VbWidgetsCharts2,
    VbWidgetsLists20,
    VbWidgetsCharts9,
    VbWidgetsCharts5,
    VbWidgetsCharts10,
    VbWidgetsCharts1,
    VbWidgetsLists16,
  },
}
</script>
