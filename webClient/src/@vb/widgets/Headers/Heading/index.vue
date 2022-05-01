<template>
  <div class="vb__utils__heading">
    <strong>
      {{ data.title }}
    </strong>
  </div>
</template>

<script>
export default {
  props: {
    data: {
      type: Object,
      default: () => {
        return { title: 'hello' }
      },
    },
  },
}
</script>
