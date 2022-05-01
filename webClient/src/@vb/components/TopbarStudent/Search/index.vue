<template>
  <div class="d-inline-block mr-4" @keydown.esc="closeSearch()">
    <a-input
      ref="outerInput"
      :class="$style.extInput"
      :placeholder="$t('topBar.typeToSearch')"
      style="width: 200px"
      @focus="openSearch"
    >
      <template #prefix>
        <span>
          <search-outlined style="color: rgba(0, 0, 0, 0.25)" />
        </span>
      </template>
    </a-input>
    <div :class="[$style.livesearch, showSearch ? $style.livesearchVisible : '']">
      <button :class="$style.close" type="button" @click="closeSearch">
        <i class="fe fe-x" />
      </button>
      <div class="container-fluid">
        <div :class="$style.wrapper">
          <input
            ref="innerInput"
            v-model="searchText"
            :class="$style.searchInput"
            :placeholder="$t('topBar.typeToSearch')"
          />
          <ul :class="$style.options">
            <li :class="[$style.option, $style.optionCheckbox]">
              <a-checkbox checked> Search within page </a-checkbox>
            </li>
            <li :class="$style.option">Press enter to search</li>
          </ul>
          <div v-if="!searchText" :class="$style.results">
            <div :class="$style.resultsTitle">
              <span>No Results Found</span>
            </div>
          </div>
          <div v-if="searchText" :class="$style.results">
            <div :class="$style.resultsTitle">
              <span>Pages Search Results</span>
            </div>
            <div class="row">
              <div class="col-lg-4">
                <div :class="$style.resultContent">
                  <div
                    :class="$style.resultThumb"
                    :style="{
                      backgroundImage: 'url(\'resources/images/content/photos/1.jpeg\')',
                    }"
                  >
                    #1
                  </div>
                  <div :class="$style.result">
                    <div :class="$style.resultText">
                      Samsung Galaxy A50 4GB/64GB
                    </div>
                    <div :class="$style.resultSource">In some partition</div>
                  </div>
                </div>
                <div :class="$style.resultContent">
                  <div
                    :class="$style.resultThumb"
                    :style="{
                      backgroundImage: 'url(\'resources/images/content/photos/2.jpeg\')',
                    }"
                  >
                    #2
                  </div>
                  <div :class="$style.result">
                    <div :class="$style.resultText">Apple iPhone 11 64GB</div>
                    <div :class="$style.resultSource">In some partition</div>
                  </div>
                </div>
                <div :class="$style.resultContent">
                  <div
                    :class="$style.resultThumb"
                    :style="{
                      backgroundImage: 'url(\'resources/images/content/photos/3.jpeg\')',
                    }"
                  >
                    #3
                  </div>
                  <div :class="$style.result">
                    <div :class="$style.resultText">
                      Samsung Galaxy A51 SM-A515F/DS 4GB/64GB
                    </div>
                    <div :class="$style.resultSource">In some partition</div>
                  </div>
                </div>
                <div :class="$style.resultContent">
                  <div
                    :class="$style.resultThumb"
                    :style="{
                      backgroundImage: 'url(\'resources/images/content/photos/4.jpeg\')',
                    }"
                  >
                    #4
                  </div>
                  <div :class="$style.result">
                    <div :class="$style.resultText">
                      Xiaomi Redmi 8 4GB/64GB
                    </div>
                    <div :class="$style.resultSource">In some partition</div>
                  </div>
                </div>
              </div>
              <div class="col-lg-4">
                <div :class="$style.resultContent">
                  <div :class="$style.resultThumb">01</div>
                  <div :class="$style.result">
                    <div :class="$style.resultText">White Case</div>
                    <div :class="$style.resultSource">In some partition</div>
                  </div>
                </div>
                <div :class="$style.resultContent">
                  <div :class="$style.resultThumb">02</div>
                  <div :class="$style.result">
                    <div :class="$style.resultText">Blue Case</div>
                    <div :class="$style.resultSource">In some partition</div>
                  </div>
                </div>
                <div :class="$style.resultContent">
                  <div :class="$style.resultThumb">03</div>
                  <div :class="$style.result">
                    <div :class="$style.resultText">Green Case</div>
                    <div :class="$style.resultSource">In some partition</div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { ref } from 'vue'
import { SearchOutlined } from '@ant-design/icons-vue'

export default {
  components: {
    SearchOutlined,
  },
  setup() {
    const showSearch = ref(false)
    const searchText = ref('')
    const innerInput = ref(null)

    const openSearch = () => {
      showSearch.value = true
      setTimeout(() => {
        innerInput.value.focus()
      }, 100)
    }

    const closeSearch = () => {
      showSearch.value = false
    }

    return {
      showSearch,
      searchText,
      openSearch,
      closeSearch,
      innerInput,
    }
  },
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
