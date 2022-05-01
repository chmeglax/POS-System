<template>
  <ul class="list-unstyled mb-0">
    <li :class="$style.item">
      <div :class="$style.separator" class="bg-success mr-3" />
      <label htmlFor="checkbox-1" class="mb-0" :class="[$style.control, $style.checkbox]">
        <input id="checkbox-1" type="checkbox" checked />
        <span :class="[$style.controlIndicator]" />
        <div class="d-inline-block">
          <div>Payment Received</div>
          <div class="text-muted">From themeforest</div>
        </div>
      </label>
    </li>
    <li :class="$style.item">
      <div :class="$style.separator" class="bg-primary mr-3" />
      <label htmlFor="checkbox-2" class="mb-0" :class="[$style.control, $style.checkbox]">
        <input id="checkbox-2" type="checkbox" checked />
        <span :class="[$style.controlIndicator]" />
        <div class="d-inline-block">
          <div>Payment Approved</div>
          <div class="text-muted">From themeforest</div>
        </div>
      </label>
    </li>
    <li :class="$style.item">
      <div :class="$style.separator" class="mr-3" />
      <label htmlFor="checkbox-3" class="mb-0" :class="[$style.control, $style.checkbox]">
        <input id="checkbox-3" type="checkbox" />
        <span :class="[$style.controlIndicator]" />
        <div class="d-inline-block">
          <div>Payment Received</div>
          <div class="text-muted">From Paypal</div>
        </div>
      </label>
    </li>
    <li :class="$style.item">
      <div :class="$style.separator" class="bg-danger mr-3" />
      <label htmlFor="checkbox-4" class="mb-0" :class="[$style.control, $style.checkbox]">
        <input id="checkbox-4" type="checkbox" />
        <span :class="[$style.controlIndicator]" />
        <div class="d-inline-block">
          <div>Withdrawal Failed</div>
          <div class="text-muted">From Bitcoin Address</div>
        </div>
      </label>
    </li>
    <li :class="$style.item">
      <div :class="$style.separator" class="bg-info mr-3" />
      <label htmlFor="checkbox-5" class="mb-0" :class="[$style.control, $style.checkbox]">
        <input id="checkbox-5" type="checkbox" />
        <span :class="[$style.controlIndicator]" />
        <div class="d-inline-block">
          <div>Payment Received</div>
          <div class="text-muted">From themeforest</div>
        </div>
      </label>
    </li>
    <li :class="$style.item">
      <div :class="$style.separator" class="mr-3" />
      <label htmlFor="checkbox-6" class="mb-0" :class="[$style.control, $style.checkbox]">
        <input id="checkbox-6" type="checkbox" />
        <span :class="[$style.controlIndicator]" />
        <div class="d-inline-block">
          <div>Payment Received</div>
          <div class="text-muted">From themeforest</div>
        </div>
      </label>
    </li>
    <li :class="$style.item">
      <div :class="$style.separator" class="mr-3" />
      <label htmlFor="checkbox-7" class="mb-0" :class="[$style.control, $style.checkbox]">
        <input id="checkbox-7" type="checkbox" />
        <span :class="[$style.controlIndicator]" />
        <div class="d-inline-block">
          <div>Payment Received</div>
          <div class="text-muted">From themeforest</div>
        </div>
      </label>
    </li>
  </ul>
</template>
<script>
export default {
  name: 'VbList17',
}
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
