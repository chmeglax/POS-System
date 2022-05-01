<template>
  <div class="table-responsive text-nowrap">
    <a-table :columns="columns" :data-source="data" :pagination="false">
      <template #progress="{ text: bar }">
        <div class="progress">
          <div
            :class="['progress-bar', bar.color]"
            :style="{ width: bar.value + '%' }"
            role="progressbar"
          />
        </div>
      </template>
      <template #value="{ text }">
        <span class="font-weight-bold">{{ text }}</span>
      </template>
    </a-table>
  </div>
</template>
<script>
import data from './data.json'
const columns = [
  {
    title: 'ACTION NAME',
    dataIndex: 'actionName',
    className: 'bg-transparent text-gray-6',
  },
  {
    title: 'PROGRESS',
    dataIndex: 'progress',
    className: 'text-right bg-transparent text-gray-6',
    slots: { customRender: 'progress' },
  },
  {
    title: 'VALUE',
    dataIndex: 'value',
    className: 'text-right bg-transparent text-gray-6',
    slots: { customRender: 'value' },
  },
]

export default {
  name: 'VbTable1',
  data: function() {
    return {
      columns,
      data,
    }
  },
}
</script>
