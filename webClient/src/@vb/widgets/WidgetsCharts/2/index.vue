<template>
  <div class="position-relative">
    <div class="card-body">
      <div class="text-dark font-size-18 font-weight-bold mb-1">
        Year Profit
      </div>
      <div class="text-gray-6 mb-2">Revenue by location and date</div>
      <div class="font-weight-bold font-size-36 text-dark">$437,246.00</div>
    </div>
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
</template>
<script>
export default {
  name: 'VbChart2',
}
</script>
