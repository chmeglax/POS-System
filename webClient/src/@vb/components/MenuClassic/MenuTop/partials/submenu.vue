<template>
  <a-sub-menu :key="menuInfo.key" v-bind="$props">
    <template #title>
      <span>
        <i v-if="menuInfo.icon" :class="[styles.icon, menuInfo.icon]" />
        <span :class="styles.title">{{ menuInfo.title }}</span>
        <span v-if="menuInfo.count" class="badge badge-success ml-2">{{ menuInfo.count }}</span>
      </span>
    </template>
    <template v-for="item in menuInfo.children">
      <item
        v-if="!item.children && !item.divider"
        :key="item.key"
        :menu-info="item"
        :styles="styles"
      />
      <sub-menu v-if="item.children" :key="item.key" :menu-info="item" :styles="styles" />
    </template>
  </a-sub-menu>
</template>

<script>
import { Menu } from 'ant-design-vue'
import Item from './item'

export default {
  name: 'SubMenu',
  components: { Item },
  isSubMenu: true,
  props: {
    ...Menu.SubMenu.props,
    menuInfo: {
      type: Object,
      default: () => {},
    },
    styles: {
      type: Object,
      default: () => {},
    },
  },
}
</script>
