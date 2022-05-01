<template>
  <div>
    <a :class="data.mainType" class="btn mr-2">
      <i :class="data.mainIcon" class="mr-2" />
      {{ data.mainTitle }}
    </a>
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
          mainTitle: 'Unlock Account',
          mainIcon: 'fe fe-lock',
          mainType: 'btn-success',
          additionalTitle: 'Cancel',
        }
      },
    },
  },
}
</script>
