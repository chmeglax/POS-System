<template>
  <div>
    <div class="row">
      <div class="col-lg-8 col-md-12">
        <div class="card">
          <div class="card-body"><vb-app-partials-wp-post /></div>
        </div>
        <div class="card">
          <div class="card-body"><vb-widgets-general-15 /></div>
        </div>
        <div class="card">
          <div class="card-body"><vb-app-partials-wp-write /></div>
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
import VbAppPartialsWpPost from '@/@vb/widgets/AppPartials/WpPost'
import VbWidgetsGeneral15 from '@/@vb/widgets/WidgetsGeneral/15'
import VbAppPartialsWpWrite from '@/@vb/widgets/AppPartials/WpWrite'
import VbWidgetsLists28 from '@/@vb/widgets/WidgetsLists/28'
import VbWidgetsLists4 from '@/@vb/widgets/WidgetsLists/4'

export default {
  name: 'VbWordpressPost',
  components: {
    VbAppPartialsWpPost,
    VbWidgetsGeneral15,
    VbAppPartialsWpWrite,
    VbWidgetsLists28,
    VbWidgetsLists4,
  },
}
</script>
