<template>
  <div class="table-responsive text-nowrap">
    <a-table
      :columns="marketHistoryColumns"
      :data-source="marketHistoryData"
      :pagination="{ position: 'bottom' }"
      size="small"
    >
      <template #ask="{ text: value }">
        <span style="color: #f75535">{{ value }}</span>
      </template>
      <template #sell>
        <a href="javascript: void(0);" class="utils__link--blue ml-2">
          <strong>BUY</strong>
        </a>
      </template>
      <template #type="{ text: value }">
        <span :style="value === 'SELL' ? { color: '#f75535' } : { color: '#00a45b' }">{{
          value
        }}</span>
      </template>
    </a-table>
  </div>
</template>

<script>
const marketHistoryColumns = [
  {
    title: 'Date',
    dataIndex: 'orderDate',
    key: 'orderDate',
  },
  {
    title: 'BUY/SELL',
    dataIndex: 'type',
    key: 'type',
    slots: { customRender: 'type' },
  },
  {
    title: 'Bid/Ask',
    dataIndex: 'bidAsk',
    key: 'bidAsk',
  },
  {
    title: 'Units Total',
    dataIndex: 'unitsTotal',
    key: 'unitsTotal',
  },
  {
    title: 'Total Cost',
    dataIndex: 'totalCost',
    key: 'totalCost',
  },
]

const marketHistoryData = [
  {
    key: 1,
    orderDate: '20:11:25',
    type: 'SELL',
    bidAsk: '6709.00000000',
    unitsTotal: '0.00050000',
    totalCost: '3.35510106',
  },
  {
    key: 2,
    orderDate: '20:26:52',
    type: 'BUY',
    bidAsk: '6709.00000000',
    unitsTotal: '7.00050000',
    totalCost: '32.35510106',
  },
  {
    key: 3,
    orderDate: '20:31:12',
    type: 'BUY',
    bidAsk: '6709.00000000',
    unitsTotal: '0.00050000',
    totalCost: '3.35510106',
  },
  {
    key: 4,
    orderDate: '20:44:41',
    type: 'SELL',
    bidAsk: '6809.00000000',
    unitsTotal: '2.00050000',
    totalCost: '90.35510106',
  },
  {
    key: 5,
    orderDate: '20:47:25',
    type: 'SELL',
    bidAsk: '6709.00000000',
    unitsTotal: '0.00050000',
    totalCost: '3.35510106',
  },
  {
    key: 6,
    orderDate: '20:56:45',
    type: 'SELL',
    bidAsk: '6709.00000000',
    unitsTotal: '0.00050000',
    totalCost: '3.35510106',
  },
]

export default {
  setup() {
    return {
      marketHistoryColumns,
      marketHistoryData,
    }
  },
}
</script>
