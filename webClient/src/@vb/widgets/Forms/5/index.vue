<template>
  <a-form :model="formState" label-align="left" layout="vertical">
    <a-form-item label="Title">
      <a-input v-model:value="formState.title" placeholder="Email" />
    </a-form-item>
    <a-form-item label="Type">
      <a-radio-group v-model:value="formState.type" name="radioGroup">
        <a-radio value="1">A</a-radio>
        <a-radio value="2">B</a-radio>
        <a-radio value="3">C</a-radio>
        <a-radio value="4">D</a-radio>
      </a-radio-group>
    </a-form-item>
    <a-form-item label="Category">
      <a-select v-model:value="formState.category">
        <a-select-option value="travel">Travel</a-select-option>
        <a-select-option value="lifestyle">Lifestyle</a-select-option>
        <a-select-option value="nature">Nature</a-select-option>
        <a-select-option value="video">Video</a-select-option>
      </a-select>
    </a-form-item>
    <a-form-item label="Content">
      <quill-editor style="height: 200px"></quill-editor>
    </a-form-item>
    <a-form-item label="Upload Presentation">
      <a-upload-dragger>
        <p class="ant-upload-drag-icon">
          <inbox-outlined></inbox-outlined>
        </p>
        <p class="ant-upload-text">Click or drag file to this area to upload</p>
        <p class="ant-upload-hint">
          Support for a single or bulk upload. Strictly prohibit from uploading company data or
          other band files
        </p>
      </a-upload-dragger>
    </a-form-item>
    <a-form-item>
      <button class="btn btn-success btn-with-addon text-nowrap" type="submit">
        <span class="btn-addon">
          <i class="btn-addon-icon fe fe-plus-circle"></i>
        </span>
        Add Post
      </button>
    </a-form-item>
  </a-form>
</template>
<script>
import { quillEditor } from 'vue3-quill'
import { InboxOutlined } from '@ant-design/icons-vue'
import { defineComponent, reactive, toRaw } from 'vue'

export default defineComponent({
  components: {
    InboxOutlined,
    quillEditor,
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
    }
  },
})
</script>
