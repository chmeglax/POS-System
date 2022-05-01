<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header"><vb-headers-heading :data="{ title: 'Ecommerce Cart' }" /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card">
          <div class="card-body"><vb-forms-6 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading from '@/@vb/widgets/Headers/Heading'
import VbForms6 from '@/@vb/widgets/Forms/6'

export default {
  name: 'VbCart',
  components: {
    VbHeadersHeading,
    VbForms6,
  },
}
</script>
