<template>
  <div :class="$style.vb__sidebar__fixColorPicker">
    <template v-for="item in colors" :key="item">
      <a
        href="javascript: void(0);"
        :class="{
          [$style.vb__sidebar__select__item]: true,
          [$style.vb__sidebar__select__item__active]: value === item,
          [$style.vb__sidebar__select__item__black]: item === 'dark',
          [$style.vb__sidebar__select__item__white]: item === 'white',
          [$style.vb__sidebar__select__item__gray]: item === 'gray',
          [$style.vb__sidebar__select__item__blue]: item === 'blue',
          [$style.vb__sidebar__select__item__img]: item === 'image',
        }"
        @click="colorPickerHandler(setting, item)"
      />
    </template>
  </div>
</template>

<script>
export default {
  props: {
    setting: {
      type: String,
      default: '',
    },
    value: {
      type: String,
      default: '',
    },
    colors: {
      type: Array,
      default: () => [],
    },
  },
  methods: {
    colorPickerHandler(setting, value) {
      this.$store.commit('CHANGE_SETTING', { setting, value })
    },
  },
}
</script>

<style lang="scss" module>
@import '../style.module.scss';
</style>
