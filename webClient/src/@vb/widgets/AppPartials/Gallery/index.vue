<template>
  <div>
    <div class="d-flex flex-wrap mb-4">
      <a-checkbox>Models</a-checkbox>
      <a-checkbox>Fashion</a-checkbox>
      <a-checkbox>Cars</a-checkbox>
      <a-checkbox default-checked>Wallpapers</a-checkbox>
    </div>
    <div :class="$style.items">
      <div :class="$style.item" v-for="(item, index) in data" :key="index">
        <div :class="$style.itemContent">
          <div :class="$style.itemControl">
            <div :class="$style.itemControlContainer">
              <a-button-group>
                <a-button><DeleteOutlined /></a-button>
                <a-button><EditOutlined /></a-button>
              </a-button-group>
            </div>
          </div>
          <img :src="item.path" alt="Image" />
        </div>
        <div class="text-gray-6">
          <div>{{ item.name }}</div>
          <div>{{ item.size }}</div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import { DeleteOutlined, EditOutlined } from '@ant-design/icons-vue'
import data from './data.json'

export default {
  components: {
    DeleteOutlined,
    EditOutlined,
  },
  setup() {
    return {
      data,
    }
  },
}
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
