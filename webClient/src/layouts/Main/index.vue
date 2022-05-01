<template>
  <div
    :class="{
      vb__layout__grayBackground: settings.isGrayBackground,
    }"
  >
    <a-layout
      :class="{
        vb__layout: true,
        vb__layout__contentMaxWidth: settings.isContentMaxWidth,
        vb__layout__appMaxWidth: settings.isAppMaxWidth,
        vb__layout__squaredBorders: settings.isSquaredBorders,
        vb__layout__cardsShadow: settings.isCardShadow,
        vb__layout__borderless: settings.isBorderless,
      }"
    >
      <vb-variants />
      <vb-sidebar />
      <vb-support-chat />
      <vb-menu-classic v-if="settings.layoutMenu === 'classic'" />
      <vb-menu-flyout v-if="settings.layoutMenu === 'flyout'" />
      <vb-menu-simply v-if="settings.layoutMenu === 'simply'" />
      <a-layout>
        <a-layout-header
          v-if="settings.layoutTopbar === 'v1'"
          :class="{
            vb__layout__header: true,
            vb__layout__fixedHeader: settings.isTopbarFixed,
            vb__layout__headerGray: settings.isGrayTopbar,
            vb__layout__separatedHeader: settings.isTopbarSeparated,
          }"
        >
          <vb-topbar />
        </a-layout-header>
        <vb-breadcrumbs v-if="settings.layoutBreadcrumbs === 'v1'" />
        <vb-breadcrumbs2 v-if="settings.layoutBreadcrumbs === 'v2'" />
        <a-layout-content class="vb__layout__content">
          <router-view v-slot="{ Component }">
            <transition :name="settings.routerAnimation" mode="out-in">
              <component :is="Component" />
            </transition>
          </router-view>
        </a-layout-content>
        <a-layout-footer v-if="settings.layoutFooter === 'v1'">
          <vb-footer />
        </a-layout-footer>
        <a-layout-footer v-if="settings.layoutFooter === 'v2'">
          <vb-footer2 />
        </a-layout-footer>
        <a-layout-footer v-if="settings.layoutFooter === 'v3'">
          <vb-footer3 />
        </a-layout-footer>
        <a-layout-footer v-if="settings.layoutFooter === 'v4'">
          <vb-footer4 />
        </a-layout-footer>
      </a-layout>
    </a-layout>
  </div>
</template>

<script>
import { computed, onMounted, ref } from 'vue'
import { useStore } from 'vuex'
import VbTopbar from '@/@vb/components/Topbar'
import VbSidebar from '@/@vb/components/Sidebar'
import VbSupportChat from '@/@vb/components/SupportChat'
import VbVariants from '@/@vb/components/Variants'
import VbMenuClassic from '@/@vb/components/MenuClassic'
import VbMenuFlyout from '@/@vb/components/MenuFlyout'
import VbMenuSimply from '@/@vb/components/MenuSimply'
import VbBreadcrumbs from '@/@vb/components/Breadcrumbs'
import VbBreadcrumbs2 from '@/@vb/components/Breadcrumbs2'
import VbFooter from '@/@vb/components/Footer'
import VbFooter2 from '@/@vb/components/Footer2'
import VbFooter3 from '@/@vb/components/Footer3'
import VbFooter4 from '@/@vb/components/Footer4'

export default {
  name: 'MainLayout',
  components: {
    VbMenuClassic,
    VbMenuFlyout,
    VbMenuSimply,
    VbTopbar,
    VbSidebar,
    VbSupportChat,
    VbVariants,
    VbBreadcrumbs,
    VbBreadcrumbs2,
    VbFooter,
    VbFooter2,
    VbFooter3,
    VbFooter4,
  },
  setup() {
    const store = useStore()
    const settings = computed(() => store.getters.settings)
    const touchStartPrev = ref(0)
    const touchStartLocked = ref(false)

    const toggleMobileMenu = () => {
      const value = !settings.value.isMobileMenuOpen
      store.commit('CHANGE_SETTING', { setting: 'isMobileMenuOpen', value })
    }

    const setViewPort = (isMobileView = false, isTabletView = false) => {
      store.commit('CHANGE_SETTING', {
        setting: 'isMobileView',
        value: isMobileView,
      })
      store.commit('CHANGE_SETTING', {
        setting: 'isTabletView',
        value: isTabletView,
      })
    }

    // resize viewport events (commit toggleMenu, etc...)
    const detectViewPortListener = () => {
      detectViewPort(false)
    }
    const detectViewPort = (firstLoad = false) => {
      const isMobile = settings.value.isMobileView
      const isTablet = settings.value.isTabletView
      const width = window.innerWidth
      const state = {
        next: {
          mobile: width < 768,
          tablet: width < 992,
          desktop: !(width < 768) && !(width < 992),
        },
        prev: {
          mobile: isMobile,
          tablet: isTablet,
          desktop: !isMobile && !isTablet,
        },
      }
      // desktop
      if (state.next.desktop && (state.next.desktop !== state.prev.desktop || firstLoad)) {
        setViewPort(false, false)
      }
      // tablet & collapse menu
      if (
        state.next.tablet &&
        !state.next.mobile &&
        (state.next.tablet !== state.prev.tablet || firstLoad)
      ) {
        setViewPort(false, true)
        store.commit('CHANGE_SETTING', {
          setting: 'isMenuCollapsed',
          value: true,
        })
      }
      // mobile
      if (state.next.mobile && (state.next.mobile !== state.prev.mobile || firstLoad)) {
        setViewPort(true, false)
      }
    }

    // mobile slide bindings
    const bindMobileSlide = () => {
      // mobile menu touch slide opener
      const unify = e => {
        return e.changedTouches ? e.changedTouches[0] : e
      }
      document.addEventListener(
        'touchstart',
        e => {
          const x = unify(e).clientX
          touchStartPrev.value = x
          touchStartLocked.value = x > 70
        },
        { passive: false },
      )
      document.addEventListener(
        'touchmove',
        e => {
          const x = unify(e).clientX
          const prev = touchStartPrev.value
          if (x - prev > 50 && !touchStartLocked.value) {
            toggleMobileMenu()
            touchStartLocked.value = true
          }
        },
        { passive: false },
      )
    }

    onMounted(() => bindMobileSlide())
    onMounted(() => detectViewPort(true))
    onMounted(() => window.addEventListener('resize', detectViewPortListener))

    return {
      settings,
    }
  },
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
