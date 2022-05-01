<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card card-top card-top-primary">
          <div class="card-body"><vb-app-partials-calendar /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbAppPartialsCalendar from '@/@vb/widgets/AppPartials/Calendar'

export default {
  name: 'VbCalendar',
  components: {
    VbAppPartialsCalendar,
  },
}
</script>
