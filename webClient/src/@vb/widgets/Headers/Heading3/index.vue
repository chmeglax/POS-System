<template>
  <div class="vb__utils__heading">
    <strong class="mr-3">
      {{ data.title }}
    </strong>
    <a :href="data.url" class="btn btn-light" target="_blank" rel="noopener noreferrer">
      <span>{{ data.button }}</span>
    </a>
  </div>
</template>

<script>
export default {
  props: {
    data: {
      type: Object,
      default: () => {
        return {
          title: 'Header with button',
          button: 'View All',
          url: '/',
        }
      },
    },
  },
}
</script>
