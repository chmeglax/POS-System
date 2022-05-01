<template>
  <div>
    <div class="mb-4">
      <button
        v-for="(item, index) in data"
        :key="item.name"
        type="button"
        class="btn btn-light mr-2 mb-2"
        :class="[selectedExampleIndex === index ? 'bg-primary text-white' : 'text-primary']"
        @click="setExample(index)"
      >
        {{ item.name }}
      </button>
    </div>
    <div class="card card-skip">
      <div class="card-header border-bottom">
        <h5>
          <strong class="mr-3">{{ example.name }}</strong>
          <a
            :href="example.link"
            rel="noopener noreferrer"
            target="_blank"
            class="btn btn-sm btn-light mr-3"
          >
            Documentation
            <i class="fe fe-external-link ml-2"></i>
          </a>
        </h5>
        <p class="mb-0">{{ example.description }}</p>
      </div>
      <div class="card-body">
        <component :is="example.component"></component>
      </div>
    </div>
  </div>
</template>
<script>
import KitAntdButtonExample from './examples/button/index'
import KitAntdIconExample from './examples/icon/index'
import KitAntdLayoutExample from './examples/layout/index'
import KitAntdAvatarExample from './examples/avatar/index'
import KitAntdBadgeExample from './examples/badge/index'
import KitAntdCollapseExample from './examples/collapse/index'
import KitAntdCommentExample from './examples/comment/index'
import KitAntdCarouselExample from './examples/carousel/index'
import KitAntdCardExample from './examples/card/index'
import KitAntdCalendarExample from './examples/calendar/index'
import KitAntdListExample from './examples/list/index'
import KitAntdPopoverExample from './examples/popover/index'
import KitAntdTreeExample from './examples/tree/index'
import KitAntdTooltipExample from './examples/tooltip/index'
import KitAntdTimelineExample from './examples/timeline/index'
import KitAntdTagExample from './examples/tag/index'
import KitAntdTabsExample from './examples/tabs/index'
import KitAntdTableExample from './examples/table/index'
import KitAntdAutoCompleteExample from './examples/autocomplete/index'
import KitAntdCheckboxExample from './examples/checkbox/index'
import KitAntdCascaderExample from './examples/cascader/index'
import KitAntdDatePickerExample from './examples/datepicker/index'
import KitAntdFormExample from './examples/form/index'
import KitAntdGridExample from './examples/grid/index'
import KitAntdInputNumberExample from './examples/inputnumber/index'
import KitAntdInputExample from './examples/input/index'
import KitAntdRateExample from './examples/rate/index'
import KitAntdRadioExample from './examples/radio/index'
import KitAntdSwitchExample from './examples/switch/index'
import KitAntdSliderExample from './examples/slider/index'
import KitAntdSelectExample from './examples/select/index'
import KitAntdTreeSelectExample from './examples/treeselect/index'
import KitAntdTransferExample from './examples/transfer/index'
import KitAntdTimePickerExample from './examples/timepicker/index'
import KitAntdUploadExample from './examples/upload/index'
import KitAntdAlertExample from './examples/alert/index'
import KitAntdDrawerExample from './examples/drawer/index'
import KitAntdModalExample from './examples/modal/index'
import KitAntdMessageExample from './examples/message/index'
import KitAntdNotificationExample from './examples/notification/index'
import KitAntdProgressExample from './examples/progress/index'
import KitAntdPopconfirmExample from './examples/popconfirm/index'
import KitAntdSpinExample from './examples/spin/index'
import KitAntdSkeletonExample from './examples/skeleton/index'
import KitAntdAffixExample from './examples/affix/index'
import KitAntdBreadcrumbExample from './examples/breadcrumb/index'
import KitAntdDropdownExample from './examples/dropdown/index'
import KitAntdMenuExample from './examples/menu/index'
import KitAntdPaginationExample from './examples/pagination/index'
import KitAntdStepsExample from './examples/steps/index'
import KitAntdAnchorExample from './examples/anchor/index'
import KitAntdBackTopExample from './examples/backtop/index'
import KitAntdDividerExample from './examples/divider/index'

