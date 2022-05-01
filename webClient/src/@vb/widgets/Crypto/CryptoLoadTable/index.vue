<template>
  <div>
    <a v-if="!myOpenOrders.loaded" href="javascript: void(0);" @click="handleMyOpenOrders">
      <a-spin :spinning="myOpenOrders.loading">
        <a-alert class="pt-4 pb-4" message="Click to view open order details" type="info" />
      </a-spin>
    </a>
    <div v-if="myOpenOrders.loaded" class="table-responsive text-nowrap">
      <a-table
        :columns="myOrderColumns"
        :data-source="myOpenOrders.data"
        :pagination="{ position: 'bottom' }"
        size="small"
      >
        <template #type="{ text: value }">
          <span :style="value === 'SELL' ? { color: '#f75535' } : { color: '#00a45b' }">{{
            value
          }}</span>
        </template>
      </a-table>
    </div>
  </div>
</template>

<script>
import { reactive } from 'vue'

const myOrderColumns = [
  {
    title: 'Order Date',
    dataIndex: 'orderDate',
    key: 'orderDate',
  },
  {
    title: 'Open Date',
    dataIndex: 'openDate',
    key: 'openDate',
  },
  {
    title: 'Type',
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
    title: 'Filled',
    dataIndex: 'filled',
    key: 'filled',
  },
  {
    title: 'Units Total',
    dataIndex: 'unitsTotal',
    key: 'unitsTotal',
  },
  {
    title: 'Actual Rate',
    dataIndex: 'actualRate',
    key: 'actualRate',
  },
  {
    title: 'Est. Total',
    dataIndex: 'estTotal',
    key: 'estTotal',
  },
]

const myOrdersData = [
  {
    key: 1,
    orderDate: '2018/05/27 20:55:39',
    openDate: '2018/05/27 20:55:39',
    type: 'SELL',
    bidAsk: '7319.44600000',
    filled: '0.26510202',
    unitsTotal: '0.26510202',
    actualRate: '7325.77049148',
    estTotal: '1937.22136398',
  },
  {
    key: 2,
    orderDate: '2018/05/24 09:28:04',
    openDate: '2018/05/24 09:27:11',
    type: 'BUY',
    bidAsk: '7660.00000000',
    filled: '0.29959731',
    unitsTotal: '0.29959731',
    actualRate: '7660.00000000',
    estTotal: '-2300.65268307',
  },
  {
    key: 3,
    orderDate: '2018/05/18 20:21:08',
    openDate: '2018/05/18 20:21:08',
    type: 'SELL',
    bidAsk: '8121.00000001',
    filled: '0.28400674',
    unitsTotal: '0.28400674',
    actualRate: '8121.00000000',
    estTotal: '2300.65268871',
  },
]

export default {
  setup() {
    const myOpenOrders = reactive({
      loading: false,
      loaded: false,
      data: myOrdersData,
    })

    const handleMyOpenOrders = () => {
      myOpenOrders.loading = true
      setTimeout(() => {
        myOpenOrders.loading = false
        myOpenOrders.loaded = true
      }, 1500)
    }

    return {
      myOrderColumns,
      myOpenOrders,
      handleMyOpenOrders,
    }
  },
}
</script>
