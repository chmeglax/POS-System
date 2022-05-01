<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading :data="{ title: 'Ecommerce Product Catalog' }" />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-controls-pagination /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card"><vb-widgets-general-16 /></div>
        <div class="card"><vb-widgets-general-16 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card"><vb-widgets-general-16 /></div>
        <div class="card"><vb-widgets-general-16 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card"><vb-widgets-general-16 /></div>
        <div class="card"><vb-widgets-general-16 /></div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-controls-pagination /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading from '@/@vb/widgets/Headers/Heading'
import VbControlsPagination from '@/@vb/widgets/Controls/Pagination'
import VbWidgetsGeneral16 from '@/@vb/widgets/WidgetsGeneral/16'

export default {
  name: 'VbProductCatalog',
  components: {
    VbHeadersHeading,
    VbControlsPagination,
    VbWidgetsGeneral16,
  },
}
</script>
