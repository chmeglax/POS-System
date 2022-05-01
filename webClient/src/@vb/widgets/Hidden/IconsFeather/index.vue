<template>
  <div class="row">
    <div class="col-xl-6 offset-xl-3">
      <h3 class="text-block mt-5 mb-4 text-center">
        <strong>General Icons</strong>
      </h3>
      <ul class="vb__utils__iconPresent list-unstyled">
        <a-tooltip v-for="icon in icons" :key="icon">
          <template #title> fe {{ icon }} </template>
          <li>
            <i :class="['fe', icon]" />
          </li>
        </a-tooltip>
      </ul>
    </div>
  </div>
</template>
<script>
import icons from './data.json'
export default {
  data: function() {
    return {
      icons,
    }
  },
}
</script>
