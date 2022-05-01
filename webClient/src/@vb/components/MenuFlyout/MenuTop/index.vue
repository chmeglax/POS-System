<template>
  <div>
    <transition-group name="air__menuFlyout__animation" :duration="1">
      <template v-for="(item, index) in renderedFlyoutItems" :key="index">
        <div
          :style="{
            left: `${item.itemDimensions.left + item.itemDimensions.width / 2}px`,
            top: `${item.itemDimensions.top + item.itemDimensions.height}px`,
          }"
          :class="{
            [$style.air__menuFlyout]: true,
            [$style.air__menuFlyoutTop]: settings.menuLayoutType === 'top',
            [$style.air__menuFlyout__black]: settings.flyoutMenuColor === 'dark',
            [$style.air__menuFlyout__white]: settings.flyoutMenuColor === 'white',
            [$style.air__menuFlyout__gray]: settings.flyoutMenuColor === 'gray',
          }"
        >
          <ul
            :class="$style.air__menuTop__list"
            @mouseenter="handleFlyoutContainerOver(item.key)"
            @mouseleave="handleFlyoutOut(item.key)"
          >
            <template v-for="(menuItem, menuItemIndex) in item.items" :key="menuItemIndex">
              <item :item="menuItem" :styles="$style" :active-item="activeItem" />
            </template>
          </ul>
        </div>
      </template>
    </transition-group>
    <div
      :class="{
        [$style.air__menuTop]: true,
        [$style.air__menuTop__mobileToggled]: settings.isMobileMenuOpen,
        [$style.air__menuTop__toggled]: settings.isMenuCollapsed,
        [$style.air__menuTop__unfixed]: settings.isMenuUnfixed,
        [$style.air__menuTop__shadow]: settings.isMenuShadow,
        [$style.air__menuTop__flyout]: settings.menuType === 'flyout',
        [$style.air__menuTop__compact]: settings.menuType === 'compact',
        [$style.air__menuTop__blue]: settings.menuColor === 'blue',
        [$style.air__menuTop__white]: settings.menuColor === 'white',
        [$style.air__menuTop__gray]: settings.menuColor === 'gray',
        [$style.air__menuFlyout__black]:
          settings.flyoutMenuColor === 'dark' && settings.menuType !== 'default',
        [$style.air__menuFlyout__white]:
          settings.flyoutMenuColor === 'white' && settings.menuType !== 'default',
        [$style.air__menuFlyout__gray]:
          settings.flyoutMenuColor === 'gray' && settings.menuType !== 'default',
      }"
    >
      <div :class="$style.air__menuTop__outer">
        <a
          href="javascript: void(0);"
          :class="$style.air__menuTop__mobileToggleButton"
          @click="toggleMobileMenu"
        >
          <span />
        </a>
        <div :class="$style.air__menuTop__logo">
          <div :class="$style.air__menuTop__logo__letter">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              viewBox="0 0 24 24"
              version="1.1"
              height="24px"
              width="24px"
            >
              <g>
                <path
                  fill="#4b7cf3"
                  strokeWidth="1"
                  stroke="#4b7cf3"
                  d="M12,10.9c-0.1,0-0.2,0-0.2-0.1L3.5,6.1C3.4,6,3.3,5.8,3.3,5.6c0-0.2,0.1-0.3,0.2-0.4l8.2-4.7c0.2-0.1,0.3-0.1,0.5,0      l8.2,4.7c0.2,0.1,0.2,0.3,0.2,0.4S20.6,6,20.5,6.1l-8.2,4.7C12.2,10.8,12.1,10.9,12,10.9z M4.8,5.6L12,9.8l7.2-4.2L12,1.5      L4.8,5.6z"
                />
                <path
                  fill="#4b7cf3"
                  strokeWidth="1"
                  stroke="#4b7cf3"
                  d="M13.6,23.6c-0.1,0-0.2,0-0.2-0.1c-0.2-0.1-0.2-0.3-0.2-0.4v-9.5c0-0.2,0.1-0.3,0.2-0.4l8.2-4.7c0.2-0.1,0.3-0.1,0.5,0      c0.2,0.1,0.2,0.3,0.2,0.4v9.5c0,0.2-0.1,0.3-0.3,0.4l-8.2,4.7C13.8,23.6,13.7,23.6,13.6,23.6z M14.1,13.9v8.3l7.2-4.2V9.8      L14.1,13.9z"
                />
                <path
                  fill="#4b7cf3"
                  strokeWidth="1"
                  stroke="#4b7cf3"
                  d="M10.4,23.6c-0.1,0-0.2,0-0.2-0.1l-8.2-4.7c-0.2-0.1-0.3-0.3-0.3-0.4V8.9c0-0.2,0.1-0.3,0.2-0.4c0.2-0.1,0.3-0.1,0.5,0      l8.2,4.7c0.2,0.1,0.2,0.3,0.2,0.4v9.5c0,0.2-0.1,0.3-0.2,0.4C10.5,23.6,10.5,23.6,10.4,23.6z M2.7,18.1l7.2,4.2v-8.3L2.7,9.8      V18.1z"
                />
              </g>
            </svg>
          </div>
          <div :class="$style.air__menuTop__logo__name">
            {{ settings.logo }}
          </div>
          <div :class="$style.air__menuTop__logo__descr">
            {{ settings.version }}
          </div>
        </div>
        <div :class="$style.air__menuTop__scroll">
          <div :class="$style.air__menuTop__container">
            <ul :class="$style.air__menuTop__list">
              <template v-for="(item, index) in menuData">
                <item
                  v-if="!item.children && !item.category"
                  :key="index"
                  :item="item"
                  :styles="$style"
                  :active-item="activeItem"
                />
                <sub-menu
                  v-if="item.children"
                  :key="index"
                  :item="item"
                  :styles="$style"
                  :active-item="activeItem"
                  :active-submenu="activeSubmenu"
                  :handle-submenu-click="handleSubmenuClick"
                  :handle-flyout-over="handleFlyoutOver"
                  :handle-flyout-out="handleFlyoutOut"
                />
              </template>
            </ul>
          </div>
        </div>
      </div>
    </div>
    <a
      href="javascript: void(0);"
      :class="$style.air__menuTop__backdrop"
      @click="toggleMobileMenu"
    />
  </div>
