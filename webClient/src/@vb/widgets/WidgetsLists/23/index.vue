<template>
  <div>
    <div class="mb-4">
      <a-input placeholder="Search users...">
        <template #prefix>
          <span>
            <search-outlined style="color: rgba(0, 0, 0, 0.25)" />
          </span>
        </template>
      </a-input>
    </div>
    <div class="d-flex flex-column">
      <a
        v-for="(item, index) in dialogs"
        :key="item.name"
        class="text-dark font-size-18"
        :class="{
          [$style.item]: true,
          [$style.current]: index === activeIndex,
          'font-weight-bold': item.count,
        }"
        @click="setActiveItem(index)"
      >
        <span class="text-truncate mr-1">{{ item.name }}</span>
        <span v-if="item.count">({{ item.count }})</span>
      </a>
    </div>
  </div>
</template>
<script>
import { ref } from 'vue'
import { SearchOutlined } from '@ant-design/icons-vue'
import dialogs from './data.json'

export default {
  name: 'VbList23',
  components: {
    SearchOutlined,
  },
  setup() {
    const activeIndex = ref(0)
    const setActiveItem = index => {
      activeIndex.value = index
    }

    return {
      activeIndex,
      setActiveItem,
      dialogs,
    }
  },
}
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
