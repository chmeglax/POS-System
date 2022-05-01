<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading-3
              :data="{
                title: 'Chartist.js',
                button: 'Go to Docs',
                url: 'https://gionkunz.github.io/chartist-js/',
              }"
            />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-6 col-md-12">
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'CSS Styling & Animations' }" />
          </div>
          <div class="card-body"><vb-charts-chartistjs-1 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Line' }" /></div>
          <div class="card-body"><vb-charts-chartistjs-3 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Scatter' }" /></div>
          <div class="card-body"><vb-charts-chartistjs-5 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Bi-polar Line' }" />
          </div>
          <div class="card-body"><vb-charts-chartistjs-7 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Stacked Bar' }" /></div>
          <div class="card-body"><vb-charts-chartistjs-9 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Simple Pie' }" /></div>
          <div class="card-body"><vb-charts-chartistjs-11 /></div>
        </div>
      </div>
      <div class="col-lg-6 col-md-12">
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'SMIL Animations' }" />
          </div>
          <div class="card-body"><vb-charts-chartistjs-2 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Area' }" /></div>
          <div class="card-body"><vb-charts-chartistjs-4 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Horizontal Bar' }" />
          </div>
          <div class="card-body"><vb-charts-chartistjs-6 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Bi-polar Bar' }" />
          </div>
          <div class="card-body"><vb-charts-chartistjs-8 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Overlapping Bar' }" />
          </div>
          <div class="card-body"><vb-charts-chartistjs-10 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Pie w/ Labels' }" />
          </div>
          <div class="card-body"><vb-charts-chartistjs-12 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading3 from '@/@vb/widgets/Headers/Heading3'
import VbHeadersCardHeader from '@/@vb/widgets/Headers/CardHeader'
import VbChartsChartistjs1 from '@/@vb/widgets/ChartsChartistjs/1'
import VbChartsChartistjs3 from '@/@vb/widgets/ChartsChartistjs/3'
import VbChartsChartistjs5 from '@/@vb/widgets/ChartsChartistjs/5'
import VbChartsChartistjs7 from '@/@vb/widgets/ChartsChartistjs/7'
import VbChartsChartistjs9 from '@/@vb/widgets/ChartsChartistjs/9'
import VbChartsChartistjs11 from '@/@vb/widgets/ChartsChartistjs/11'
import VbChartsChartistjs2 from '@/@vb/widgets/ChartsChartistjs/2'
import VbChartsChartistjs4 from '@/@vb/widgets/ChartsChartistjs/4'
import VbChartsChartistjs6 from '@/@vb/widgets/ChartsChartistjs/6'
import VbChartsChartistjs8 from '@/@vb/widgets/ChartsChartistjs/8'
import VbChartsChartistjs10 from '@/@vb/widgets/ChartsChartistjs/10'
import VbChartsChartistjs12 from '@/@vb/widgets/ChartsChartistjs/12'

export default {
  name: 'VbChartistJs',
  components: {
    VbHeadersHeading3,
    VbHeadersCardHeader,
    VbChartsChartistjs1,
    VbChartsChartistjs3,
    VbChartsChartistjs5,
    VbChartsChartistjs7,
    VbChartsChartistjs9,
    VbChartsChartistjs11,
    VbChartsChartistjs2,
    VbChartsChartistjs4,
    VbChartsChartistjs6,
    VbChartsChartistjs8,
    VbChartsChartistjs10,
    VbChartsChartistjs12,
  },
}
</script>
