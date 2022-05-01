<template>
  <div>
    <div class="row">
      <div class="col-md-4">
        <div class="table-responsive text-nowrap">
          <a-table
            :columns="ordersSellColumns"
            :data-source="orderBookSell"
            :pagination="{ position: 'bottom' }"
            size="small"
          >
            <template #bid="{ text: value }">
              <span style="color: #00a45b">{{ value }}</span>
            </template>
            <template #sell>
              <a href="javascript: void(0);" class="vb__utils__link mr-2">
                <strong>SELL</strong>
              </a>
            </template>
          </a-table>
        </div>
      </div>
      <div class="col-md-4">
        <div :class="$style.form">
          <a-form layout="vertical">
            <a-form-item>
              <a-radio-group default-value="buy" style="width: 100%" @change="toggleOrderType">
                <a-radio-button value="buy" style="width: 50%; text-align: center"
                  >BUY</a-radio-button
                >
                <a-radio-button value="sell" style="width: 50%; text-align: center"
                  >SELL</a-radio-button
                >
              </a-radio-group>
            </a-form-item>
            <div v-if="orderType === 'buy'">
              <span :class="$style.formLabel">ORDER TYPE</span>
              <a-form-item>
                <a-select default-value="limit">
                  <a-select-option value="limit">Limit (Default)</a-select-option>
                  <a-select-option value="conditional">Conditional</a-select-option>
                </a-select>
              </a-form-item>
              <span :class="$style.formLabel">QUANTITY (BTC)</span>
              <a-form-item>
                <a-input default-value="0.00000000" />
              </a-form-item>
              <span :class="$style.formLabel">BID PRICE</span>
              <a-form-item>
                <a-input default-value="0.00645198" />
              </a-form-item>
              <span :class="$style.formLabel">TOTAL</span>
              <a-form-item>
                <a-input default-value="0.00000000" />
              </a-form-item>
              <span :class="$style.formLabel">TIME IN FORCE</span>
              <a-form-item>
                <a-select default-value="good">
                  <a-select-option value="good">Good &#39;Til Cancelled (Default)</a-select-option>
                  <a-select-option value="immediate">Immediate or Cancel</a-select-option>
                </a-select>
              </a-form-item>
              <button class="btn btn-success" type="button" style="width: 100%">
                <strong>BUY BTC</strong>
              </button>
              <div class="my-3 text-center">
                <div>
                  <strong>Available Balance</strong>
                </div>
                <div>12.92520000 BTC</div>
                <div>1450.00 USD</div>
                <div>
                  <a href="javascript: void(0);" class="vb__utils__link">
                    <strong>Max Buy</strong>
                  </a>
                </div>
              </div>
            </div>
            <div v-if="orderType === 'sell'">
              <span :class="$style.formLabel">ORDER TYPE</span>
              <a-form-item>
                <a-select default-value="limit">
                  <a-select-option value="limit">Limit (Default)</a-select-option>
                  <a-select-option value="conditional">Conditional</a-select-option>
                </a-select>
              </a-form-item>
              <span :class="$style.formLabel">QUANTITY (BTC)</span>
              <a-form-item>
                <a-input default-value="0.00000000" />
              </a-form-item>
              <span :class="$style.formLabel">ASK PRICE</span>
              <a-form-item>
                <a-input default-value="0.00645198" />
              </a-form-item>
              <span :class="$style.formLabel">TOTAL</span>
              <a-form-item>
                <a-input default-value="0.00000000" />
              </a-form-item>
              <span :class="$style.formLabel">TIME IN FORCE</span>
              <a-form-item>
                <a-select default-value="good">
                  <a-select-option value="good">Good &#39;Til Cancelled (Default)</a-select-option>
                  <a-select-option value="immediate">Immediate or Cancel</a-select-option>
                </a-select>
              </a-form-item>
              <button class="btn btn-danger" type="button" style="width: 100%">
                <strong>SELL BTC</strong>
              </button>
              <div class="my-3 text-center">
                <div>
                  <strong>Available Balance</strong>
                </div>
                <div>12.92520000 BTC</div>
                <div>1450.00 USD</div>
                <div>
                  <a href="javascript: void(0);" class="vb__utils__link">
                    <strong>Max Buy</strong>
                  </a>
                </div>
              </div>
            </div>
          </a-form>
        </div>
      </div>
      <div class="col-md-4">
        <div class="table-responsive text-nowrap">
          <a-table
            :columns="ordersBuyColumns"
            :data-source="orderBookBuy"
            :pagination="{ position: 'bottom' }"
            size="small"
          >
            <template #ask="{ text: value }">
              <span style="color: #f75535">{{ value }}</span>
            </template>
            <template #sell>
              <a href="javascript: void(0);" class="vb__utils__link ml-2">
                <strong>BUY</strong>
              </a>
            </template>
          </a-table>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { ref } from 'vue'

