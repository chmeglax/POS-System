<template>
  <div>
    <div class="text-nowrap text-dark font-size-50 font-weight-bold">
      $29,931
      <sup class="text-uppercase text-gray-6 font-size-30">paid</sup>
    </div>
    <div class="table-responsive text-nowrap">
      <a-table :columns="columns" :data-source="data" :pagination="false">
        <template #avatar="{ text: link }">
          <div class="vb__utils__avatar">
            <img :src="link" alt="User" />
          </div>
        </template>
        <template #userName="{ text: user }">
          <div>
            <div>{{ user.name }}</div>
            <div class="text-gray-4">
              {{ user.position }}
            </div>
          </div>
        </template>
        <template #location="{ text }">
          <a href="javascript: void(0);" class="text-blue">{{ text }}</a>
        </template>
        <template #action>
          <div class="text-nowrap">
            <button type="button" class="btn btn-light">
              <span class="text-blue">Add</span>
            </button>
          </div>
        </template>
      </a-table>
    </div>
  </div>
</template>
<script>
import data from './data.json'
const columns = [
  {
    dataIndex: 'avatar',
    className: 'bg-transparent text-gray-6 width-50',
    slots: { customRender: 'avatar' },
  },
  {
    title: 'USER NAME',
    dataIndex: 'userName',
    className: 'bg-transparent text-gray-6',
    slots: { customRender: 'userName' },
  },
  {
    title: 'LOCATION',
    dataIndex: 'location',
    className: 'bg-transparent text-gray-6',
    slots: { customRender: 'location' },
  },
  {
    dataIndex: 'action',
    className: 'bg-transparent text-right',
    slots: { customRender: 'action' },
  },
]

export default {
  name: 'VbTable5',
  data: function() {
    return {
      columns,
      data,
    }
  },
}
</script>
