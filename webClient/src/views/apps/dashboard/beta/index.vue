<template>
  <div>
    <div class="row">
      <div class="col-lg-6 col-md-12">
        <div class="card">
          <div class="card-header">
            <vb-headers-heading-2
              :data="{
                title: 'Account Information',
                description: 'Block with important Account information',
              }"
            />
          </div>
          <div class="card-body"><vb-widgets-general-19 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-heading-2
              :data="{
                title: 'Server Statistics',
                description: 'Block with important Account information',
              }"
            />
          </div>
          <div class="card-body bg-light rounded"><vb-widgets-general-21v2 /></div>
          <div class="card-body bg-light rounded"><vb-widgets-general-21v2 /></div>
          <div class="card-body bg-success text-white rounded"><vb-widgets-general-21 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-heading-2
              :data="{
                title: 'Work Progress',
                description: 'Block with important Account information',
              }"
            />
          </div>
          <div class="card-body"><vb-widgets-lists-10 /></div>
        </div>
      </div>
      <div class="col-lg-6 col-md-12">
        <div class="card">
          <div class="card-header">
            <vb-headers-heading-2
              :data="{
                title: 'Account Settings',
                description: 'Block with important Account information',
              }"
            />
          </div>
          <vb-widgets-general-20v1 />
        </div>
        <div class="card card-top card-top-success">
          <div class="card-header">
            <vb-headers-heading-2
              :data="{
                title: 'User Divergence',
                description: 'Block with important Account information',
              }"
            />
          </div>
          <div class="card-body"><vb-charts-chartistjs-7 /></div>
        </div>
        <div class="card card-top card-top-primary">
          <div class="card-header">
            <vb-headers-heading-2
              :data="{
                title: 'Months Activity',
                description: 'Block with important Account information',
              }"
            />
          </div>
          <div class="card-body"><vb-charts-chartistjs-10 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-heading-2
              :data="{ title: 'Revenue', description: 'Block with important Account information' }"
            />
          </div>
          <div class="card-body"><vb-widgets-general-1v1 /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card">
          <div class="card-body"><vb-app-partials-calendar /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading2 from '@/@vb/widgets/Headers/Heading2'
import VbWidgetsGeneral19 from '@/@vb/widgets/WidgetsGeneral/19'
import VbWidgetsGeneral21v2 from '@/@vb/widgets/WidgetsGeneral/21v2'
import VbWidgetsGeneral21 from '@/@vb/widgets/WidgetsGeneral/21'
import VbWidgetsLists10 from '@/@vb/widgets/WidgetsLists/10'
import VbWidgetsGeneral20v1 from '@/@vb/widgets/WidgetsGeneral/20v1'
import VbChartsChartistjs7 from '@/@vb/widgets/ChartsChartistjs/7'
import VbChartsChartistjs10 from '@/@vb/widgets/ChartsChartistjs/10'
import VbWidgetsGeneral1v1 from '@/@vb/widgets/WidgetsGeneral/1v1'
import VbAppPartialsCalendar from '@/@vb/widgets/AppPartials/Calendar'

export default {
  name: 'VbDashboardBeta',
  components: {
    VbHeadersHeading2,
    VbWidgetsGeneral19,
    VbWidgetsGeneral21v2,
    VbWidgetsGeneral21,
    VbWidgetsLists10,
    VbWidgetsGeneral20v1,
    VbChartsChartistjs7,
    VbChartsChartistjs10,
    VbWidgetsGeneral1v1,
    VbAppPartialsCalendar,
  },
}
</script>