const ordersSellColumns = [
  {
    title: 'SUM',
    dataIndex: 'sum',
    key: 'sum',
    align: 'right',
  },
  {
    title: 'Total',
    dataIndex: 'total',
    key: 'total',
    align: 'right',
  },
  {
    title: 'Size',
    dataIndex: 'size',
    key: 'size',
    align: 'right',
  },
  {
    title: 'BID',
    dataIndex: 'bid',
    key: 'bid',
    width: 120,
    align: 'right',
    scopedSlots: { customRender: 'bid' },
  },
  {
    title: '',
    dataIndex: 'sell',
    key: 'sell',
    width: 60,
    align: 'right',
    scopedSlots: { customRender: 'sell' },
  },
]
const ordersBuyColumns = [
  {
    title: '',
    dataIndex: 'sell',
    key: 'sell',
    width: 60,
    scopedSlots: { customRender: 'sell' },
  },
  {
    title: 'ASK',
    dataIndex: 'ask',
    key: 'ask',
    width: 120,
    scopedSlots: { customRender: 'ask' },
  },
  {
    title: 'Size',
    dataIndex: 'size',
    key: 'size',
  },
  {
    title: 'Total',
    dataIndex: 'total',
    key: 'total',
  },
  {
    title: 'SUM',
    dataIndex: 'sum',
    key: 'sum',
  },
]
const orderBookBuy = [
  {
    key: 1,
    sum: '3.3187',
    total: '3.0801',
    size: '479.021',
    ask: '0.00643000',
  },
  {
    key: 2,
    sum: '2.3187',
    total: '3.3536',
    size: '236.021',
    ask: '0.00267789',
  },
  {
    key: 3,
    sum: '3.3187',
    total: '3.3267',
    size: '236.021',
    ask: '0.00643670',
  },
  {
    key: 4,
    sum: '4.3187',
    total: '3.24727',
    size: '637.021',
    ask: '0.00267000',
  },
  {
    key: 5,
    sum: '5.3187',
    total: '3.272',
    size: '15.021',
    ask: '0.00333000',
  },
  {
    key: 6,
    sum: '6.3187',
    total: '3.2727',
    size: '62.021',
    ask: '0.00643667',
  },
  {
    key: 7,
    sum: '7.3187',
    total: '3.4778',
    size: '23.021',
    ask: '0.00647873',
  },
  {
    key: 8,
    sum: '5.3187',
    total: '3.8549',
    size: '2356.021',
    ask: '0.00643478',
  },
  {
    key: 9,
    sum: '9.3187',
    total: '3.35738',
    size: '125.021',
    ask: '0.00477000',
  },
  {
    key: 10,
    sum: '10.3187',
    total: '3.37',
    size: '234.021',
    ask: '0.00236000',
  },
  {
    key: 11,
    sum: '11.3187',
    total: '3.3883',
    size: '456.021',
    ask: '0.00674440',
  },
  {
    key: 12,
    sum: '5.3187',
    total: '3.8549',
    size: '2356.021',
    ask: '0.00643478',
  },
  {
    key: 13,
    sum: '9.3187',
    total: '3.35738',
    size: '125.021',
    ask: '0.00477000',
  },
  {
    key: 14,
    sum: '10.3187',
    total: '3.37',
    size: '234.021',
    ask: '0.00236000',
  },
  {
    key: 15,
    sum: '11.3187',
    total: '3.3883',
    size: '456.021',
    ask: '0.00674440',
  },
]
const orderBookSell = [
  {
    key: 1,
    sum: '3.3187',
    total: '3.0801',
    size: '479.021',
    bid: '0.00643000',
  },
  {
    key: 2,
    sum: '2.3187',
    total: '3.3536',
    size: '236.021',
    bid: '0.00267789',
  },
  {
    key: 3,
    sum: '3.3187',
    total: '3.3267',
    size: '236.021',
    bid: '0.00643670',
  },
  {
    key: 4,
    sum: '4.3187',
    total: '3.24727',
    size: '637.021',
    bid: '0.00267000',
  },
  {
    key: 5,
    sum: '5.3187',
    total: '3.272',
    size: '15.021',
    bid: '0.00333000',
  },
  {
    key: 6,
    sum: '6.3187',
    total: '3.2727',
    size: '62.021',
    bid: '0.00643667',
  },
  {
    key: 7,
    sum: '7.3187',
    total: '3.4778',
    size: '23.021',
    bid: '0.00647873',
  },
  {
    key: 8,
    sum: '5.3187',
    total: '3.8549',
    size: '2356.021',
    bid: '0.00643478',
  },
  {
    key: 9,
    sum: '9.3187',
    total: '3.35738',
    size: '125.021',
    bid: '0.00477000',
  },
  {
    key: 10,
    sum: '10.3187',
    total: '3.37',
    size: '234.021',
    bid: '0.00236000',
  },
  {
    key: 11,
    sum: '11.3187',
    total: '3.3883',
    size: '456.021',
    bid: '0.00674440',
  },
  {
    key: 12,
    sum: '5.3187',
    total: '3.8549',
    size: '2356.021',
    bid: '0.00643478',
  },
  {
    key: 13,
    sum: '9.3187',
    total: '3.35738',
    size: '125.021',
    bid: '0.00477000',
  },
  {
    key: 14,
    sum: '10.3187',
    total: '3.37',
    size: '234.021',
    bid: '0.00236000',
  },
  {
    key: 15,
    sum: '11.3187',
    total: '3.3883',
    size: '456.021',
    bid: '0.00674440',
  },
]

export default {
  setup() {
    const orderType = ref('buy')

    const toggleOrderType = e => {
      orderType.value = e.target.value
    }

    return {
      ordersSellColumns,
      ordersBuyColumns,
      orderBookBuy,
      orderBookSell,
      orderType,
      toggleOrderType,
    }
  },
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
