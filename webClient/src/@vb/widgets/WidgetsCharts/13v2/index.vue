<template>
  <div>
    <div class="card-body">
      <div class="font-weight-bold font-size-36 font-weight-bold text-pink">
        13,846$
      </div>
    </div>
    <div calss="position-relative">
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
  name: 'VbChart13v2',
}
</script>
