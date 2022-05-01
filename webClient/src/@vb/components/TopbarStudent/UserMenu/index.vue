<template>
  <a-dropdown :trigger="['click']" placement="bottomLeft">
    <div :class="$style.dropdown">
      <a-avatar
        v-if="user.avatar"
        shape="square"
        size="large"
        :src="user.avatar"
        :class="$style.avatar"
      >
      </a-avatar>
      <a-avatar v-else shape="square" size="large" :src="user.avatar" :class="$style.avatar">
        <template #icon><UserOutlined /></template>
      </a-avatar>
    </div>
    <template #overlay>
      <a-menu>
        <a-menu-item>
          <div>
            <strong
              >{{ $t('topBar.profileMenu.hello') }},
              {{ user.lName + ' ' + user.fName || 'Anonymous' }}</strong
            >
          </div>
          <div>
            <strong class="mr-1">Type : </strong>
            Etudiant
          </div>
          <div>
            <strong class="mr-1">Section :</strong>
            {{ user.section || '—' }}
          </div>
        </a-menu-item>
        <a-menu-divider />
        <a-menu-item>
          <div>
            <strong class="mr-1">{{ $t('topBar.profileMenu.email') }}:</strong>
            {{ user.email || '—' }}
          </div>
          <div>
            <strong class="mr-1">{{ $t('topBar.profileMenu.phone') }}:</strong>
            —
          </div>
        </a-menu-item>
        <a-menu-divider />
        <a-menu-item>
          <a href="javascript: void(0);">
            <i class="fe fe-user mr-2" />
            {{ $t('topBar.profileMenu.editProfile') }}
          </a>
        </a-menu-item>
        <a-menu-divider />
        <a-menu-item>
          <a href="javascript: void(0);" @click="logout">
            <i class="fe fe-log-out mr-2" />
            {{ $t('topBar.profileMenu.logout') }}
          </a>
        </a-menu-item>
      </a-menu>
    </template>
  </a-dropdown>
</template>

<script>
import { UserOutlined } from '@ant-design/icons-vue'
import { useStore } from 'vuex'
import { computed } from 'vue'

export default {
  components: {
    UserOutlined,
  },
  setup() {
    const store = useStore()
    const user = computed(() => store.getters['user/user'])

    const logout = () => {
      store.dispatch('user/LOGOUTSTUDENT')
    }

    return {
      user,
      logout,
    }
  },
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
