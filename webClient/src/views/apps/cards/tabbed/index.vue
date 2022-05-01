<template>
  <div>
    <div class="row">
      <div class="col-lg-6 col-md-12">
        <div class="card">
          <div class="card-header py-0">
            <vb-headers-card-header-tabbed :data="{ title: 'Basic' }" />
          </div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
        <div class="card">
          <div class="card-header py-0">
            <vb-headers-card-header-tabbed-3 :data="{ title: 'With dropdown' }" />
          </div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
        <div class="card">
          <div class="card-header py-0">
            <vb-headers-card-header-tabbed-4 :data="{ title: 'Bold border' }" />
          </div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
      </div>
      <div class="col-lg-6 col-md-12">
        <div class="card">
          <div class="card-header py-0">
            <vb-headers-card-header-tabbed-2 :data="{ title: 'Pills' }" />
          </div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
        <div class="card">
          <div class="card-header py-0">
            <vb-headers-card-header-tabbed-5
              :data="{ title: 'With icon', icon: 'fe fe-activity' }"
            />
          </div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
        <div class="card">
          <div class="card-header py-0"><vb-headers-card-header-tabbed-6 /></div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersCardHeaderTabbed from '@/@vb/widgets/Headers/CardHeaderTabbed'
import VbTypography2 from '@/@vb/widgets/Typography/2'
import VbHeadersCardHeaderTabbed3 from '@/@vb/widgets/Headers/CardHeaderTabbed3'
import VbHeadersCardHeaderTabbed4 from '@/@vb/widgets/Headers/CardHeaderTabbed4'
import VbHeadersCardHeaderTabbed2 from '@/@vb/widgets/Headers/CardHeaderTabbed2'
import VbHeadersCardHeaderTabbed5 from '@/@vb/widgets/Headers/CardHeaderTabbed5'
import VbHeadersCardHeaderTabbed6 from '@/@vb/widgets/Headers/CardHeaderTabbed6'

export default {
  name: 'VbTabbedCards',
  components: {
    VbHeadersCardHeaderTabbed,
    VbTypography2,
    VbHeadersCardHeaderTabbed3,
    VbHeadersCardHeaderTabbed4,
    VbHeadersCardHeaderTabbed2,
    VbHeadersCardHeaderTabbed5,
    VbHeadersCardHeaderTabbed6,
  },
}
</script>
