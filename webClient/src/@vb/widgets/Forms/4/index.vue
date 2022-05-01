<template>
  <a-form
    :model="formState"
    :rules="rules"
    label-align="left"
    layout="vertical"
    @finish="handleFinish"
    @finishFailed="handleFinishFailed"
  >
    <a-form-item required label="Username" name="username">
      <a-input v-model:value="formState.username" placeholder="Email" />
    </a-form-item>
    <a-form-item required label="Gender" name="gender">
      <a-select v-model:value="formState.gender">
        <a-select-option value="male">Male</a-select-option>
        <a-select-option value="female">Female</a-select-option>
      </a-select>
    </a-form-item>
    <a-form-item required label="Password" name="password">
      <a-input v-model:value="formState.password" />
    </a-form-item>
    <a-form-item required label="Confirm Password" name="password2">
      <a-input v-model:value="formState.password2" />
    </a-form-item>
    <button type="submit" class="btn btn-light px-5">Sign In</button>
  </a-form>
</template>
<script>
import { defineComponent, reactive, toRaw } from 'vue'

export default defineComponent({
  setup() {
    const formState = reactive({
      username: '',
      gender: '',
      password: '',
      password2: '',
    })

    const rules = {
      username: [{ required: true }],
      gender: [{ required: true }],
      password: [{ required: true }],
      password2: [{ required: true }],
    }

    const handleFinish = values => {
      console.log(values, formState)
    }

    const handleFinishFailed = errors => {
      console.log(errors)
    }

    return {
      formState,
      rules,
      handleFinish,
      handleFinishFailed,
    }
  },
})
</script>
