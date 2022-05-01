<template>
  <div>
    <h5 class="mb-3">
      <strong>Icons Usage</strong>
    </h5>
    <div class="mb-5">
      <HomeOutlined class="mr-3 mb-3 font-size-24" />
      <SettingFilled class="mr-3 mb-3 font-size-24" />
      <SmileOutlined class="mr-3 mb-3 font-size-24" />
      <SyncOutlined spin class="mr-3 mb-3 font-size-24" />
      <SmileOutlined rotate="{180}" class="mr-3 mb-3 font-size-24" />
      <LoadingOutlined class="mr-3 mb-3 font-size-24" />
    </div>
  </div>
</template>
<script>
import {
  HomeOutlined,
  LoadingOutlined,
  SettingFilled,
  SmileOutlined,
  SyncOutlined,
} from '@ant-design/icons-vue'

export default {
  name: 'KitAntdIconExample',
  components: {
    HomeOutlined,
    LoadingOutlined,
    SettingFilled,
    SmileOutlined,
    SyncOutlined,
  },
}
</script>
