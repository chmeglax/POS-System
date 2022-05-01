<template>
  <div class="pt-4">
    <!-- [TODO_CHARTSIST] -->
    <div class="mb-4">
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
    <div class="d-flex flex-wrap">
      <div class="mr-5">
        <div class="text-nowrap text-uppercase text-gray-4">
          <div :class="[$style.donut, $style.success]" />
          Gross revenue
        </div>
        <div class="font-weight-bold font-size-18 text-dark">+$125,367.36</div>
      </div>
      <div class="mr-5">
        <div class="text-nowrap text-uppercase text-gray-4">
          <div :class="[$style.primary, $style.donut]" />
          Gross Earnings
        </div>
        <div class="font-weight-bold font-size-18 text-dark">+$125,367.36</div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: 'VbChart3',
}
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