import data from './data.json'

export default {
  components: {
    'kit-antd-button-example': KitAntdButtonExample,
    'kit-antd-icon-example': KitAntdIconExample,
    'kit-antd-layout-example': KitAntdLayoutExample,
    'kit-antd-avatar-example': KitAntdAvatarExample,
    'kit-antd-badge-example': KitAntdBadgeExample,
    'kit-antd-collapse-example': KitAntdCollapseExample,
    'kit-antd-comment-example': KitAntdCommentExample,
    'kit-antd-carousel-example': KitAntdCarouselExample,
    'kit-antd-card-example': KitAntdCardExample,
    'kit-antd-calendar-example': KitAntdCalendarExample,
    'kit-antd-list-example': KitAntdListExample,
    'kit-antd-popover-example': KitAntdPopoverExample,
    'kit-antd-tree-example': KitAntdTreeExample,
    'kit-antd-tooltip-example': KitAntdTooltipExample,
    'kit-antd-timeline-example': KitAntdTimelineExample,
    'kit-antd-tag-example': KitAntdTagExample,
    'kit-antd-tabs-example': KitAntdTabsExample,
    'kit-antd-table-example': KitAntdTableExample,
    'kit-antd-autocomplete-example': KitAntdAutoCompleteExample,
    'kit-antd-checkbox-example': KitAntdCheckboxExample,
    'kit-antd-cascader-example': KitAntdCascaderExample,
    'kit-antd-datepicker-example': KitAntdDatePickerExample,
    'kit-antd-form-example': KitAntdFormExample,
    'kit-antd-grid-example': KitAntdGridExample,
    'kit-antd-inputnumber-example': KitAntdInputNumberExample,
    'kit-antd-input-example': KitAntdInputExample,
    'kit-antd-rate-example': KitAntdRateExample,
    'kit-antd-radio-example': KitAntdRadioExample,
    'kit-antd-switch-example': KitAntdSwitchExample,
    'kit-antd-slider-example': KitAntdSliderExample,
    'kit-antd-select-example': KitAntdSelectExample,
    'kit-antd-treeselect-example': KitAntdTreeSelectExample,
    'kit-antd-transfer-example': KitAntdTransferExample,
    'kit-antd-timepicker-example': KitAntdTimePickerExample,
    'kit-antd-upload-example': KitAntdUploadExample,
    'kit-antd-alert-example': KitAntdAlertExample,
    'kit-antd-drawer-example': KitAntdDrawerExample,
    'kit-antd-modal-example': KitAntdModalExample,
    'kit-antd-message-example': KitAntdMessageExample,
    'kit-antd-notification-example': KitAntdNotificationExample,
    'kit-antd-progress-example': KitAntdProgressExample,
    'kit-antd-popconfirm-example': KitAntdPopconfirmExample,
    'kit-antd-spin-example': KitAntdSpinExample,
    'kit-antd-skeleton-example': KitAntdSkeletonExample,
    'kit-antd-affix-example': KitAntdAffixExample,
    'kit-antd-breadcrumb-example': KitAntdBreadcrumbExample,
    'kit-antd-dropdown-example': KitAntdDropdownExample,
    'kit-antd-menu-example': KitAntdMenuExample,
    'kit-antd-pagination-example': KitAntdPaginationExample,
    'kit-antd-steps-example': KitAntdStepsExample,
    'kit-antd-anchor-example': KitAntdAnchorExample,
    'kit-antd-backtop-example': KitAntdBackTopExample,
    'kit-antd-divider-example': KitAntdDividerExample,
  },
  data: function() {
    const selectedExampleIndex = 0
    const example = data[selectedExampleIndex]

    return {
      data,
      selectedExampleIndex,
      example,
    }
  },
  methods: {
    setExample: function(index) {
      this.selectedExampleIndex = index
      this.example = data[index]
    },
  },
}
</script>
