<template>
  <div>
    <div class="d-flex flex-wrap mb-3">
      <div class="mr-5 flex-grow-1">
        <div class="text-uppercase text-dark font-weight-bold mb-3">
          Calendars
        </div>
        <div class="d-flex flex-wrap">
          <a-checkbox :class="$style.event" default-checked>Gmail</a-checkbox>
          <a-checkbox :class="$style.event">Birthdays</a-checkbox>
        </div>
      </div>
      <div class="flex-grow-1">
        <div class="text-uppercase text-dark font-weight-bold mb-3">Events</div>
        <div class="d-flex flex-wrap">
          <div :class="$style.event">
            <div class="vb__utils__donut vb__utils__donut--danger" />
            Meeting
          </div>
          <div :class="$style.event">
            <div class="vb__utils__donut vb__utils__donut--primary" />
            Holidays
          </div>
          <div :class="$style.event">
            <div class="vb__utils__donut vb__utils__donut--orange" />
            Milestones
          </div>
          <div :class="$style.event">
            <div class="vb__utils__donut vb__utils__donut--success" />
            Conference
          </div>
        </div>
      </div>
    </div>
    <a-calendar v-model:value="value">
      <template #dateCellRender="{ current: value }">
        <ul class="events">
          <li v-for="item in getListData(value)" :key="item.content">
            <a-badge :status="item.type" :text="item.content" />
          </li>
        </ul>
      </template>
      <template #monthCellRender="{ current: value }">
        <div v-if="getMonthData(value)" class="notes-month">
          <section>{{ getMonthData(value) }}</section>
          <span>Backlog number</span>
        </div>
      </template>
    </a-calendar>
  </div>
</template>
<script>
import { defineComponent, ref } from 'vue'
export default defineComponent({
  setup() {
    const value = ref()

    const getListData = value => {
      let listData

      switch (value.date()) {
        case 8:
          listData = [
            {
              type: 'warning',
              content: 'This is warning event.',
            },
            {
              type: 'success',
              content: 'This is usual event.',
            },
          ]
          break

        case 10:
          listData = [
            {
              type: 'warning',
              content: 'This is warning event.',
            },
            {
              type: 'success',
              content: 'This is usual event.',
            },
            {
              type: 'error',
              content: 'This is error event.',
            },
          ]
          break

        case 15:
          listData = [
            {
              type: 'warning',
              content: 'This is warning event',
            },
            {
              type: 'success',
              content: 'This is very long usual event。。....',
            },
            {
              type: 'error',
              content: 'This is error event 1.',
            },
            {
              type: 'error',
              content: 'This is error event 2.',
            },
            {
              type: 'error',
              content: 'This is error event 3.',
            },
            {
              type: 'error',
              content: 'This is error event 4.',
            },
          ]
          break

        default:
      }

      return listData || []
    }

    const getMonthData = value => {
      if (value.month() === 8) {
        return 1394
      }
    }

    return {
      value,
      getListData,
      getMonthData,
    }
  },
})
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
