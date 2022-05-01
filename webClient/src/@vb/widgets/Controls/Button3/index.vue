<template>
  <div>
    <a-button :type="data.mainType" class="mr-4">{{ data.mainTitle }}</a-button>
    <a href="javascript: void(0);" class="vb__utils__link">
      {{ data.additionalTitle }}
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
          mainTitle: 'Update',
          mainType: 'primary',
          additionalTitle: 'Cancel',
        }
      },
    },
  },
}
</script>
