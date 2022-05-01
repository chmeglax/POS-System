<template>
  <div>
    <a :class="data.mainType" class="btn mr-2">{{ data.mainTitle }}</a>
    <a class="btn btn-link">{{ data.additionalTitle }}</a>
  </div>
</template>

<script>
export default {
  props: {
    data: {
      type: Object,
      default: () => {
        return {
          mainTitle: 'Save',
          mainType: 'btn-primary',
          additionalTitle: 'Cancel',
        }
      },
    },
  },
}
</script>
