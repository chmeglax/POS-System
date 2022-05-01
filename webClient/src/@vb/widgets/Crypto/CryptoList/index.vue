<template>
  <div>
    <div className="d-block d-sm-none">
      <a-select show-search default-value="btc" :style="{ width: '100%' }">
        <a-select-option value="btc">
          BTC (Bitcoin)
          <a-tag color="blue" class="ml-3">11.7%</a-tag>
        </a-select-option>
        <a-select-option value="xmr">
          XMR (Monero)
          <a-tag color="blue" class="ml-3">67.5%</a-tag>
        </a-select-option>
        <a-select-option value="gld">
          GLD (GoldCoin)
          <a-tag color="red" class="ml-3">-22.9%</a-tag>
        </a-select-option>
        <a-select-option value="neo">
          NEO (Neo)
          <a-tag color="red" class="ml-3">-12.3%</a-tag>
        </a-select-option>
        <a-select-option value="btg">
          BTG (Bitcoin Gold)
          <a-tag color="blue" class="ml-3">+4.3%</a-tag>
        </a-select-option>
        <a-select-option value="xrp">
          XRP (Ripple)
          <a-tag color="red" class="ml-3">-4.2%</a-tag>
        </a-select-option>
        <a-select-option value="zec">
          ZEC (ZCash)
          <a-tag color="red" class="ml-3">-1.7%</a-tag>
        </a-select-option>
        <a-select-option value="zcl">
          ZCL (ZClassic)
          <a-tag color="red" class="ml-3">-2.8%</a-tag>
        </a-select-option>
      </a-select>
    </div>
    <div className="d-none d-sm-block">
      <a href="javascript: void(0);" :class="$style.listItem">
        <span :class="$style.listPercents">
          <span>+11.7%</span>
          0.00016985
        </span>
        <span :class="$style.listCurrency">
          <span>BTC</span>
          97.20
        </span>
      </a>
      <a href="javascript: void(0);" :class="[$style.listItem]">
        <span :class="$style.listPercents">
          <span>+67.5%</span>
          0.00016985
        </span>
        <span :class="$style.listCurrency">
          <span>XMR</span>
          8.26
        </span>
      </a>
      <a href="javascript: void(0);" :class="[$style.listItem, $style.listItemNegative]">
        <span :class="$style.listPercents">
          <span>-22.9%</span>
          0.00016985
        </span>
        <span :class="$style.listCurrency">
          <span>GLD</span>
          5.20
        </span>
      </a>
      <a href="javascript: void(0);" :class="[$style.listItem, $style.listItemNegative]">
        <span :class="$style.listPercents">
          <span>-12.3%</span>
          0.00016985
        </span>
        <span :class="$style.listCurrency">
          <span>NEO</span>
          3.20
        </span>
      </a>
      <a href="javascript: void(0);" :class="$style.listItem">
        <span :class="$style.listPercents">
          <span>+4.3%</span>
          0.00036234
        </span>
        <span :class="$style.listCurrency">
          <span>BTG</span>
          5.64
        </span>
      </a>
      <a href="javascript: void(0);" :class="[$style.listItem, $style.listItemNegative]">
        <span :class="$style.listPercents">
          <span>-4.2%</span>
          0.00035685
        </span>
        <span :class="$style.listCurrency">
          <span>XRP</span>
          6.36
        </span>
      </a>
      <a href="javascript: void(0);" :class="[$style.listItem, $style.listItemNegative]">
        <span :class="$style.listPercents">
          <span>-1.7%</span>
          0.00000985
        </span>
        <span :class="$style.listCurrency">
          <span>ZEC</span>
          6.35
        </span>
      </a>
      <a href="javascript: void(0);" :class="[$style.listItem, $style.listItemNegative]">
        <span :class="$style.listPercents">
          <span>-2.8%</span>
          0.00000152
        </span>
        <span :class="$style.listCurrency">
          <span>ZCL</span>
          1.03
        </span>
      </a>
    </div>
  </div>
</template>

<style lang="scss" module>
@import './style.module.scss';
</style>
