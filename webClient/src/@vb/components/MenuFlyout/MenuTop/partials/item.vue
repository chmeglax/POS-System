<template>
  <li
    :class="{
      [styles.air__menuTop__item]: true,
      [styles.air__menuTop__item__active]: item.key === activeItem,
    }"
  >
    <router-link v-if="item.url" :to="item.url" :class="styles.air__menuTop__link">
      <i
        v-if="item.icon"
        :class="{
          [item.icon]: true,
          [styles.air__menuTop__icon]: true,
        }"
      />
      <span>{{ item.title }}</span>
      <span v-if="item.count" class="badge text-white bg-blue-light float-right mt-1 px-2">{{
        item.count
      }}</span>
    </router-link>
    <a v-if="!item.url" href="javascript: void(0);" :class="styles.air__menuTop__link">
      <i
        v-if="item.icon"
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
  </li>
</template>

<script>
export default {
  name: 'Item',
  props: {
    item: {
      type: Object,
      default: () => {},
    },
    styles: {
      type: Object,
      default: () => {},
    },
    activeItem: {
      type: String,
      default: '',
    },
  },
}
</script>
