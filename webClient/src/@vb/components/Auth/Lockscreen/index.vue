<template>
  <div class="mt-5 pt-2">
    <div class="card" :class="$style.container">
      <div class="text-dark text-center font-size-32 mb-3">Account Locked</div>
      <div class="text-center">
        <div class="vb__utils__avatar vb__utils__avatar--size64 d-inline-block mb-2">
          <img src="resources/images/avatars/2.jpg" alt="Mary Stanform" />
        </div>
        <div class="font-size-18 text-dark mb-4">
          <strong>Mary Stanform</strong>
        </div>
      </div>
      <a-form :model="lockscreenForm" :rules="rules" layout="vertical" class="mb-4">
        <a-form-item name="password">
          <a-input v-model:value="lockscreenForm.password" placeholder="Password" />
        </a-form-item>
        <a-button type="primary" html-type="submit" class="text-center w-100">
          <strong>Unlock Account</strong>
        </a-button>
      </a-form>
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
import { reactive } from 'vue'

export default {
  name: 'VbLockscreen',
  setup() {
    const rules = {
      password: [{ required: true, message: 'Please input password!', trigger: 'change' }],
    }
    const lockscreenForm = reactive({
      password: '',
    })

    return {
      rules,
      lockscreenForm,
    }
  },
}
</script>
<style lang="scss" module>
@import '@/@vb/components/Auth/style.module.scss';
</style>
