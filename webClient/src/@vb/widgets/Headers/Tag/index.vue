<template>
  <div class="badge badge-example">{{ data.title }}</div>
</template>

<script>
export default {
  props: {
    data: {
      type: Object,
      default: () => {
        return { title: 'Tag' }
      },
    },
  },
}
</script>
