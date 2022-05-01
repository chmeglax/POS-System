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
          <a :href="example.link" target="_blank" class="btn btn-sm btn-light mr-3">
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
import VbBootstrapAlertExample from './examples/alert/index'
import VbBootstrapBadgesExample from './examples/badges/index'
import VbBootstrapBreadcrumbExample from './examples/breadcrumb/index'
import VbBootstrapButtonsExample from './examples/buttons/index'
import VbBootstrapButtonGroupExample from './examples/button-group/index'
import VbBootstrapButtonToolbarExample from './examples/button-toolbar/index'
import VbBootstrapCardsExample from './examples/cards/index'
import VbBootstrapCarouselExample from './examples/carousel/index'
import VbBootstrapCollapseExample from './examples/collapse/index'
import VbBootstrapDropdownsExample from './examples/dropdowns/index'
import VbBootstrapEmbedExample from './examples/embed/index'
import VbBootstrapFormExample from './examples/form/index'
import VbBootstrapFormCheckboxExample from './examples/form-checkbox/index'
import VbBootstrapFormFileExample from './examples/form-file/index'
import VbBootstrapFormGroupExample from './examples/form-group/index'
import VbBootstrapFormInputExample from './examples/form-input/index'
import VbBootstrapFormRadioExample from './examples/form-radio/index'
import VbBootstrapFormSelectExample from './examples/form-select/index'
import VbBootstrapFormTextareaExample from './examples/form-textarea/index'
import VbBootstrapImageExample from './examples/image/index'
import VbBootstrapInputGroupExample from './examples/input-group/index'
import VbBootstrapJumbotronExample from './examples/jumbotron/index'
import VbBootstrapLayoutExample from './examples/layout/index'
import VbBootstrapLinkExample from './examples/link/index'
import VbBootstrapListGroupExample from './examples/list-group/index'
import VbBootstrapMediaExample from './examples/media/index'
import VbBootstrapModalExample from './examples/modal/index'
import VbBootstrapNavExample from './examples/nav/index'
import VbBootstrapNavbarExample from './examples/navbar/index'
import VbBootstrapPaginationExample from './examples/pagination/index'
import VbBootstrapPaginationNavExample from './examples/pagination-nav/index'
import VbBootstrapPopoverExample from './examples/popover/index'
import VbBootstrapProgressExample from './examples/progress/index'
import VbBootstrapSpinnerExample from './examples/spinner/index'
import VbBootstrapTableExample from './examples/table/index'
import VbBootstrapTabsExample from './examples/tabs/index'
import VbBootstrapToastExample from './examples/toast/index'
import VbBootstrapTooltipExample from './examples/tooltip/index'

import data from './data.json'

export default {
  components: {
    'vb-bootstrap-alert-example': VbBootstrapAlertExample,
    'vb-bootstrap-badges-example': VbBootstrapBadgesExample,
    'vb-bootstrap-breadcrumb-example': VbBootstrapBreadcrumbExample,
    'vb-bootstrap-buttons-example': VbBootstrapButtonsExample,
    'vb-bootstrap-button-group-example': VbBootstrapButtonGroupExample,
    'vb-bootstrap-button-toolbar-example': VbBootstrapButtonToolbarExample,
    'vb-bootstrap-cards-example': VbBootstrapCardsExample,
    'vb-bootstrap-carousel-example': VbBootstrapCarouselExample,
    'vb-bootstrap-collapse-example': VbBootstrapCollapseExample,
    'vb-bootstrap-dropdowns-example': VbBootstrapDropdownsExample,
    'vb-bootstrap-embed-example': VbBootstrapEmbedExample,
    'vb-bootstrap-form-example': VbBootstrapFormExample,
    'vb-bootstrap-form-checkbox-example': VbBootstrapFormCheckboxExample,
    'vb-bootstrap-form-file-example': VbBootstrapFormFileExample,
    'vb-bootstrap-form-group-example': VbBootstrapFormGroupExample,
    'vb-bootstrap-form-input-example': VbBootstrapFormInputExample,
    'vb-bootstrap-form-radio-example': VbBootstrapFormRadioExample,
    'vb-bootstrap-form-select-example': VbBootstrapFormSelectExample,
    'vb-bootstrap-form-textarea-example': VbBootstrapFormTextareaExample,
    'vb-bootstrap-image-example': VbBootstrapImageExample,
    'vb-bootstrap-input-group-example': VbBootstrapInputGroupExample,
    'vb-bootstrap-jumbotron-example': VbBootstrapJumbotronExample,
    'vb-bootstrap-layout-example': VbBootstrapLayoutExample,
    'vb-bootstrap-link-example': VbBootstrapLinkExample,
    'vb-bootstrap-list-group-example': VbBootstrapListGroupExample,
    'vb-bootstrap-media-example': VbBootstrapMediaExample,
    'vb-bootstrap-modal-example': VbBootstrapModalExample,
    'vb-bootstrap-nav-example': VbBootstrapNavExample,
    'vb-bootstrap-navbar-example': VbBootstrapNavbarExample,
    'vb-bootstrap-pagination-example': VbBootstrapPaginationExample,
    'vb-bootstrap-pagination-nav-example': VbBootstrapPaginationNavExample,
    'vb-bootstrap-popover-example': VbBootstrapPopoverExample,
    'vb-bootstrap-progress-example': VbBootstrapProgressExample,
    'vb-bootstrap-spinner-example': VbBootstrapSpinnerExample,
    'vb-bootstrap-table-example': VbBootstrapTableExample,
    'vb-bootstrap-tabs-example': VbBootstrapTabsExample,
    'vb-bootstrap-toast-example': VbBootstrapToastExample,
    'vb-bootstrap-tooltip-example': VbBootstrapTooltipExample,
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
