<template>
  <div>
    <div class="card-body">
      <div class="text-dark font-size-18 font-weight-bold mb-1">
        Income Progress
      </div>
      <div class="text-gray-6 mb-2">Revenue by location and date</div>
      <div class="font-weight-bold font-size-36 text-dark mb-2">
        $390,012.01
      </div>
      <div class="d-flex align-items-center">
        <div class="bg-gray-4 text-white mr-3" :class="$style.progressIcon">
          <i class="fe fe-menu font-size-18" />
        </div>
        <div class="flex-grow-1">
          <div class="text-dark font-size-18 font-weight-bold text-nowrap mb-2">
            78% from $500,000.00
          </div>
          <div class="progress">
            <div class="progress-bar bg-success" style="width: 70%" />
          </div>
        </div>
      </div>
    </div>
    <!-- [TODO_CHARTSIST] -->
    <div class="p-4">
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
  name: 'VbChart6',
}
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
