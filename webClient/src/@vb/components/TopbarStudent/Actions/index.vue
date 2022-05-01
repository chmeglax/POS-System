<template>
  <a-dropdown :trigger="['click']" placement="bottomLeft" @visibleChange="addCount">
    <div :class="$style.dropdown">
      <a-badge :count="count">
        <i class="fe fe-bell" :class="$style.icon" />
      </a-badge>
    </div>
    <template #overlay>
      <div class="card vb__utils__shadow width-350">
        <div class="card-body p-0">
          <list5 />
        </div>
      </div>
    </template>
  </a-dropdown>
</template>

<script>
import { ref } from 'vue'
import List5 from '@/@vb/widgets/WidgetsLists/5'

export default {
  components: {
    List5,
  },
  setup() {
    const count = ref(7)
    const addCount = () => {
      count.value++
    }

    return {
      count,
      addCount,
    }
  },
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
