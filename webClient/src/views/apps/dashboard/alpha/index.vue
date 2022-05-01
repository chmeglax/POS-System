<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading :data="{ title: 'Last Month Statistics' }" />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card"><vb-widgets-charts-11 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card"><vb-widgets-charts-11v1 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card"><vb-widgets-charts-11v2 /></div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading :data="{ title: 'Today Statistics' }" />
          </div>
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
          <div class="card-body"><vb-widgets-charts-4v1 /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-charts-4v2 /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card">
          <div class="card-header">
            <vb-headers-heading-2
              :data="{
                title: 'Recently Referrals',
                description: 'Block with important Recently Referrals information',
              }"
            />
          </div>
          <div class="card-body"><vb-tables-antd-3 /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading-3
              :data="{ title: 'Your Cards (3)', button: 'View All', url: 'https://google.com' }"
            />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-general-17 /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-general-17v1 /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-general-17v2 /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading-3
              :data="{ title: 'Your accounts', button: 'View All', url: 'https://google.com' }"
            />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-6 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-general-5 /></div>
        </div>
      </div>
      <div class="col-lg-6 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-general-5 /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading-3
              :data="{
                title: 'Recent Transactions',
                button: 'View All',
                url: 'https://google.com',
              }"
            />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card"><vb-widgets-general-6v1 /></div>
        <div class="card"><vb-widgets-general-6 /></div>
        <div class="card"><vb-widgets-general-6v1 /></div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading from '@/@vb/widgets/Headers/Heading'
import VbWidgetsCharts11 from '@/@vb/widgets/WidgetsCharts/11'
import VbWidgetsCharts11v1 from '@/@vb/widgets/WidgetsCharts/11v1'
import VbWidgetsCharts11v2 from '@/@vb/widgets/WidgetsCharts/11v2'
import VbWidgetsCharts4 from '@/@vb/widgets/WidgetsCharts/4'
import VbWidgetsCharts4v1 from '@/@vb/widgets/WidgetsCharts/4v1'
import VbWidgetsCharts4v2 from '@/@vb/widgets/WidgetsCharts/4v2'
import VbHeadersHeading2 from '@/@vb/widgets/Headers/Heading2'
import VbTablesAntd3 from '@/@vb/widgets/TablesAntd/3'
import VbHeadersHeading3 from '@/@vb/widgets/Headers/Heading3'
import VbWidgetsGeneral17 from '@/@vb/widgets/WidgetsGeneral/17'
import VbWidgetsGeneral17v1 from '@/@vb/widgets/WidgetsGeneral/17v1'
import VbWidgetsGeneral17v2 from '@/@vb/widgets/WidgetsGeneral/17v2'
import VbWidgetsGeneral5 from '@/@vb/widgets/WidgetsGeneral/5'
import VbWidgetsGeneral6v1 from '@/@vb/widgets/WidgetsGeneral/6v1'
import VbWidgetsGeneral6 from '@/@vb/widgets/WidgetsGeneral/6'

export default {
  name: 'VbDashboardAlpha',
  components: {
    VbHeadersHeading,
    VbWidgetsCharts11,
    VbWidgetsCharts11v1,
    VbWidgetsCharts11v2,
    VbWidgetsCharts4,
    VbWidgetsCharts4v1,
    VbWidgetsCharts4v2,
    VbHeadersHeading2,
    VbTablesAntd3,
    VbHeadersHeading3,
    VbWidgetsGeneral17,
    VbWidgetsGeneral17v1,
    VbWidgetsGeneral17v2,
    VbWidgetsGeneral5,
    VbWidgetsGeneral6v1,
    VbWidgetsGeneral6,
  },
}
</script>
