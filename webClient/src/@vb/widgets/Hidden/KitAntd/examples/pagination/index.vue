<template>
  <div>
    <h5 class="mb-3">
      <strong>Pagination Usage</strong>
    </h5>
    <div class="mb-5">
      <a-pagination v-model="current" :total="50" />
    </div>
    <div class="mb-5">
      <a-pagination :default-current="6" :total="500" />
    </div>
    <div class="mb-5">
      <a-pagination
        show-size-changer
        @showSizeChange="onShowSizeChange"
        :total="500"
        v-model="current"
      />
    </div>
    <div class="mb-5">
      <a-pagination show-quick-jumper :default-current="2" :total="500" />
    </div>
    <div class="mb-5">
      <a-pagination size="small" :total="50" />
    </div>
    <div class="mb-5">
      <a-pagination size="small" :total="50" show-size-changer show-quick-jumper />
    </div>
    <div class="mb-5">
      <a-pagination size="small" :total="50" :show-total="total => `Total ${total} items`" />
    </div>
  </div>
</template>
<script>
export default {
  name: 'KitAntdPaginationExample',
  data() {
    return {
      current: 2,
    }
  },
}
</script>
