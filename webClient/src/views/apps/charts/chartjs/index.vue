<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading-3
              :data="{
                title: 'Charts / Chartjs',
                button: 'Go to Docs',
                url: 'https://www.chartjs.org/',
              }"
            />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-6 col-md-12">
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Line Chart' }" /></div>
          <div class="card-body"><vb-charts-chartjs-1 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Radar Chart' }" /></div>
          <div class="card-body"><vb-charts-chartjs-3 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Pie Chart' }" /></div>
          <div class="card-body"><vb-charts-chartjs-5 /></div>
        </div>
      </div>
      <div class="col-lg-6 col-md-12">
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Bar Chart' }" /></div>
          <div class="card-body"><vb-charts-chartjs-2 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Polar Area Chart' }" />
          </div>
          <div class="card-body"><vb-charts-chartjs-4 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Doughnut Chart' }" />
          </div>
          <div class="card-body"><vb-charts-chartjs-6 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading3 from '@/@vb/widgets/Headers/Heading3'
import VbHeadersCardHeader from '@/@vb/widgets/Headers/CardHeader'
import VbChartsChartjs1 from '@/@vb/widgets/ChartsChartjs/1'
import VbChartsChartjs3 from '@/@vb/widgets/ChartsChartjs/3'
import VbChartsChartjs5 from '@/@vb/widgets/ChartsChartjs/5'
import VbChartsChartjs2 from '@/@vb/widgets/ChartsChartjs/2'
import VbChartsChartjs4 from '@/@vb/widgets/ChartsChartjs/4'
import VbChartsChartjs6 from '@/@vb/widgets/ChartsChartjs/6'

export default {
  name: 'VbChartJs',
  components: {
    VbHeadersHeading3,
    VbHeadersCardHeader,
    VbChartsChartjs1,
    VbChartsChartjs3,
    VbChartsChartjs5,
    VbChartsChartjs2,
    VbChartsChartjs4,
    VbChartsChartjs6,
  },
}
</script>
