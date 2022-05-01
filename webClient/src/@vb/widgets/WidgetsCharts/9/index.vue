<template>
  <div>
    <div>
      <div class="text-dark font-size-18 font-weight-bold mb-1">
        Year Profit
      </div>
      <div class="text-gray-6 mb-2">Revenue by location and date</div>
      <div class="d-flex flex-wrap align-items-center">
        <div class="mr-3 mt-3 mb-3 position-relative">
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
          <div ref="tooltip" class="text-gray-5 font-size-28" :class="$style.tooltip" />
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: 'VbChart9',
}
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
