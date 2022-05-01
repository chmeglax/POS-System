<template>
  <div>
    <h5 class="mb-3">
      <strong>Basic</strong>
    </h5>
    <div class="mb-5">
      <a-slider id="test" :default-value="30" :disabled="disabled" />
      <a-slider range :default-value="[20, 50]" :disabled="disabled" />
      <br />
      <a-switch
        :checked="disabled"
        @change="handleDisabledChange"
        un-checked-children="enabled"
        checked-children="disabled"
      />
    </div>
  </div>
</template>
<script>
export default {
  name: 'KitAntdSliderExample',
  data() {
    return {
      disabled: false,
    }
  },
  methods: {
    handleDisabledChange(disabled) {
      this.disabled = disabled
    },
  },
}
</script>
