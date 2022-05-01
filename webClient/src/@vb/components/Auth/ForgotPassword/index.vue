<template>
  <div class="mt-5 pt-2">
    <div class="card" :class="$style.container">
      <div class="text-dark font-size-32 mb-3">Reset Password</div>
      <a-form ref="registerForm" :model="forgotForm" :rules="rules" layout="vertical" class="mb-4">
        <a-form-item name="email">
          <a-input v-model:value="forgotForm.email" placeholder="Email Address" />
        </a-form-item>
        <a-button type="primary" class="text-center w-100" html-type="submit">
          <strong>Reset my password</strong>
        </a-button>
      </a-form>
      <router-link to="/auth/login" class="vb__utils__link">
        <i class="fe fe-arrow-left mr-1 align-middle" />
        Go to Sign in
      </router-link>
    </div>
  </div>
</template>
<script>
import { reactive } from 'vue'

export default {
  name: 'VbForgotPassword',
  setup() {
    const rules = {
      email: [
        {
          required: true,
          message: 'Please input your email!',
          trigger: 'change',
        },
      ],
    }
    const forgotForm = reactive({
      email: '',
    })

    return {
      rules,
      forgotForm,
    }
  },
}
</script>
<style lang="scss" module>
@import '@/@vb/components/Auth/style.module.scss';
</style>
