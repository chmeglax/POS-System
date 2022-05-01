<template>
  <div>
    <div class="row">
      <div class="col-lg-3 col-md-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-widgets-lists-23 /></div>
        </div>
      </div>
      <div class="col-lg-9 col-md-12">
        <div class="card card-top card-top-primary">
          <div class="card-header py-0"><vb-headers-card-header-tabbed-6 /></div>
          <div class="card-body"><vb-tables-antd-1 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbWidgetsLists23 from '@/@vb/widgets/WidgetsLists/23'
import VbHeadersCardHeaderTabbed6 from '@/@vb/widgets/Headers/CardHeaderTabbed6'
import VbTablesAntd1 from '@/@vb/widgets/TablesAntd/1'

export default {
  name: 'VbMail',
  components: {
    VbWidgetsLists23,
    VbHeadersCardHeaderTabbed6,
    VbTablesAntd1,
  },
}
</script>
