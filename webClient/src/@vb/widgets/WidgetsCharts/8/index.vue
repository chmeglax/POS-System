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
        :data-source="tableData"
        :pagination="false"
        :row-selection="{
          selectedRowKeys: selectedRowKeys,
          onChange: onSelectChange,
        }"
      >
        <template #userName="{ text: user }">
          <div>
            <div>{{ user.name }}</div>
            <div class="text-gray-4">
              {{ user.position }}
            </div>
          </div>
        </template>
        <template #location="{ text }">
          <a href="javascript: void(0);" class="text-blue">{{ text }}</a>
        </template>
        <template #value="{ text }">
          <span class="font-weight-bold">{{ text }}</span>
        </template>
        <template #chart>
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
        </template>
      </a-table>
    </div>
  </div>
</template>
<script>
import tableData from './data.json'

const columns = [
  {
    title: 'Username',
    dataIndex: 'userName',
    slots: { customRender: 'userName' },
  },
  {
    title: 'Location',
    dataIndex: 'location',
    slots: { customRender: 'location' },
  },
  {
    title: 'Value',
    dataIndex: 'value',
    className: 'text-right text-gray-6',
    slots: { customRender: 'value' },
  },
  {
    title: 'Last week profit',
    dataIndex: 'chart',
    className: 'text-right',
    slots: { customRender: 'chart' },
  },
]
export default {
  name: 'VbChart8',
  data: function() {
    return {
      tableData,
      selectedRowKeys: [],
      columns,
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
