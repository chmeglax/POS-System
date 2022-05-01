<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card card-top card-top-primary">
          <div class="card-body"><vb-app-partials-gallery /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbAppPartialsGallery from '@/@vb/widgets/AppPartials/Gallery'

export default {
  name: 'VbGallery',
  components: {
    VbAppPartialsGallery,
  },
}
</script>
