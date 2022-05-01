<template>
  <a-dropdown :trigger="['click']" placement="bottomLeft">
    <div
      :class="{
        [$style.dropdown]: true,
        [$style.dropdownDark]: settings.menuColor === 'dark',
        [$style.dropdownGray]: settings.menuColor === 'gray',
      }"
    >
      <i class="fe fe-menu mr-2"></i>
      Pages
    </div>
    <template #overlay>
      <a-menu style="width: 200px" mode="vertical">
        <template v-for="item in menuData">
          <template v-if="!item.category && item.children">
            <a-sub-menu :key="item.key">
              <template #title>
                <span>
                  <i class="mr-2" :class="item.icon"></i>
                  <span>{{ item.title }}</span>
                </span>
              </template>
              <template v-for="subItem in item.children" :key="subItem.key">
                <a-menu-item>
                  <router-link :to="subItem.url">{{ subItem.title }}</router-link>
                </a-menu-item>
              </template>
            </a-sub-menu>
          </template>
          <template v-if="!item.category && item.url">
            <a-menu-item :key="item.key">
              <router-link :to="item.url">
                <i class="mr-2" :class="item.icon"></i>
                {{ item.title }}
              </router-link>
            </a-menu-item>
          </template>
        </template>
      </a-menu>
    </template>
  </a-dropdown>
</template>

<script>
import { computed } from 'vue'
import { useStore } from 'vuex'
import { getMenuData } from '@/services/menu'

export default {
  setup() {
    const store = useStore()
    const settings = computed(() => store.getters.settings)
    const menuData = computed(() => getMenuData)

    return {
      settings,
      menuData,
    }
  },
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
