<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header"><vb-headers-heading :data="{ title: 'Form Examples' }" /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Basic Form' }" /></div>
          <div class="card-body"><vb-forms-1 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Inline Form' }" /></div>
          <div class="card-body"><vb-forms-2 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Two Columns' }" /></div>
          <div class="card-body"><vb-forms-3 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Validation' }" /></div>
          <div class="card-body"><vb-forms-4 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Add Post' }" /></div>
          <div class="card-body"><vb-forms-5 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading from '@/@vb/widgets/Headers/Heading'
import VbHeadersCardHeader from '@/@vb/widgets/Headers/CardHeader'
import VbForms1 from '@/@vb/widgets/Forms/1'
import VbForms2 from '@/@vb/widgets/Forms/2'
import VbForms3 from '@/@vb/widgets/Forms/3'
import VbForms4 from '@/@vb/widgets/Forms/4'
import VbForms5 from '@/@vb/widgets/Forms/5'

export default {
  name: 'VbFormExamples',
  components: {
    VbHeadersHeading,
    VbHeadersCardHeader,
    VbForms1,
    VbForms2,
    VbForms3,
    VbForms4,
    VbForms5,
  },
}
</script>
