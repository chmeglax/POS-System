<template>
  <div>
    <div class="font-weight-bold text-dark font-size-24">78,367</div>
    <div>Total Sales</div>
    <!-- [TODO_CHARTSIST] -->
    <div class="pt-4">
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
  name: 'VbChart4',
}
</script>
