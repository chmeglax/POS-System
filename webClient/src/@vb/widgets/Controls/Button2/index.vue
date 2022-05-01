<template>
  <div>
    <a-button :type="data.type" class="btn-with-addon">
      <span class="btn-addon">
        <i :class="data.icon" class="btn-addon-icon" />
      </span>
      {{ data.title }}
    </a-button>
  </div>
</template>

<script>
export default {
  props: {
    data: {
      type: Object,
      default: () => {
        return {
          title: 'New Request',
          icon: 'fe fe-plus-circle',
          type: 'primary',
        }
      },
    },
  },
}
</script>
