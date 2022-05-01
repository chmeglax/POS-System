<template>
  <li
    :class="{
      [styles.air__menuTop__item]: true,
      [styles.air__menuTop__submenu]: true,
      [styles.air__menuTop__submenu__active]: item.key === activeSubmenu,
    }"
  >
    <a
      href="javascript: void(0);"
      :class="styles.air__menuTop__link"
      @click="() => handleSubmenuClick(item.key)"
      @mouseenter="event => handleFlyoutOver(event, item.key, item.children)"
      @mouseleave="handleFlyoutOut(item.key)"
    >
      <i
        :class="{
          [item.icon]: true,
          [styles.air__menuTop__icon]: true,
        }"
      />
      <span>{{ item.title }}</span>
      <span v-if="item.count" class="badge text-white bg-blue-light float-right mt-1 px-2">{{
        item.count
      }}</span>
    </a>
    <ul :class="styles.air__menuTop__list">
      <template v-for="(menuItem, index) in item.children">
        <item
          v-if="!menuItem.children && !menuItem.category"
          :key="index"
          :item="menuItem"
          :styles="styles"
          :active-item="activeItem"
        />
      </template>
    </ul>
  </li>
</template>

<script>
import Item from './item'

export default {
  name: 'SubMenu',
  components: { Item },
  props: {
    item: {
      type: Object,
      default: () => {},
    },
    styles: {
      type: Object,
      default: () => {},
    },
    activeSubmenu: {
      type: String,
      default: '',
    },
    activeItem: {
      type: String,
      default: '',
    },
    handleSubmenuClick: {
      type: Function,
      default: () => {},
    },
    handleFlyoutOver: {
      type: Function,
      default: () => {},
    },
    handleFlyoutOut: {
      type: Function,
      default: () => {},
    },
  },
}
</script>
