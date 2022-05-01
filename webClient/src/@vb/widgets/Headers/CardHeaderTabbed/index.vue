<template>
  <div class="card-header-flex">
    <div class="d-flex flex-column justify-content-center mr-auto">
      <h5 class="mb-0">
        <strong>{{ data.title }}</strong>
      </h5>
    </div>
    <a-tabs :default-active-key="1" class="vb-tabs">
      <a-tab-pane key="1" tab="History" />
      <a-tab-pane key="2" tab="Information" />
      <a-tab-pane key="3" tab="Actions" />
    </a-tabs>
  </div>
</template>

<script>
export default {
  props: {
    data: {
      type: Object,
      default: () => {
        return {
          title: 'Basic',
        }
      },
    },
  },
}
</script>
