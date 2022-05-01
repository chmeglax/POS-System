<template>
  <div class="card-header-flex">
    <div class="d-flex flex-column justify-content-center mr-auto">
      <h5 class="mb-0">
        <strong>{{ data.title }}</strong>
      </h5>
    </div>
    <a-tabs :default-active-key="1" class="vb-tabs-pills">
      <a-tab-pane key="1">
        <template #tab>
          <a class="nav-link" href="javascript: void(0);">History</a>
        </template>
      </a-tab-pane>
      <a-tab-pane key="2">
        <template #tab>
          <a class="nav-link" href="javascript: void(0);">Information</a>
        </template>
      </a-tab-pane>
      <a-tab-pane key="3">
        <template #tab>
          <a class="nav-link" href="javascript: void(0);">Actions</a>
        </template>
      </a-tab-pane>
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
          title: 'Pills',
        }
      },
    },
  },
}
</script>
