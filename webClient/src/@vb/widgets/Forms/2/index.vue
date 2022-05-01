<template>
  <a-form
    layout="inline"
    :model="formState"
    @finish="handleFinish"
    @finishFailed="handleFinishFailed"
  >
    <a-form-item>
      <a-input v-model:value="formState.user" placeholder="Coins Amount" addon-before="$" />
    </a-form-item>
    <a-form-item>
      <a-input
        v-model:value="formState.password"
        type="password"
        placeholder="8 Digit Pin"
        addon-before="$"
      />
    </a-form-item>
    <a-form-item>
      <button type="submit" class="btn btn-success mt-1 mb-1">
        Send Transaction
      </button>
    </a-form-item>
  </a-form>
</template>
<script>
import { defineComponent, reactive } from 'vue'
export default defineComponent({
  setup() {
    const formState = reactive({
      user: '',
      password: '',
    })

    const handleFinish = values => {
      console.log(values, formState)
    }

    const handleFinishFailed = errors => {
      console.log(errors)
    }

    return {
      formState,
      handleFinish,
      handleFinishFailed,
    }
  },
})
</script>
