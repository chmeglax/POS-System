<template>
  <a-layout class="vb__layout">
    <a-layout-content>
      <vb-sidebar />
      <div
        :class="{
          [$style.container]: true,
          vb__layout__squaredBorders: settings.isSquaredBorders,
          vb__layout__cardsShadow: settings.isCardShadow,
          vb__layout__borderless: settings.isBorderless,
          [$style.white]: settings.authPagesColor === 'white',
          [$style.gray]: settings.authPagesColor === 'gray',
        }"
        :style="{
          backgroundImage:
            settings.authPagesColor === 'image'
              ? `url(resources/images/content/photos/8.jpeg)`
              : 'none',
        }"
      >
        <div
          :class="{
            [$style.topbar]: true,
            [$style.topbarGray]: settings.isGrayTopbar,
          }"
        >
          <div :class="$style.logoContainer">
            <div :class="$style.logo">
              <img src="favicon.png" :class="$style.logoImage" alt="" srcset="" />
            </div>
          </div>
          <div class="d-none d-sm-block">
            <div :class="$style.logoContainer">
              <div :class="$style.logo">
                <img src="utm.png" :class="$style.right" alt="" srcset="" />
              </div>
            </div>
          </div>
        </div>
        <div class="mb-5">
          <router-view v-slot="{ Component }">
            <transition :name="settings.routerAnimation" mode="out-in">
              <component :is="Component" />
            </transition>
          </router-view>
        </div>
      </div>
    </a-layout-content>
  </a-layout>
</template>

<script>
import { mapState } from 'vuex'
import VbSidebar from '@/@vb/components/Sidebar'
import VbSupportChat from '@/@vb/components/SupportChat'

export default {
  name: 'AuthLayout',
  components: { VbSidebar, VbSupportChat },
  computed: mapState(['settings']),
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
