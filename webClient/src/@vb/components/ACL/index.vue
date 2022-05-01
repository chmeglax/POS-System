<template>
  <div v-if="show">
    <slot />
  </div>
</template>

<script>
import { ref, onMounted, computed } from 'vue'
import { useStore } from 'vuex'
import { useRouter } from 'vue-router'
import { notification } from 'ant-design-vue'
import router from '@/router'

export default {
  name: 'VbACL',
  props: {
    redirect: {
      type: Boolean,
      default: false,
    },
    roles: {
      type: Array,
      default: () => [],
    },
  },
  setup(props) {
    const store = useStore()
    const router = useRouter()
    const defaultRedirect = '/auth/404'
    const show = ref(false)
    const role = computed(() => store.getters['user/user'].role)

    const athorize = () => {
      const authorized = props.roles.includes(role.value)
      show.value = authorized
      if (!authorized && props.redirect) {
        const url = typeof props.redirect === 'boolean' ? defaultRedirect : props.redirect
        notification.warning({
          message: 'Unauthorized Access',
          description: `You have no rights to access this page. <br /> Redirected to ${url}`,
        })
        router.push(url)
      }
    }

    onMounted(athorize)

    return {
      show,
    }
  },
}
</script>
