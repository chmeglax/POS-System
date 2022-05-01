<template>
  <div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART1' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-charts-1 /></div>
        </div>
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART2' }" /></div>
        <div class="card"><vb-widgets-charts-2 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART9' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-charts-9 /></div>
        </div>
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART5' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-charts-5 /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART10' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-charts-10 /></div>
        </div>
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART6' }" /></div>
        <div class="card"><vb-widgets-charts-6 /></div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-3 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART / 4' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-charts-4 /></div>
        </div>
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART / 4-2' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-charts-4v2 /></div>
        </div>
      </div>
      <div class="col-lg-3 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART / 4-1' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-charts-4v1 /></div>
        </div>
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART / 4-3' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-charts-4v3 /></div>
        </div>
      </div>
      <div class="col-lg-6 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART / 7' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-charts-7 /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-6 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART / 3' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-charts-3 /></div>
        </div>
      </div>
      <div class="col-lg-6 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART / 8' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-charts-8 /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART / 11' }" /></div>
        <div class="card"><vb-widgets-charts-11 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART / 11-1' }" /></div>
        <div class="card"><vb-widgets-charts-11v1 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART / 11-2' }" /></div>
        <div class="card"><vb-widgets-charts-11v2 /></div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-6 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART / 12' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-charts-12 /></div>
        </div>
      </div>
      <div class="col-lg-6 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART / 12-1' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-charts-12v1 /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART / 13' }" /></div>
        <div class="card"><vb-widgets-charts-13 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART / 13-1' }" /></div>
        <div class="card"><vb-widgets-charts-13v1 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'CHART / 13-2' }" /></div>
        <div class="card"><vb-widgets-charts-13v2 /></div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersTag from '@/@vb/widgets/Headers/Tag'
import VbWidgetsCharts1 from '@/@vb/widgets/WidgetsCharts/1'
import VbWidgetsCharts2 from '@/@vb/widgets/WidgetsCharts/2'
import VbWidgetsCharts9 from '@/@vb/widgets/WidgetsCharts/9'
import VbWidgetsCharts5 from '@/@vb/widgets/WidgetsCharts/5'
import VbWidgetsCharts10 from '@/@vb/widgets/WidgetsCharts/10'
import VbWidgetsCharts6 from '@/@vb/widgets/WidgetsCharts/6'
import VbWidgetsCharts4 from '@/@vb/widgets/WidgetsCharts/4'
import VbWidgetsCharts4v2 from '@/@vb/widgets/WidgetsCharts/4v2'
import VbWidgetsCharts4v1 from '@/@vb/widgets/WidgetsCharts/4v1'
import VbWidgetsCharts4v3 from '@/@vb/widgets/WidgetsCharts/4v3'
import VbWidgetsCharts7 from '@/@vb/widgets/WidgetsCharts/7'
import VbWidgetsCharts3 from '@/@vb/widgets/WidgetsCharts/3'
import VbWidgetsCharts8 from '@/@vb/widgets/WidgetsCharts/8'
import VbWidgetsCharts11 from '@/@vb/widgets/WidgetsCharts/11'
import VbWidgetsCharts11v1 from '@/@vb/widgets/WidgetsCharts/11v1'
import VbWidgetsCharts11v2 from '@/@vb/widgets/WidgetsCharts/11v2'
import VbWidgetsCharts12 from '@/@vb/widgets/WidgetsCharts/12'
import VbWidgetsCharts12v1 from '@/@vb/widgets/WidgetsCharts/12v1'
import VbWidgetsCharts13 from '@/@vb/widgets/WidgetsCharts/13'
import VbWidgetsCharts13v1 from '@/@vb/widgets/WidgetsCharts/13v1'
import VbWidgetsCharts13v2 from '@/@vb/widgets/WidgetsCharts/13v2'

export default {
  name: 'VbCharts',
  components: {
    VbHeadersTag,
    VbWidgetsCharts1,
    VbWidgetsCharts2,
    VbWidgetsCharts9,
    VbWidgetsCharts5,
    VbWidgetsCharts10,
    VbWidgetsCharts6,
    VbWidgetsCharts4,
    VbWidgetsCharts4v2,
    VbWidgetsCharts4v1,
    VbWidgetsCharts4v3,
    VbWidgetsCharts7,
    VbWidgetsCharts3,
    VbWidgetsCharts8,
    VbWidgetsCharts11,
    VbWidgetsCharts11v1,
    VbWidgetsCharts11v2,
    VbWidgetsCharts12,
    VbWidgetsCharts12v1,
    VbWidgetsCharts13,
    VbWidgetsCharts13v1,
    VbWidgetsCharts13v2,
  },
}
</script>
