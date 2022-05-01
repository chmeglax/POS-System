<template>
  <li :class="styles.air__menuLeft__category">
    <span>{{ item.title }}</span>
  </li>
</template>

<script>
export default {
  name: 'Category',
  props: {
    item: {
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
