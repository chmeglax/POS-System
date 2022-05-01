<template>
  <a-form :model="formState" label-align="left" layout="vertical">
    <div class="row">
      <div class="col-lg-6">
        <a-form-item label="Full name">
          <a-input v-model:value="formState.email" placeholder="Email" />
        </a-form-item>
      </div>
      <div class="col-lg-6">
        <a-form-item label="Password">
          <a-input v-model:value="formState.password" placeholder="Password" />
        </a-form-item>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <a-form-item label="Address">
          <a-input v-model:value="formState.address" placeholder="1234 Main St." />
        </a-form-item>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <a-form-item label="Address 2">
          <a-input v-model:value="formState.address2" placeholder="Apartment, studio, or floor" />
        </a-form-item>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-6">
        <a-form-item label="State">
          <a-input v-model:value="formState.state" />
        </a-form-item>
      </div>
      <div class="col-lg-4">
        <a-form-item label="City">
          <a-cascader
            v-model:value="formState.city"
            :options="options"
            placeholder="Please select"
          />
        </a-form-item>
      </div>
      <div class="col-lg-2">
        <a-form-item label="zip">
          <a-input v-model:value="formState.zip" />
        </a-form-item>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <a-form-item label="Upload Presentation">
          <a-upload-dragger>
            <p class="ant-upload-drag-icon">
              <inbox-outlined></inbox-outlined>
            </p>
            <p class="ant-upload-text">
              Click or drag file to this area to upload
            </p>
            <p class="ant-upload-hint">
              Support for a single or bulk upload. Strictly prohibit from uploading company data or
              other band files
            </p>
          </a-upload-dragger>
        </a-form-item>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <a-form-item>
          <a-checkbox v-model:checked="formState.agree"
            >I CONSENT TO HAVING SELLPIXELS.COM COLLECT MY PERSONAL DETAILS.</a-checkbox
          >
        </a-form-item>
      </div>
    </div>
  </a-form>
  <button type="submit" class="btn btn-light px-5">Sign In</button>
</template>
<script>
import { InboxOutlined } from '@ant-design/icons-vue'
import { defineComponent, reactive, toRaw } from 'vue'

const options = [
  {
    value: 'zhejiang',
    label: 'Zhejiang',
    children: [
      {
        value: 'hangzhou',
        label: 'Hangzhou',
        children: [
          {
            value: 'xihu',
            label: 'West Lake',
          },
        ],
      },
    ],
  },
  {
    value: 'jiangsu',
    label: 'Jiangsu',
    children: [
      {
        value: 'nanjing',
        label: 'Nanjing',
        children: [
          {
            value: 'zhonghuamen',
            label: 'Zhong Hua Men',
          },
        ],
      },
    ],
  },
]

export default defineComponent({
  components: {
    InboxOutlined,
  },
  setup() {
    const formState = reactive({
      email: '',
      password: '',
      address: '',
      address2: '',
      state: '',
      city: [],
      zip: '',
      agree: false,
    })

    const onSubmit = () => {
      console.log('submit!', toRaw(formState))
    }

    return {
      formState,
      onSubmit,
      options,
    }
  },
})
</script>
