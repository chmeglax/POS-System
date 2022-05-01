<template>
  <div>
    <div class="mb-2" :class="$style.textDivider">
      <h4 class="font-size-24 font-weight-bold" :class="$style.textDividerContent">
        Waiting actions
      </h4>
    </div>
    <div class="table-responsive text-nowrap">
      <a-table
        :columns="columns"
        :data-source="data"
        :pagination="false"
        :row-selection="{
          selectedRowKeys: selectedRowKeys,
          onChange: onSelectChange,
        }"
      >
        <template #location="{ text }">
          <a href="javascript: void(0);" class="text-blue">{{ text }}</a>
        </template>
        <template #value="{ text }">
          <span class="font-weight-bold">{{ text }}</span>
        </template>
        <template #users="{ text: users }">
          <div :class="[users.length ? '' : 'd-none', 'vb__utils__avatarGroup']">
            <div
              v-for="user in users"
              :key="user"
              class="vb__utils__avatar vb__utils__avatar--rounded"
            >
              <img :src="user" alt="User" />
            </div>
            <button type="button" class="vb__utils__avatarGroupAdd">
              <i class="fe fe-plus" />
            </button>
          </div>
        </template>
        <template #action>
          <div class="text-nowrap">
            <button type="button" class="btn btn-outline-success mr-2 mb-2">
              Accept
            </button>
          </div>
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
    className: 'text-gray-6',
  },
  {
    title: 'LOCATION',
    dataIndex: 'location',
    className: 'text-gray-6',
    slots: { customRender: 'location' },
  },
  {
    title: 'VALUE',
    dataIndex: 'value',
    className: 'text-gray-6',
    slots: { customRender: 'value' },
  },
  {
    title: 'DESCRIPTION',
    dataIndex: 'description',
    className: 'text-gray-6',
  },
  {
    dataIndex: 'users',
    slots: { customRender: 'users' },
  },
  {
    dataIndex: 'action',
    className: 'text-right',
    slots: { customRender: 'action' },
  },
]

export default {
  name: 'VbTable7',
  data: function() {
    return {
      columns,
      data,
      selectedRowKeys: [],
    }
  },
  methods: {
    onSelectChange(selectedRowKeys) {
      this.selectedRowKeys = selectedRowKeys
    },
  },
}
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
