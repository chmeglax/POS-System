<template>
  <div :class="$style.container">
    <template v-for="item in favs" :key="item.key">
      <a-tooltip placement="bottom">
        <template #title>
          {{ item.title }}
        </template>
        <span>
          <router-link :to="item.url" :class="$style.item" class="mr-3">
            <i class="fe" :class="[$style.icon, item.icon]" />
          </router-link>
        </span>
      </a-tooltip>
    </template>
    <a-tooltip placement="bottom">
      <template #title> Bookmarks </template>
      <span :class="$style.item">
        <a-dropdown :visible="dropdownVisible" :trigger="['click']" placement="bottomLeft">
          <div :class="$style.dropdown" @click="toggleDropdown">
            <i class="fe fe-star" :class="$style.icon" />
          </div>
          <template #overlay>
            <div>
              <div class="card vb__utils__shadow width-350">
                <div class="card-body p-1">
                  <div class="p-2">
                    <a-input
                      v-model:value="searchText"
                      allow-clear
                      :placeholder="$t('topBar.findPages')"
                      @change="filterPagesList"
                    />
                  </div>
                  <div class="height-200">
                    <perfect-scrollbar :style="{ height: '100%' }">
                      <div class="px-2 pb-2">
                        <template v-for="item in filteredPagesList" :key="item.key">
                          <router-link :to="item.url" :class="$style.link">
                            <div
                              :class="{
                                [$style.setIcon]: true,
                                [$style.setIconActive]: item.isActive,
                              }"
                              @click="e => setFav(e, item)"
                            >
                              <i class="fe fe-star" />
                            </div>
                            <span>
                              <i class="mr-2 fe" :class="item.icon" />
                              {{ item.title }}
                            </span>
                          </router-link>
                        </template>
                      </div>
                    </perfect-scrollbar>
                  </div>
                  <div class="p-2">
                    <a-button type="primary" @click="toggleDropdown">Close</a-button>
                  </div>
                </div>
              </div>
            </div>
          </template>
        </a-dropdown>
      </span>
    </a-tooltip>
  </div>
</template>

<script>
import { ref, onMounted } from 'vue'
import { message } from 'ant-design-vue'
import store from 'store'
import { getMenuData } from '@/services/menu'

export default {
  setup() {
    const dropdownVisible = ref(false)
    const searchText = ref('')
    const favs = ref(store.get('app.topbar.favs') || [])
    const pagesList = ref([])
    const filteredPagesList = ref([])
    const menuData = getMenuData

    const loadPagesList = () => {
      const getPagesList = () => {
        const _menuData = JSON.parse(JSON.stringify(menuData))
        const flattenItems = (items, key) =>
          items.reduce((flattenedItems, item) => {
            if (item.category) {
              return flattenedItems
            }
            if (item.key === 'nestedItem1' || item.disabled) {
              // skip unwanted items
              return flattenedItems
            }
            if (Array.isArray(item[key])) {
              const items = item[key].map(child => {
                child.icon = item.icon
                return child
              })
              return flattenedItems.concat(flattenItems(items, key))
            }
            flattenedItems.push(item)
            return flattenedItems
          }, [])
        return flattenItems(_menuData, 'children')
      }
      pagesList.value = getPagesList()
    }

    const filterPagesList = () => {
      const _searchText = searchText.value ? searchText.value.toUpperCase() : ''
      const getFilteredPageList = () => {
        const list = []
        pagesList.value.forEach(item => {
          const isActive = favs.value.some(child => child.url === item.url)
          if (!item.title.toUpperCase().includes(_searchText) && _searchText) {
            return null
          }
          item.isActive = isActive
          list.push(item)
          return null
        })
        return list
      }
      filteredPagesList.value = getFilteredPageList()
    }

    const toggleDropdown = () => {
      dropdownVisible.value = !dropdownVisible.value
    }

    const setFav = (e, item) => {
      e.preventDefault()
      e.stopPropagation()
      const isActive = favs.value.some(child => child.url === item.url)
      if (isActive) {
        const filtered = favs.value.filter(child => child.url !== item.url)
        store.set('app.topbar.favs', filtered)
        favs.value = filtered
        filterPagesList()
        return
      }
      if (favs.value.length >= 3) {
        message.info('Only three pages can be added to your bookmarks.')
        return
      }
      const items = [...favs.value]
      items.push(item)
      store.set('app.topbar.favs', items)
      favs.value = items
      filterPagesList()
    }

    onMounted(loadPagesList)
    onMounted(filterPagesList)

    return {
      dropdownVisible,
      searchText,
      favs,
      pagesList,
      filterPagesList,
      filteredPagesList,
      setFav,
      toggleDropdown,
    }
  },
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
