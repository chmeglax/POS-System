<template>
  <div class="vb__utils__heading">
    <strong>
      {{ data.title }}
    </strong>
    <div class="text-muted font-size-15">{{ data.description }}</div>
  </div>
</template>

<script>
export default {
  props: {
    data: {
      type: Object,
      default: () => {
        return {
          title: 'Header with description',
          description:
            'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.',
        }
      },
    },
  },
}
</script>
