<template>
  <div>
    <a-button :type="data.type">{{ data.title }}</a-button>
  </div>
</template>

<script>
export default {
  props: {
    data: {
      type: Object,
      default: () => {
        return {
          title: 'Save',
          type: 'primary',
        }
      },
    },
  },
}
</script>
