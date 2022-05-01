<template>
  <div>
    <div class="table-responsive text-nowrap">
      <a-table :columns="columns" :data-source="data" :pagination="false">
        <template #description="{ text }">
          <div class="text-wrap width-300">
            <div class="text-dark mb-3">
              {{ text.title }}
            </div>
            <div>{{ text.content }}</div>
          </div>
        </template>
        <template #location="{ text }">
          <a href="javascript: void(0);" class="text-blue">{{ text }}</a>
        </template>
        <template #value="{ text }">
          <span class="font-weight-bold">{{ text }}</span>
        </template>
      </a-table>
    </div>
    <div class="mt-4 d-flex align-items-center flex-wrap">
      <button type="button" class="btn btn-primary mr-2 mb-2">Save</button>
      <a href="javascript: void(0);" class="btn btn-link mb-2">Cancel</a>
    </div>
  </div>
</template>
<script>
import data from './data.json'
const columns = [
  {
    title: 'DESCRIPTION',
    dataIndex: 'description',
    className: 'bg-transparent text-gray-6',
    slots: { customRender: 'description' },
  },
  {
    title: 'LOCATION',
    dataIndex: 'location',
    className: 'text-right bg-transparent text-gray-6',
    slots: { customRender: 'location' },
  },
  {
    title: 'VALUE',
    dataIndex: 'value',
    className: 'text-right bg-transparent  text-gray-6',
    slots: { customRender: 'value' },
  },
]

export default {
  name: 'VbTable2',
  data: function() {
    return {
      columns,
      data,
    }
  },
}
</script>
