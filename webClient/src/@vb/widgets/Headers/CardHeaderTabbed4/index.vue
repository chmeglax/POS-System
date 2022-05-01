<template>
  <div class="card-header-flex">
    <div class="d-flex flex-column justify-content-center mr-auto">
      <h5 class="mb-0">
        <strong>{{ data.title }}</strong>
      </h5>
    </div>
    <a-tabs :default-active-key="1" class="vb-tabs-bold">
      <a-tab-pane key="1">
        <template #tab>
          <span>
            <i class="fe fe-align-left mr-1" />
            Left
          </span>
        </template>
      </a-tab-pane>
      <a-tab-pane key="2">
        <template #tab>
          <span>
            <i class="fe fe-align-center mr-1" />
            Center
          </span>
        </template>
      </a-tab-pane>
      <a-tab-pane key="3">
        <template #tab>
          <span>
            <i class="fe fe-align-right mr-1" />
            Right
          </span>
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
          title: 'Bold border',
        }
      },
    },
  },
}
</script>
