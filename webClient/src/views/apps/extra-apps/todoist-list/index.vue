<template>
  <div>
    <div class="row">
      <div class="col-lg-3 col-md-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-widgets-lists-24 /></div>
        </div>
      </div>
      <div class="col-lg-9 col-md-12">
        <div class="card">
          <div class="card-header py-0">
            <vb-headers-card-header-3 :data="{ title: 'Welcome 👋' }" />
          </div>
          <div class="card-body"><vb-widgets-lists-26 /></div>
          <div class="card-body">
            <vb-controls-button :data="{ title: 'Add Task', type: 'primary' }" />
          </div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Completed' }" /></div>
          <div class="card-body"><vb-widgets-lists-27 /></div>
        </div>
        <div class="card">
          <div class="card-body"><vb-widgets-tables-6 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbWidgetsLists24 from '@/@vb/widgets/WidgetsLists/24'
import VbHeadersCardHeader3 from '@/@vb/widgets/Headers/CardHeader3'
import VbWidgetsLists26 from '@/@vb/widgets/WidgetsLists/26'
import VbControlsButton from '@/@vb/widgets/Controls/Button'
import VbTypography2 from '@/@vb/widgets/Typography/2'
import VbHeadersCardHeader from '@/@vb/widgets/Headers/CardHeader'
import VbWidgetsLists27 from '@/@vb/widgets/WidgetsLists/27'
import VbWidgetsTables6 from '@/@vb/widgets/WidgetsTables/6'

export default {
  name: 'VbTodoistList',
  components: {
    VbWidgetsLists24,
    VbHeadersCardHeader3,
    VbWidgetsLists26,
    VbControlsButton,
    VbTypography2,
    VbHeadersCardHeader,
    VbWidgetsLists27,
    VbWidgetsTables6,
  },
}
</script>
