<template>
  <div class="card-body position-relative overflow-hidden">
    <div class="font-size-36 font-weight-bold text-dark line-height-1 mt-2">
      {{ name }}
    </div>
    <div class="text-uppercase mb-1">{{ post }}</div>
  </div>
</template>
<script>
export default {
  name: 'VbChart11',
  props: {
    name: String,
    post: String,
  },
}
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
