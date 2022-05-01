<template>
  <div>
    <div class="row">
      <div class="col-lg-6">
        <h5 class="mb-3">
          <strong>Basic</strong>
        </h5>
        <div class="mb-5">
          <div class="mb-3">
            <a-card title="Default size card" style="width: 300px">
              <template #extra>
                <a href="#">more</a>
              </template>
              <p>card content</p>
              <p>card content</p>
              <p>card content</p>
            </a-card>
          </div>
          <div class="mb-3">
            <a-card size="small" title="Small size card" style="width: 300px">
              <template #extra>
                <a href="#">more</a>
              </template>
              <p>card content</p>
              <p>card content</p>
              <p>card content</p>
            </a-card>
          </div>
        </div>
      </div>
      <div class="col-lg-6">
        <h5 class="mb-3">
          <strong>Advanced</strong>
        </h5>
        <div class="mb-5">
          <div class="mb-3">
            <a-card hoverable style="width: 300px">
              <template #cover>
                <img
                  alt="example"
                  src="https://gw.alipayobjects.com/zos/rmsportal/JiqGstEfoWAOHiTxclqi.png"
                />
              </template>
              <template class="ant-card-actions" #actions>
                <a-icon type="setting" />
                <a-icon type="edit" />
                <a-icon type="ellipsis" />
              </template>
              <a-card-meta title="Card title" description="This is the description">
                <template #avatar>
                  <a-avatar
                    src="https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
                  />
                </template>
              </a-card-meta>
            </a-card>
          </div>
          <div class="mb-3">
            <a-card style="width: 300px; margin-top: 16px" :loading="true" title="Card title"
              >whatever content</a-card
            >
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: 'KitAntdCardExample',
}
</script>
