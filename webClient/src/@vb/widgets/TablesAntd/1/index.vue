<template>
  <div class="table-responsive text-nowrap">
    <a-table
      :columns="columns"
      :data-source="data"
      :row-selection="{
        selectedRowKeys: selectedRowKeys,
        onChange: onSelectChange,
      }"
    >
      <template #favorites="{ text: value }">
        <i :class="[value ? 'icmn-star-full text-warning' : 'icmn-star-full text-default']" />
      </template>
      <template #from="{ text }">
        <a href="javascript: void(0);">{{ text }}</a>
      </template>
      <template #attachments="{ text: value }">
        <i v-if="value === true" class="icmn-attachment text-default" />
      </template>
    </a-table>
  </div>
</template>

<script>
import { ref } from 'vue'
import data from './data.json'

const columns = [
  {
    title: '',
    dataIndex: 'favorites',
    slots: { customRender: 'favorites' },
  },
  {
    title: 'From',
    dataIndex: 'from',
    sorter: (a, b) => a.from.length - b.from.length,
    slots: { customRender: 'from' },
  },
  {
    title: 'Message',
    dataIndex: 'message',
  },
  {
    title: '',
    dataIndex: 'attachments',
    slots: { customRender: 'attachments' },
  },
  {
    title: '',
    dataIndex: 'time',
  },
]

export default {
  setup() {
    const selectedRowKeys = ref([])
    const onSelectChange = keys => {
      selectedRowKeys.value = keys
    }

    return {
      selectedRowKeys,
      onSelectChange,
      columns,
      data,
    }
  },
}
</script>
