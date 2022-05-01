<template>
  <div>
    <!-- [TODO_VUELAYERS] -->
    <div>
      <a-alert message="Chart is disabled" type="info" show-icon>
        <template #description
          >The "vuelayers" plugin has not yet migrated to Vue3.
          <a
            href="https://github.com/ghettovoice/vuelayers"
            target="_blank"
            rel="noopener noreferrer"
            class="vb__utils__link"
            >Visit github repository for details</a
          ></template
        >
      </a-alert>
    </div>
    <div class="table-responsive text-nowrap">
      <a-table :columns="columns" :data-source="data" :pagination="false">
        <template #location="{ text }">
          <a href="javascript: void(0);" class="text-blue">{{ text }}</a>
        </template>
        <template #value="{ text }">
          <span class="font-weight-bold">{{ text }}</span>
        </template>
      </a-table>
    </div>
  </div>
</template>
<script>
import data from './data.json'
export default {
  name: 'VbChart7',
  data: function() {
    const columns = [
      {
        title: 'Action name',
        dataIndex: 'actionName',
        className: 'bg-transparent text-gray-6',
      },
      {
        title: 'Location',
        dataIndex: 'location',
        className: 'bg-transparent',
        slots: { customRender: 'location' },
      },
      {
        title: 'Phone',
        dataIndex: 'phone',
        className: 'text-left text-gray-6 bg-transparent',
      },
      {
        title: 'Value',
        dataIndex: 'value',
        className: 'text-right bg-transparent text-gray-6',
        slots: { customRender: 'value' },
      },
    ]
    return {
      data,
      columns,
      zoom: 1,
      center: [0, 0],
      rotation: 0,
      geolocPosition: undefined,
      minZoom: 1,
    }
  },
}
</script>
