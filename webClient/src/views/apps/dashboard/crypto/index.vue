<template>
  <div>
    <div class="row">
      <div class="col-lg-3 col-md-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-crypto-crypto-list /></div>
        </div>
      </div>
      <div class="col-lg-9 col-md-12">
        <div class="card card-top card-top-success">
          <div class="card-header py-0">
            <vb-headers-card-header-3 :data="{ title: 'BTC-USD Market' }" />
          </div>
          <div class="card-body"><vb-crypto-crypto-chart /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Order Book' }" /></div>
          <div class="card-body"><vb-crypto-crypto-orders /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Market History' }" />
          </div>
          <div class="card-body"><vb-crypto-crypto-history /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'My Open Orders' }" />
          </div>
          <div class="card-body"><vb-crypto-crypto-load-table /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'My Order History' }" />
          </div>
          <div class="card-body"><vb-crypto-crypto-load-table /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbCryptoCryptoList from '@/@vb/widgets/Crypto/CryptoList'
import VbHeadersCardHeader3 from '@/@vb/widgets/Headers/CardHeader3'
import VbCryptoCryptoChart from '@/@vb/widgets/Crypto/CryptoChart'
import VbHeadersCardHeader from '@/@vb/widgets/Headers/CardHeader'
import VbCryptoCryptoOrders from '@/@vb/widgets/Crypto/CryptoOrders'
import VbCryptoCryptoHistory from '@/@vb/widgets/Crypto/CryptoHistory'
import VbCryptoCryptoLoadTable from '@/@vb/widgets/Crypto/CryptoLoadTable'

export default {
  name: 'VbCryptoTerminal',
  components: {
    VbCryptoCryptoList,
    VbHeadersCardHeader3,
    VbCryptoCryptoChart,
    VbHeadersCardHeader,
    VbCryptoCryptoOrders,
    VbCryptoCryptoHistory,
    VbCryptoCryptoLoadTable,
  },
}
</script>
