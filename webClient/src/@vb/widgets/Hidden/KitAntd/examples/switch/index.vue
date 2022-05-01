<template>
  <div>
    <h5 class="mb-3">
      <strong>Basic</strong>
    </h5>
    <div class="mb-5">
      <a-switch default-checked @change="onChange" class="mb-3 mr-3" />
      <a-switch checked-children="Off" un-checked-children="On" default-checked class="mb-3 mr-3" />
      <a-switch loading default-checked class="mb-3 mr-3" />
    </div>
  </div>
</template>
<script>
export default {
  name: 'KitAntdSwitchExample',
  data() {
    return {}
  },
  methods: {
    onChange(checked) {
      console.log(`a-switch to ${checked}`)
    },
  },
}
</script>
