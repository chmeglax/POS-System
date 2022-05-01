<template>
  <div :class="$style.breadcrumbs">
    <div :class="$style.path">
      <router-link to="/">Home</router-link>
      <template v-for="(item, index) in breadcrumb">
        <span v-if="index != 0" :key="index">
          <span :class="$style.arrow"></span>
          <span>{{ item.title }}</span>
        </span>
      </template>
      <span v-if="activeItem">
        <span :class="$style.arrow"></span>
        <strong :class="$style.current">{{ activeItem.title }}</strong>
      </span>
    </div>
  </div>
</template>

<script>
import { ref, watch, onMounted, computed } from 'vue'
import { useRoute } from 'vue-router'
import { getMenuData } from '@/services/menu'
import reduce from 'lodash/reduce'

export default {
  name: 'Breadcrumbs',
  setup() {
    const route = useRoute()
    const breadcrumb = ref([])
    const activeItem = ref([])
    const menuData = getMenuData
    const routePath = computed(() => route.path)

    const getPath = (data, url, parents = []) => {
      if (url === '/') {
        url = '/dashboard'
      }
      const items = reduce(
        data,
        (result, entry) => {
          if (result.length) {
            return result
          }
          if (entry.children) {
            const nested = getPath(entry.children, url, [entry].concat(parents))
            return (result || []).concat(nested.filter(e => !!e))
          }
          if (entry.url === url) {
            return [entry].concat(parents)
          }
          return result
        },
        [],
      )
      activeItem.value = items[0]
      return items
    }

    onMounted(() => {
      breadcrumb.value = getPath(menuData, routePath.value)
    })

    watch(routePath, routePath => (breadcrumb.value = getPath(menuData, routePath)))

    return {
      breadcrumb,
      activeItem,
    }
  },
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
