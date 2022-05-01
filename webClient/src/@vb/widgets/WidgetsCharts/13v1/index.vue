<template>
  <div>
    <div class="card-body">
      <div class="font-weight-bold font-size-36 font-weight-bold text-success">
        12,255Gb
      </div>
    </div>
    <div class="position-relative">
      <!-- [TODO_CHARTSIST] -->
      <div class="px-4 pb-4 pt-0">
        <a-alert message="Chart is disabled" type="info" show-icon>
          <template #description
            >The "v-chartist" plugin has not yet migrated to Vue3.
            <a
              href="https://github.com/lakb248/vue-chartist"
              target="_blank"
              rel="noopener noreferrer"
              class="vb__utils__link"
              >Visit github repository for details</a
            ></template
          >
        </a-alert>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: 'VbChart13v1',
}
</script>
