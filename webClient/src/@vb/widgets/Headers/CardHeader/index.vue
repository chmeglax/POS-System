<template>
  <h5 class="mb-0">
    <strong>{{ data.title }}</strong>
  </h5>
</template>

<script>
export default {
  props: {
    data: {
      type: Object,
      default: () => {
        return {
          title: 'Basic header',
        }
      },
    },
  },
}
</script>
