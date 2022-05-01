<template>
  <div>
    <h5 class="mb-3">
      <strong>Basic</strong>
    </h5>
    <div class="mb-5">
      <a-list bordered :data-source="data">
        <template #renderItem="{ text: item }">
          <a-list-item>{{ item }}</a-list-item>
        </template>
        <template #header>
          <div>Header</div>
        </template>
        <template #footer>
          <div>Footer</div>
        </template>
      </a-list>
    </div>
    <h5 class="mb-3">
      <strong>With Avatar</strong>
    </h5>
    <div class="mb-5">
      <a-list item-layout="horizontal" :data-source="data">
        <template #renderItem="{ text: item }">
          <a-list-item>
            <a-list-item-meta
              description="Ant Design, a design language for background applications, is refined by Ant UED Team"
            >
              <template #title>
                <a href="https://www.antdv.com/">{{ item.title }}</a>
              </template>
              <template #avatar>
                <a-avatar src="https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png" />
              </template>
            </a-list-item-meta>
          </a-list-item>
        </template>
      </a-list>
    </div>
  </div>
</template>
<script>
const data = [
  {
    title: 'Ant Design Title 1',
  },
  {
    title: 'Ant Design Title 2',
  },
  {
    title: 'Ant Design Title 3',
  },
  {
    title: 'Ant Design Title 4',
  },
]
export default {
  name: 'KitAntdListExample',
  data() {
    return {
      data,
    }
  },
}
</script>
