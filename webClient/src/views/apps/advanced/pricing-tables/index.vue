<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header"><vb-headers-heading :data="{ title: 'Pricing Tables' }" /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card"><vb-widgets-lists-21 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card"><vb-widgets-lists-21v1 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card"><vb-widgets-lists-21v2 /></div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading from '@/@vb/widgets/Headers/Heading'
import VbWidgetsLists21 from '@/@vb/widgets/WidgetsLists/21'
import VbWidgetsLists21v1 from '@/@vb/widgets/WidgetsLists/21v1'
import VbWidgetsLists21v2 from '@/@vb/widgets/WidgetsLists/21v2'

export default {
  name: 'VbPricingTables',
  components: {
    VbHeadersHeading,
    VbWidgetsLists21,
    VbWidgetsLists21v1,
    VbWidgetsLists21v2,
  },
}
</script>
