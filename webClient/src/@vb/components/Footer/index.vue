<template>
  <div :class="$style.footer">
    <div :class="$style.footerInner">
      <a
        href="http://www.fst.rnu.tn/"
        target="_blank"
        rel="noopener noreferrer"
        :class="$style.logo"
      >
        <img src="utm.png" :class="$style.logoImage" alt="" srcset="" />
        <img src="favicon.png" :class="$style.logoImage" alt="" srcset="" />
      </a>
      <br />
      <p class="mb-0">
        Copyright © {{ new Date().getFullYear() }}
        <a href="http://www.fst.rnu.tn/" target="_blank" rel="noopener noreferrer"> fst.rnu.tn </a>
      </p>
    </div>
  </div>
</template>

<script>
import { computed } from 'vue'
import { useStore } from 'vuex'
export default {
  setup() {
    const store = useStore()
    const settings = computed(() => store.getters.settings)

    return {
      settings,
    }
  },
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
