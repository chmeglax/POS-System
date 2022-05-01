<template>
  <div>
    <div class="d-flex flex-wrap mb-3">
      <div :class="$style.item">
        <div class="font-size-18 text-dark font-weight-bold">
          +$12,367.36
          <span class="text-success font-size-12 align-text-top">+25%</span>
        </div>
        <div class="text-uppercase text-gray-4">Total sales</div>
      </div>
      <div :class="$style.item">
        <div class="font-size-18 text-dark font-weight-bold">
          +$5,367.36
          <span class="text-danger font-size-12 align-text-top">-76%</span>
        </div>
        <div class="text-uppercase text-gray-4">Avg. Per Day</div>
      </div>
    </div>
    <!-- [TODO_CHARTSIST] -->
    <div>
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
  name: 'VbChart1',
}
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
