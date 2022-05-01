<template>
  <div class="row">
    <div class="col-xl-6 offset-xl-3">
      <div class="text-center" v-for="iconsSet in icons" :key="iconsSet.setName">
        <h3 class="text-block mt-5 mb-4">
          <strong>{{ iconsSet.setName }}</strong>
        </h3>
        <ul class="vb__utils__iconPresent list-unstyled">
          <a-tooltip v-for="icon in iconsSet.icons" :key="icon">
            <template #title> fa {{ icon }} </template>
            <li>
              <i :class="['fa', icon]" />
            </li>
          </a-tooltip>
        </ul>
      </div>
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
