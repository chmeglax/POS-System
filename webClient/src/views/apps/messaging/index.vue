<template>
  <div>
    <div class="row">
      <div class="col-lg-3 col-md-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-widgets-lists-22 /></div>
        </div>
      </div>
      <div class="col-lg-9 col-md-12">
        <div class="card card-top card-top-primary">
          <div class="card-header py-0">
            <vb-headers-card-header-3 :data="{ title: 'Helen Maggie' }" />
          </div>
          <div class="card-body"><vb-widgets-general-14 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbWidgetsLists22 from '@/@vb/widgets/WidgetsLists/22'
import VbHeadersCardHeader3 from '@/@vb/widgets/Headers/CardHeader3'
import VbWidgetsGeneral14 from '@/@vb/widgets/WidgetsGeneral/14'

export default {
  name: 'VbMessaging',
  components: {
    VbWidgetsLists22,
    VbHeadersCardHeader3,
    VbWidgetsGeneral14,
  },
}
</script>
