<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading :data="{ title: 'Ecommerce Product Details' }" />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card">
          <div class="card-body"><vb-app-partials-ecommerce-product /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading :data="{ title: 'Basic page header' }" />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card"><vb-widgets-general-16 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card"><vb-widgets-general-16 /></div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card"><vb-widgets-general-16 /></div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading from '@/@vb/widgets/Headers/Heading'
import VbAppPartialsEcommerceProduct from '@/@vb/widgets/AppPartials/EcommerceProduct'
import VbWidgetsGeneral16 from '@/@vb/widgets/WidgetsGeneral/16'

export default {
  name: 'VbProductDetails',
  components: {
    VbHeadersHeading,
    VbAppPartialsEcommerceProduct,
    VbWidgetsGeneral16,
  },
}
</script>
