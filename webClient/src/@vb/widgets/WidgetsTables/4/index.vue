<template>
  <div>
    <div :class="$style.head">
      <div :class="$style.headItem" class="mb-3 pr-3">
        <div :class="$style.headIcon" class="bg-light text-dark mr-3">
          <i class="fe fe-menu font-size-18" />
        </div>
        <div>
          <div class="text-uppercase text-muted text-nowrap">
            Cross Earnings
          </div>
          <div class="font-weight-bold text-dark">+125,367.36</div>
        </div>
      </div>
      <div :class="$style.headItem" class="mb-3">
        <div :class="$style.headIcon" class="bg-light text-dark mr-3">
          <i class="fe fe-cloud font-size-18" />
        </div>
        <div>
          <div class="text-uppercase text-muted text-nowrap">Tax witheld</div>
          <div class="font-weight-bold text-dark">-$12,350.00</div>
        </div>
      </div>
    </div>
    <div class="table-responsive text-nowrap">
      <a-table :columns="columns" :data-source="data" :pagination="false">
        <template #location="{ text }">
          <a href="javascript: void(0);" class="text-blue">{{ text }}</a>
        </template>
        <template #value="{ text }">
          <span class="font-weight-bold">{{ text }}</span>
        </template>
      </a-table>
    </div>
  </div>
</template>
<script>
import data from './data.json'
const columns = [
  {
    title: 'ACTION NAME',
    dataIndex: 'actionName',
    class: 'bg-transparent text-gray-6',
  },
  {
    title: 'LOCATION',
    dataIndex: 'location',
    class: 'bg-transparent text-gray-6',
    slots: { customRender: 'location' },
  },
  {
    title: 'PHONE',
    dataIndex: 'phone',
    key: 'phone',
    class: 'text-left text-gray-6 bg-transparent',
  },
  {
    title: 'VALUE',
    dataIndex: 'value',
    class: 'text-right bg-transparent text-gray-6',
    slots: { customRender: 'value' },
  },
]

export default {
  name: 'VbTable4',
  data: function() {
    return {
      columns,
      data,
    }
  },
}
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
