<template>
  <menu-left v-if="settings.menuLayoutType === 'left'" />
  <menu-top v-if="settings.menuLayoutType === 'top'" />
</template>

<script>
import { computed } from 'vue'
import { useStore } from 'vuex'
import MenuLeft from './MenuLeft'
import MenuTop from './MenuTop'

export default {
  components: { MenuTop, MenuLeft },
  setup() {
    const store = useStore()
    const settings = computed(() => store.getters.settings)

    return {
      settings,
    }
  },
}
</script>
