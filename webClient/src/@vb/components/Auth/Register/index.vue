<template>
  <div class="mt-5 pt-2">
    <div class="card" :class="$style.container">
      <div class="text-dark font-size-32 mb-3">Create your account</div>
      <div class="mb-4">
        <p>
          And start spending more time on your projects and less time managing your infrastructure.
        </p>
      </div>
      <a-form
        :model="registerForm"
        :rules="rules"
        layout="vertical"
        class="mb-4"
        @finish="handleFinish"
        @finishFailed="handleFinishFailed"
      >
        <a-form-item name="name">
          <a-input v-model:value="registerForm.name" placeholder="Full Name" />
        </a-form-item>
        <a-form-item name="email">
          <a-input v-model:value="registerForm.email" placeholder="Email Address" />
        </a-form-item>
        <a-form-item name="password">
          <a-input v-model:value="registerForm.password" type="password" placeholder="Password" />
        </a-form-item>
        <a-button type="primary" class="text-center w-100" :loading="loading" html-type="submit">
          <strong>Sign Up</strong>
        </a-button>
      </a-form>
      <div>
        <span class="mr-1">By signing up, you agree to the</span>
        <a href="javascript: void(0);" class="vb__utils__link">Terms of Service</a>
        and
        <a href="javascript: void(0);" class="vb__utils__link">Privacy Policy</a>
      </div>
    </div>
    <div class="text-center pt-2 mb-auto">
      <span class="mr-2">Already have an account?</span>
      <router-link to="/auth/login" class="vb__utils__link">
        Sign in
      </router-link>
    </div>
  </div>
</template>
<script>
import { computed, reactive } from 'vue'
import { useStore } from 'vuex'

export default {
  name: 'VbRegister',
  setup() {
    const store = useStore()
    const settings = computed(() => store.getters.settings)
    const loading = computed(() => store.getters['user/user'].loading)
    const rules = {
      name: [
        {
          required: true,
          message: 'Please input your name!',
          trigger: 'change',
        },
      ],
      email: [
        {
          required: true,
          message: 'Please input your email!',
          trigger: 'change',
        },
      ],
      password: [{ required: true, message: 'Please input password!', trigger: 'change' }],
    }
    const registerForm = reactive({
      name: '',
      email: '',
      password: '',
    })

    const handleFinish = values => {
      store.dispatch('user/REGISTER', { payload: values })
    }
    const handleFinishFailed = errors => {
      console.log(errors)
    }

    return {
      settings,
      loading,
      rules,
      registerForm,
      handleFinish,
      handleFinishFailed,
    }
  },
}
</script>
<style lang="scss" module>
@import '@/@vb/components/Auth/style.module.scss';
</style>
