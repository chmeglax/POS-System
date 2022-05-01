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
    <div>
      <div v-for="(item, index) in dialogs" :key="item.name">
        <a
          class="d-flex flex-nowrap align-items-center"
          :class="{
            [$style.item]: true,
            [$style.current]: index === activeIndex,
          }"
          @click="setActiveItem(index)"
        >
          <div class="vb__utils__avatar vb__utils__avatar--size46 mr-3 flex-shrink-0">
            <img :src="item.avatar" :alt="item.name" />
          </div>
          <div :class="$style.info" class="flex-grow-1">
            <div class="text-uppercase font-size-12 text-truncate text-gray-6">
              {{ item.position }}
            </div>
            <div class="text-dark font-size-18 font-weight-bold text-truncate">
              {{ item.name }}
            </div>
          </div>
          <div v-if="!item.unread" :class="$style.unread" class="flex-shrink-0 align-self-start">
            <div class="badge badge-success">{{ item.unread }}</div>
          </div>
        </a>
      </div>
    </div>
  </div>
</template>
<script>
import { ref } from 'vue'
import { SearchOutlined } from '@ant-design/icons-vue'
import dialogs from './data.json'

export default {
  name: 'VbList22',
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
