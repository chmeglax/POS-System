<template>
  <div class="mt-5 pt-2">
    <div class="card" :class="$style.container">
      <div class="text-dark font-size-32 mb-3">Connexion</div>
      <a-form
        :model="loginForm"
        :rules="rules"
        layout="vertical"
        class="mb-4"
        @finish="handleFinish"
        @finishFailed="handleFinishFailed"
      >
        <a-form-item name="email">
          <a-input v-model:value="loginForm.email" placeholder="Email" />
        </a-form-item>
        <a-form-item name="password">
          <a-input-password
            v-model:value="loginForm.password"
            placeholder="Password"
            type="password"
          />
        </a-form-item>
        <a-button type="primary" html-type="submit" class="text-center w-100" :loading="loading">
          <strong>Sign in</strong>
        </a-button>
      </a-form>
    </div>
  </div>
</template>
<script>
import { computed, reactive } from 'vue'
import { useStore } from 'vuex'
import { message } from 'ant-design-vue'

export default {
  name: 'VbLogin',
  setup() {
    const store = useStore()
    const settings = computed(() => store.getters.settings)
    const loading = computed(() => store.getters['user/user'].loading)
    const rules = {
      email: [
        {
          required: true,
          message: 'Saisir votre email!',
          trigger: 'change',
        },
      ],
      password: [{ required: true, message: 'Saisir votre mot de passe!', trigger: 'change' }],
    }
    const loginForm = reactive({
      email: '',
      password: '',
    })

    const changeAuthProvider = (value) => {
      store.commit('CHANGE_SETTING', { setting: 'authProvider', value })
    }
    const handleFinish = (values) => {
      store
        .dispatch('user/LOGIN', { payload: loginForm })
        .catch(() =>
          message.warning(
            "Impossible de se connecter, veuillez vérifier vos informations d'identification!",
          ),
        )
    }
    const handleFinishFailed = (errors) => {
      console.log(errors)
    }

    return {
      settings,
      loading,
      rules,
      loginForm,
      changeAuthProvider,
      handleFinish,
      handleFinishFailed,
    }
  },
  // data: function () {
  //   return {
  //     rules: {
  //       email: [{ required: true, message: 'Please input your email!', trigger: 'change' }],
  //       password: [{ required: true, message: 'Please input password!', trigger: 'change' }],
  //     },
  //     loginForm: {
  //       email: 'demo@visualbuilder.cloud',
  //       password: 'VisualBuilder',
  //     },
  //   }
  // },
  // computed: {
  //   ...mapState(['settings']),
  //   loading() {
  //     return this.$store.state.user.loading
  //   },
  // },
  // methods: {
  //   changeAuthProvider(value) {
  //     this.$store.commit('CHANGE_SETTING', { setting: 'authProvider', value })
  //   },
  //   handleFinish(values) {
  //     this.$store.dispatch('user/LOGIN', { payload: values })
  //   },
  //   handleFinishFailed(errors) {
  //     console.log(errors)
  //   },
  // },
}
</script>
<style lang="scss" module>
@import '@/@vb/components/Auth/style.module.scss';
</style>
