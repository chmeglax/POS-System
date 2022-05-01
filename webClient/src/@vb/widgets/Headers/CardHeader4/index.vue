<template>
  <div class="card-header-flex">
    <div class="d-flex flex-column justify-content-center mr-auto">
      <div class="d-flex flex-row justify-content-center">
        <h5 class="mb-0 mr-2">
          <i :class="data.icon" class="mr-2 font-size-18 text-muted" />
          <strong>{{ data.title }}</strong>
        </h5>
        <span class="text-muted">{{ data.description }}</span>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    data: {
      type: Object,
      default: () => {
        return {
          title: 'Basic page header',
          icon: 'fe fe-phone-call',
          description: 'Some description here...',
        }
      },
    },
  },
}
</script>
