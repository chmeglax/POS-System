<template>
  <div :class="$style.topbar">
    <div class="mr-4">
      <vb-fav-pages />
    </div>
    <div class="mr-auto mr-md-1"></div>
    <div class="mr-4 d-none d-md-block"></div>
    <div class="mr-auto d-xl-block d-none"></div>
    <div class="mr-3 d-none d-sm-block ml-auto"></div>
    <div class="mr-3 d-none d-sm-block"></div>
    <div class="mr-3 d-none d-sm-block"></div>
    <div>
      <vb-user-menu />
    </div>
  </div>
</template>

<script>
import VbUserMenu from './UserMenu'
import VbFavPages from './FavPages'

export default {
  components: {
    VbUserMenu,
    VbFavPages,
  },
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
