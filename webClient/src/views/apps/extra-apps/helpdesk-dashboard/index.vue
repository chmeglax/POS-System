<template>
  <div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-general-2 /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-general-2v1 /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-general-2v2 /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-4 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-lists-20 /></div>
        </div>
      </div>
      <div class="col-lg-8 col-md-12">
        <div class="card">
          <div class="card-body"><vb-widgets-tables-4 /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card">
          <div class="card-body"><vb-widgets-tables-7 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbWidgetsGeneral2 from '@/@vb/widgets/WidgetsGeneral/2'
import VbWidgetsGeneral2v1 from '@/@vb/widgets/WidgetsGeneral/2v1'
import VbWidgetsGeneral2v2 from '@/@vb/widgets/WidgetsGeneral/2v2'
import VbWidgetsLists20 from '@/@vb/widgets/WidgetsLists/20'
import VbWidgetsTables4 from '@/@vb/widgets/WidgetsTables/4'
import VbWidgetsTables7 from '@/@vb/widgets/WidgetsTables/7'

export default {
  name: 'VbHelpdeskDashboard',
  components: {
    VbWidgetsGeneral2,
    VbWidgetsGeneral2v1,
    VbWidgetsGeneral2v2,
    VbWidgetsLists20,
    VbWidgetsTables4,
    VbWidgetsTables7,
  },
}
</script>
