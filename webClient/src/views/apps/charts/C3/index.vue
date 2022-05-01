<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading-3
              :data="{ title: 'C3', button: 'Go to Docs', url: 'https://c3js.org/' }"
            />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-6 col-md-12">
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Simple Line' }" /></div>
          <div class="card-body"><vb-charts-c3-1 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Step' }" /></div>
          <div class="card-body"><vb-charts-c3-3 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Scatter' }" /></div>
          <div class="card-body"><vb-charts-c3-5 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Stacked Bar' }" /></div>
          <div class="card-body"><vb-charts-c3-7 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Sub Chart' }" /></div>
          <div class="card-body"><vb-charts-c3-9 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Pie Chart' }" /></div>
          <div class="card-body"><vb-charts-c3-11 /></div>
        </div>
      </div>
      <div class="col-lg-6 col-md-12">
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Spline' }" /></div>
          <div class="card-body"><vb-charts-c3-2 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Area' }" /></div>
          <div class="card-body"><vb-charts-c3-4 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Bar' }" /></div>
          <div class="card-body"><vb-charts-c3-6 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Combination' }" /></div>
          <div class="card-body"><vb-charts-c3-8 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Zoom' }" /></div>
          <div class="card-body"><vb-charts-c3-10 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Donut Chart' }" /></div>
          <div class="card-body"><vb-charts-c3-12 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading3 from '@/@vb/widgets/Headers/Heading3'
import VbHeadersCardHeader from '@/@vb/widgets/Headers/CardHeader'
import VbChartsC31 from '@/@vb/widgets/ChartsC3/1'
import VbChartsC33 from '@/@vb/widgets/ChartsC3/3'
import VbChartsC35 from '@/@vb/widgets/ChartsC3/5'
import VbChartsC37 from '@/@vb/widgets/ChartsC3/7'
import VbChartsC39 from '@/@vb/widgets/ChartsC3/9'
import VbChartsC311 from '@/@vb/widgets/ChartsC3/11'
import VbChartsC32 from '@/@vb/widgets/ChartsC3/2'
import VbChartsC34 from '@/@vb/widgets/ChartsC3/4'
import VbChartsC36 from '@/@vb/widgets/ChartsC3/6'
import VbChartsC38 from '@/@vb/widgets/ChartsC3/8'
import VbChartsC310 from '@/@vb/widgets/ChartsC3/10'
import VbChartsC312 from '@/@vb/widgets/ChartsC3/12'

export default {
  name: 'VbC',
  components: {
    VbHeadersHeading3,
    VbHeadersCardHeader,
    VbChartsC31,
    VbChartsC33,
    VbChartsC35,
    VbChartsC37,
    VbChartsC39,
    VbChartsC311,
    VbChartsC32,
    VbChartsC34,
    VbChartsC36,
    VbChartsC38,
    VbChartsC310,
    VbChartsC312,
  },
}
</script>
