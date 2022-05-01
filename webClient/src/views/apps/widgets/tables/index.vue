<template>
  <div>
    <div class="row">
      <div class="col-lg-6 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'TABLE1' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-tables-1 /></div>
        </div>
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'TABLE2' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-tables-2 /></div>
        </div>
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'TABLE3' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-tables-2 /></div>
        </div>
      </div>
      <div class="col-lg-6 col-md-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'TABLE4' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-tables-4 /></div>
        </div>
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'TABLE5' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-tables-5 /></div>
        </div>
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'TABLE6' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-tables-6 /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'TABLE7' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-tables-7 /></div>
        </div>
        <div class="card-placeholder"><vb-headers-tag :data="{ title: 'TABLE8' }" /></div>
        <div class="card">
          <div class="card-body"><vb-widgets-tables-8 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersTag from '@/@vb/widgets/Headers/Tag'
import VbWidgetsTables1 from '@/@vb/widgets/WidgetsTables/1'
import VbWidgetsTables2 from '@/@vb/widgets/WidgetsTables/2'
import VbWidgetsTables4 from '@/@vb/widgets/WidgetsTables/4'
import VbWidgetsTables5 from '@/@vb/widgets/WidgetsTables/5'
import VbWidgetsTables6 from '@/@vb/widgets/WidgetsTables/6'
import VbWidgetsTables7 from '@/@vb/widgets/WidgetsTables/7'
import VbWidgetsTables8 from '@/@vb/widgets/WidgetsTables/8'

export default {
  name: 'VbTables',
  components: {
    VbHeadersTag,
    VbWidgetsTables1,
    VbWidgetsTables2,
    VbWidgetsTables4,
    VbWidgetsTables5,
    VbWidgetsTables6,
    VbWidgetsTables7,
    VbWidgetsTables8,
  },
}
</script>
