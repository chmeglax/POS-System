<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header"><vb-headers-heading :data="{ title: 'Invoice' }" /></div>
        </div>
        <div class="card">
          <div class="card-body"><vb-widgets-tables-8 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading from '@/@vb/widgets/Headers/Heading'
import VbWidgetsTables8 from '@/@vb/widgets/WidgetsTables/8'

export default {
  name: 'VbInvoice',
  components: {
    VbHeadersHeading,
    VbWidgetsTables8,
  },
}
</script>