</template>

<script>
import { ref, onMounted, computed, watch } from 'vue'
import { useStore } from 'vuex'
import { useRoute } from 'vue-router'
import _ from 'lodash'
import { getMenuData } from '@/services/menu'
import SubMenu from './partials/submenu'
import Item from './partials/item'

export default {
  name: 'MenuLeft',
  components: { SubMenu, Item },
  setup() {
    const store = useStore()
    const route = useRoute()
    const menuData = computed(() => getMenuData)
    const activeSubmenu = ref('')
    const activeItem = ref('')
    const renderedFlyoutItems = ref({})
    const flyoutTimers = ref({})
    const settings = computed(() => store.getters.settings)
    const pathname = computed(() => route.path)
    const flyoutActive = computed(() => {
      return !settings.value.isMobileView
    })

    const toggleMobileMenu = () => {
      const setting = 'isMobileMenuOpen'
      const value = !settings.value[setting]
      store.commit('CHANGE_SETTING', { setting, value })
    }

    const toggleMenu = () => {
      const setting = 'isMenuCollapsed'
      const value = !settings.value[setting]
      store.commit('CHANGE_SETTING', { setting, value })
    }

    const toggleSettings = () => {
      const setting = 'isSidebarOpen'
      const value = !settings.value[setting]
      store.commit('CHANGE_SETTING', { setting, value })
    }

    const handleSubmenuClick = key => {
      const currentKey = activeSubmenu.value
      if (flyoutActive.value) {
        return
      }
      activeSubmenu.value = currentKey === key ? '' : key
    }

    const setActiveItems = () => {
      const flattenItems = (items, key) =>
        items.reduce((flattenedItems, item) => {
          flattenedItems.push(item)
          if (Array.isArray(item[key])) {
            return flattenedItems.concat(flattenItems(item[key], key))
          }
          return flattenedItems
        }, [])
      const selectedItem =
        _.find(flattenItems(menuData.value, 'children'), ['url', pathname.value]) || {}
      const selectedSubmenu = menuData.value.reduce((key, parent) => {
        if (Array.isArray(parent.children)) {
          parent.children.map(child => {
            if (child.key === selectedItem.key) {
              key = parent
            }
            return ''
          })
        }
        return key
      })

      activeItem.value = selectedItem.key
      activeSubmenu.value = selectedSubmenu.key
    }

    const handleFlyoutOver = (event, key, items) => {
      if (flyoutActive.value) {
        clearInterval(flyoutTimers.value[key])
        const item = event.currentTarget
        const itemDimensions = item.getBoundingClientRect()
        renderedFlyoutItems.value = {
          ...renderedFlyoutItems.value,
          [key]: {
            key,
            itemDimensions,
            items,
          },
        }
      }
    }

    const handleFlyoutOut = key => {
      if (flyoutActive.value) {
        flyoutTimers.value[key] = setTimeout(() => {
          const updatedFlyoutItems = Object.assign({}, renderedFlyoutItems.value)
          delete updatedFlyoutItems[key]
          renderedFlyoutItems.value = {
            ...updatedFlyoutItems,
          }
        }, 100)
      }
    }

    const handleFlyoutContainerOver = key => {
      clearInterval(flyoutTimers.value[key])
    }

    onMounted(setActiveItems)
    watch(pathname, () => setActiveItems())

    return {
      menuData,
      activeSubmenu,
      activeItem,
      renderedFlyoutItems,
      flyoutTimers,
      settings,
      flyoutActive,
      toggleMobileMenu,
      toggleMenu,
      toggleSettings,
      handleSubmenuClick,
      handleFlyoutOver,
      handleFlyoutOut,
      handleFlyoutContainerOver,
    }
  },
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
