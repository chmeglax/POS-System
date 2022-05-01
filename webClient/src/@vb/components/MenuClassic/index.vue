<template>
  <menu-left v-if="settings.menuLayoutType === 'left' && !settings.isMobileView" />
  <menu-top v-if="settings.menuLayoutType === 'top' && !settings.isMobileView" />
  <div v-if="settings.isMobileView">
    <div :class="$style.handler" @click="toggleMobileMenu">
      <div :class="$style.handlerIcon"></div>
    </div>
    <a-drawer
      :closable="false"
      :visible="settings.isMobileMenuOpen"
      placement="left"
      :wrap-class-name="$style.mobileMenu"
      @close="toggleMobileMenu"
    >
      <menu-left />
    </a-drawer>
  </div>
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

    const toggleMobileMenu = () => {
      store.commit('CHANGE_SETTING', {
        setting: 'isMobileMenuOpen',
        value: !settings.value['isMobileMenuOpen'],
      })
    }

    return {
      settings,
      toggleMobileMenu,
    }
  },
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
