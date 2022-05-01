<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading :data="{ title: 'Ecommerce Orders' }" />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card">
          <div class="card-header py-0">
            <vb-headers-card-header-3 :data="{ title: 'Latest Orders' }" />
          </div>
          <div class="card-body"><vb-tables-antd-2 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading from '@/@vb/widgets/Headers/Heading'
import VbHeadersCardHeader3 from '@/@vb/widgets/Headers/CardHeader3'
import VbTablesAntd2 from '@/@vb/widgets/TablesAntd/2'

export default {
  name: 'VbOrders',
  components: {
    VbHeadersHeading,
    VbHeadersCardHeader3,
    VbTablesAntd2,
  },
}
</script>
