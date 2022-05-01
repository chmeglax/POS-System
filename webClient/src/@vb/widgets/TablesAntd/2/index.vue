<template>
  <div class="table-responsive text-nowrap">
    <a-table :columns="columns" :data-source="data">
      <template #filterDropdown="{ setSelectedKeys, selectedKeys, confirm, clearFilters, column }">
        <div class="custom-filter-dropdown">
          <a-input
            :placeholder="`recherche ${column.dataIndex}`"
            :value="selectedKeys[0]"
            style="width: 188px; margin-bottom: 8px; display: block"
            @change="(e) => setSelectedKeys(e.target.value ? [e.target.value] : [])"
            @pressEnter="() => handleSearch(selectedKeys, confirm)"
          />
          <a-button
            type="primary"
            size="small"
            style="width: 90px; margin-right: 8px"
            @click="() => handleSearch(selectedKeys, confirm)"
            >Search</a-button
          >
          <a-button size="small" style="width: 90px" @click="() => handleReset(clearFilters)"
            >Reset</a-button
          >
        </div>
      </template>
      <template #filterIcon="{ text: filtered }">
        <a-icon type="search" :style="{ color: filtered ? '#108ee9' : undefined }" />
      </template>
      <template #customer="{ text }">
        <span v-if="searchText">
          <template
            v-for="(fragment, i) in text
              .toString()
              .split(new RegExp(`(?<=${searchText})|(?=${searchText})`, 'i'))"
          >
            <mark
              v-if="fragment.toLowerCase() === searchText.toLowerCase()"
              :key="i"
              class="highlight"
              >{{ fragment }}</mark
            >
            <template v-else>{{ fragment }}</template>
          </template>
        </span>
        <template v-else>
          <a class="btn btn-sm btn-light" href="javascript: void(0);">{{ text }}</a>
        </template>
      </template>
      <template #progress="{ text: bar }">
        <div class="progress">
          <div
            :class="['progress-bar', bar.color]"
            :style="{ width: bar.value + '%' }"
            role="progressbar"
          ></div>
        </div>
      </template>
      <template #value="{ text }">
        <span class="font-weight-bold">{{ text }}</span>
      </template>
      <template #id="{ text }">
        <a href="javascript: void(0);" class="btn btn-sm btn-light">{{ text }}</a>
      </template>
      <template #total="{ text }">
        <span>${{ text }}</span>
      </template>
      <template #tax="{ text }">
        <span>${{ text }}</span>
      </template>
      <template #shipping="{ text }">
        <span>${{ text }}</span>
      </template>
      <template #status="{ text }">
        <span
          :class="[
            text === 'Processing'
              ? 'font-size-12 badge badge-primary'
              : 'font-size-12 badge badge-default',
          ]"
          >{{ text }}</span
        >
      </template>
      <template #action>
        <span>
          <a href="javascript: void(0);" class="btn btn-sm btn-light mr-2">
            <i class="fe fe-edit mr-2" />
            View
          </a>
          <a href="javascript: void(0);" class="btn btn-sm btn-light">
            <small>
              <i class="fe fe-trash mr-2" />
            </small>
            Remove
          </a>
        </span>
      </template>
    </a-table>
  </div>
</template>

<script>
import { ref } from 'vue'
import data from './data.json'
const columns = [
  {
    title: 'ID',
    dataIndex: 'id',
    slots: { customRender: 'id' },
    sorter: (a, b) => a.id - b.id,
  },
  {
    title: 'Purchase Date',
    dataIndex: 'date',
  },
  {
    title: 'Customer',
    dataIndex: 'customer',
    sorter: (a, b) => a.customer.length - b.customer.length,
    slots: {
      filterDropdown: 'filterDropdown',
      filterIcon: 'filterIcon',
      customRender: 'customer',
    },
    onFilter: (value, record) => record.customer.toLowerCase().includes(value.toLowerCase()),
  },
  {
    title: 'Grand Total',
    dataIndex: 'total',
    sorter: (a, b) => a.total - b.total,
    slots: { customRender: 'total' },
  },
  {
    title: 'Tax',
    dataIndex: 'tax',
    sorter: (a, b) => a.tax - b.tax,
    slots: { customRender: 'tax' },
  },
  {
    title: 'Shipping',
    dataIndex: 'shipping',
    sorter: (a, b) => a.shipping - b.shipping,
    slots: { customRender: 'shipping' },
  },
  {
    title: 'Quantity',
    dataIndex: 'quantity',
    sorter: (a, b) => a.quantity - b.quantity,
  },
  {
    title: 'Status',
    dataIndex: 'status',
    sorter: (a, b) => a.status.length - b.status.length,
    slots: { customRender: 'status' },
  },
  {
    title: 'Action',
    slots: { customRender: 'action' },
  },
]

export default {
  setup() {
    const searchText = ref('')
    const searchInput = ref(null)

    const handleSearch = (selectedKeys, confirm) => {
      confirm()
      searchText.value = selectedKeys[0]
    }

    const handleReset = (clearFilters) => {
      clearFilters()
      searchText.value = ''
    }

    return {
      searchText,
      searchInput,
      data,
      columns,
      handleReset,
      handleSearch,
    }
  },
}
</script>

<style scoped>
.custom-filter-dropdown {
  padding: 8px;
  border-radius: 4px;
  background: #fff;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
}

.highlight {
  background-color: rgb(255, 192, 105);
  padding: 0px;
}
</style>
