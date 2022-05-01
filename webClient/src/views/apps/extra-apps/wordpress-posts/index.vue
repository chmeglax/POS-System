<template>
  <div>
    <div class="row">
      <div class="col-lg-8 col-md-12">
        <div class="card">
          <div class="card-body"><vb-app-partials-wp-post-short /></div>
        </div>
        <div class="card">
          <div class="card-body"><vb-app-partials-wp-post-short /></div>
        </div>
        <div class="card-placeholder">
          <div class="card-body"><vb-controls-pagination /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-widgets-lists-28 /></div>
        </div>
        <div class="card-placeholder">
          <div class="card-body"><vb-widgets-lists-4 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbAppPartialsWpPostShort from '@/@vb/widgets/AppPartials/WpPostShort'
import VbControlsPagination from '@/@vb/widgets/Controls/Pagination'
import VbWidgetsLists28 from '@/@vb/widgets/WidgetsLists/28'
import VbWidgetsLists4 from '@/@vb/widgets/WidgetsLists/4'

export default {
  name: 'VbWordpressPosts',
  components: {
    VbAppPartialsWpPostShort,
    VbControlsPagination,
    VbWidgetsLists28,
    VbWidgetsLists4,
  },
}
</script>
