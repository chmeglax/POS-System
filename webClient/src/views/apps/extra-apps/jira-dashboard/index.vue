<template>
  <div>
    <div class="row">
      <div class="col-lg-6 col-md-12">
        <div class="card card-top card-top-primary">
          <div class="card-header py-0">
            <vb-headers-card-header-2 :data="{ title: 'Introduction' }" />
          </div>
          <div class="card-body">
            <vb-controls-button-2
              :data="{ title: 'New Request', icon: 'fe fe-plus-circle', type: 'primary' }"
            />
          </div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
        <div class="card card-top card-top-primary">
          <div class="card-header py-0">
            <vb-headers-card-header-2 :data="{ title: 'Revenue' }" />
          </div>
          <div class="card-body"><vb-widgets-general-1 /></div>
        </div>
        <div class="card"><vb-widgets-general-6 /></div>
        <div class="card"><vb-widgets-general-6v1 /></div>
      </div>
      <div class="col-lg-6 col-md-12">
        <div class="card card-top card-top-primary">
          <div class="card-header py-0">
            <vb-headers-card-header-2 :data="{ title: 'Introduction' }" />
          </div>
          <div class="card-body"><vb-placeholders-1 /></div>
        </div>
        <div class="card card-top card-top-primary">
          <div class="card-header py-0">
            <vb-headers-card-header-2 :data="{ title: 'Activity Stream' }" />
          </div>
          <div class="card-body"><vb-widgets-lists-11 /></div>
        </div>
        <div class="card card-top card-top-primary">
          <div class="card-header py-0">
            <vb-headers-card-header-2 :data="{ title: 'Statistics' }" />
          </div>
          <div class="card-body"><vb-widgets-tables-1 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersCardHeader2 from '@/@vb/widgets/Headers/CardHeader2'
import VbControlsButton2 from '@/@vb/widgets/Controls/Button2'
import VbTypography2 from '@/@vb/widgets/Typography/2'
import VbWidgetsGeneral1 from '@/@vb/widgets/WidgetsGeneral/1'
import VbWidgetsGeneral6 from '@/@vb/widgets/WidgetsGeneral/6'
import VbWidgetsGeneral6v1 from '@/@vb/widgets/WidgetsGeneral/6v1'
import VbPlaceholders1 from '@/@vb/widgets/Placeholders/1'
import VbWidgetsLists11 from '@/@vb/widgets/WidgetsLists/11'
import VbWidgetsTables1 from '@/@vb/widgets/WidgetsTables/1'

export default {
  name: 'VbJiraDashboard',
  components: {
    VbHeadersCardHeader2,
    VbControlsButton2,
    VbTypography2,
    VbWidgetsGeneral1,
    VbWidgetsGeneral6,
    VbWidgetsGeneral6v1,
    VbPlaceholders1,
    VbWidgetsLists11,
    VbWidgetsTables1,
  },
}
</script>
