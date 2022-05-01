<template>
  <a-form :model="formState" :label-col="labelCol" :wrapper-col="wrapperCol" label-align="left">
    <a-form-item label="Full name">
      <a-input v-model:value="formState.name" placeholder="Your Fullname..." />
    </a-form-item>
    <a-form-item label="Your Email...">
      <a-input v-model:value="formState.email" placeholder="Your Fullname..." />
    </a-form-item>
    <a-form-item label="Budget">
      <a-input v-model:value="formState.budget" addon-before="$" placeholder="Budget" />
    </a-form-item>
    <a-form-item label="Amount">
      <a-slider v-model:value="formState.amount" :marks="marks" tooltip-visible />
    </a-form-item>
  </a-form>
  <button type="submit" class="btn btn-success px-5">Send Data</button>
</template>
<script>
import { defineComponent, reactive, toRaw } from 'vue'
const marks = {
  0: '0',
  10: '10',
  20: '20',
  30: '30',
  40: '40',
  50: '50',
  60: '60',
  70: '70',
  80: '80',
  90: '90',
  100: '100',
}

export default defineComponent({
  setup() {
    const formState = reactive({
      name: '',
      email: '',
      budget: '',
      amount: 0,
    })

    const onSubmit = () => {
      console.log('submit!', toRaw(formState))
    }

    return {
      labelCol: {
        span: 4,
      },
      wrapperCol: {
        span: 14,
      },
      formState,
      onSubmit,
      marks,
    }
  },
})
</script>
