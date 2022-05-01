<template>
  <div>
    <div class="text-dark font-size-18 font-weight-bold mb-1">Year Profit</div>
    <div class="text-gray-6 mb-2">Revenue by location and date</div>
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
  name: 'VbChart5',
}
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
