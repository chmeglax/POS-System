<template>
  <div :class="$style.subbar">
    <ul :class="$style.breadcrumbs" class="mr-4">
      <li :class="$style.breadcrumb">
        <router-link to="/" class="style.breadcrumbLink">Main</router-link>
      </li>
      <template v-for="(item, index) in breadcrumb">
        <li v-if="index != 0" :key="index" :class="$style.breadcrumb">
          <span class="style.breadcrumbLink">{{ item.title }}</span>
        </li>
      </template>
      <span v-if="activeItem">
        <li :class="$style.breadcrumb">
          <span :class="[$style.breadcrumbLink, $style.breadcrumbLink__current]">
            {{ activeItem.title }}
          </span>
        </li>
      </span>
    </ul>
    <div :class="$style.divider" class="mr-4 d-none d-xl-block" />
    <p class="color-gray-4 text-uppercase font-size-18 mb-0 mr-4 d-none d-xl-block">
      INV-00125
    </p>
    <button
      type="button"
      class="btn btn-primary btn-with-addon mr-auto text-nowrap d-none d-md-block"
    >
      <span class="btn-addon">
        <i class="btn-addon-icon fe fe-plus-circle" />
      </span>
      New Request
    </button>
    <div :class="$style.amount" class="mr-3 ml-auto d-none d-sm-flex">
      <p :class="$style.amountText">
        This month
        <span :class="$style.amountValue">$251.12</span>
      </p>
      <div :class="$style.amountGraph">
        <i :class="$style.amountGraphItem" :style="{ height: '80%' }" />
        <i :class="$style.amountGraphItem" :style="{ height: '50%' }" />
        <i :class="$style.amountGraphItem" :style="{ height: '70%' }" />
        <i :class="$style.amountGraphItem" :style="{ height: '60%' }" />
        <i :class="$style.amountGraphItem" :style="{ height: '50%' }" />
        <i :class="$style.amountGraphItem" :style="{ height: '65%' }" />
      </div>
    </div>
    <div :class="$style.amount" class="d-none d-sm-flex">
      <p :class="$style.amountText">
        Last month
        <span :class="$style.amountValue">$12,256.12</span>
      </p>
      <div :class="$style.amountGraph">
        <i :class="$style.amountGraphItem" :style="{ height: '60%' }" />
        <i :class="$style.amountGraphItem" :style="{ height: '65%' }" />
        <i :class="$style.amountGraphItem" :style="{ height: '75%' }" />
        <i :class="$style.amountGraphItem" :style="{ height: '55%' }" />
        <i :class="$style.amountGraphItem" :style="{ height: '100%' }" />
        <i :class="$style.amountGraphItem" :style="{ height: '85%' }" />
      </div>
    </div>
  </div>
</template>

<script>
import { ref, watch, onMounted, computed } from 'vue'
import { useRoute } from 'vue-router'
import { getMenuData } from '@/services/menu'
import reduce from 'lodash/reduce'

export default {
  name: 'Breadcrumbs2',
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
