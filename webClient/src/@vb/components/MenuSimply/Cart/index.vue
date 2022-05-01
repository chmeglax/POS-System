<template>
  <a-dropdown :trigger="['click']" placement="bottomLeft" @visibleChange="addCount">
    <div :class="$style.dropdown">
      <a-badge :count="count">
        <i class="fe fe-shopping-cart" :class="$style.icon" />
      </a-badge>
    </div>
    <template #overlay>
      <div class="card vb__utils__shadow width-350">
        <div class="card-body">
          <general26 />
        </div>
      </div>
    </template>
  </a-dropdown>
</template>

<script>
import { ref } from 'vue'
import General26 from '@/@vb/widgets/WidgetsGeneral/26'

export default {
  components: {
    General26,
  },
  setup() {
    const count = ref(2)
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
