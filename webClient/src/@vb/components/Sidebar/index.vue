<template>
  <div>
    <div
      :class="{
        [$style.vb__sidebar]: true,
        [$style.vb__sidebar__toggled]: settings.isSidebarOpen,
      }"
    >
      <perfect-scrollbar :style="{ height: '100%' }">
        <div :class="$style.vb__sidebar__inner">
          <a
            href="javascript: void(0);"
            :class="$style.vb__sidebar__close"
            class="fe fe-x"
            @click="toggleSettings()"
          />
          <h5 class="mb-4">
            <strong>Settings</strong>
          </h5>
          <a-collapse v-model:activeKey="activeKey" accordion :bordered="false">
            <a-collapse-panel key="1" header="Application Settings">
              <div class="pt-2 mb-2">
                <h6>
                  <strong>Application Name</strong>
                </h6>
                <a-input :value="settings.logo" @change="changeSettingEvent($event, 'logo')" />
              </div>
              <div class="pt-2 mb-2">
                <h6>
                  <strong>Router Animation</strong>
                </h6>
                <a-select
                  :default-value="settings.routerAnimation"
                  style="width: 100%"
                  @change="value => changeSettingValue(value, 'routerAnimation')"
                >
                  <a-select-option value="none"> None </a-select-option>
                  <a-select-option value="slide-fadein-up">
                    Slide Up
                  </a-select-option>
                  <a-select-option value="slide-fadein-right">
                    Slide Right
                  </a-select-option>
                  <a-select-option value="fadein"> Fade In </a-select-option>
                  <a-select-option value="zoom-fadein"> Zoom </a-select-option>
                </a-select>
              </div>
              <div class="pt-2 mb-2">
                <h6>
                  <strong>Internationalization</strong>
                </h6>
                <a-select
                  :value="settings.locale"
                  style="width: 100%"
                  @change="value => changeSettingValue(value, 'locale')"
                >
                  <a-select-option value="en-US">
                    English (en-US)
                  </a-select-option>
                  <a-select-option value="fr-FR">
                    French (fr-FR)
                  </a-select-option>
                  <a-select-option value="ru-RU">
                    Русский (ru-RU)
                  </a-select-option>
                  <a-select-option value="zh-CN">
                    简体中文 (zh-CN))
                  </a-select-option>
                </a-select>
              </div>
            </a-collapse-panel>
            <a-collapse-panel key="2" header="Layout Settings">
              <div class="pt-3 mb-2">
                <h6>
                  <strong>Visual Builder Style</strong>
                </h6>
                <div class="pt-1 clearfix">
                  <a-radio-group
                    :default-value="settings.version"
                    @change="changeSettingEvent($event, 'version')"
                  >
                    <div class="row">
                      <div class="col-6">
                        <div class="mb-2">
                          <a-radio :value="'fluent'">Fluent (System Default Font)</a-radio>
                        </div>
                        <div class="mb-2">
                          <a-radio :value="'clean'">Clean (Mukta Font)</a-radio>
                        </div>
                        <div class="mb-2">
                          <a-radio :value="'air'">Air (Source Sans Font)</a-radio>
                        </div>
                      </div>
                    </div>
                  </a-radio-group>
                </div>
              </div>
              <div class="pt-2 mb-2">
                <div class="row">
                  <div class="col-auto mr-auto">
                    <h6>
                      <strong>Dark Theme</strong>
                    </h6>
                  </div>
                  <div class="col-auto">
                    <div class="{style.vb__sidebar__fixSwitch}">
                      <a-switch
                        :checked="settings.theme === 'dark'"
                        @click="changeSettingValue($event ? 'dark' : 'default', 'theme')"
                      />
                    </div>
                  </div>
                </div>
              </div>
              <div class="pt-2 mb-2">
                <div class="row">
                  <div class="col-auto mr-auto">
                    <h6>
                      <strong>Content Max-Width</strong>
                    </h6>
                  </div>
                  <div class="col-auto">
                    <div class="vb__sidebar__fixSwitch">
                      <a-switch
                        :checked="settings.isContentMaxWidth"
                        @click="changeSettingSwitch($event, 'isContentMaxWidth')"
                      />
                    </div>
                  </div>
                </div>
              </div>
              <div class="pt-2 mb-2">
                <div class="row">
                  <div class="col-auto mr-auto">
                    <h6>
                      <strong>Layout Max-Width</strong>
                    </h6>
                  </div>
                  <div class="col-auto">
                    <div class="vb__sidebar__fixSwitch">
                      <a-switch
                        :checked="settings.isAppMaxWidth"
                        @click="changeSettingSwitch($event, 'isAppMaxWidth')"
                      />
                    </div>
                  </div>
                </div>
              </div>
              <div class="pt-2 mb-2">
                <div class="row">
                  <div class="col-auto mr-auto">
                    <h6>
                      <strong>Layout Gray Bg</strong>
                    </h6>
                  </div>
                  <div class="col-auto">
                    <div class="vb__sidebar__fixSwitch">
                      <a-switch
                        :checked="settings.isGrayBackground"
                        @click="changeSettingSwitch($event, 'isGrayBackground')"
                      />
                    </div>
                  </div>
                </div>
              </div>
              <div class="pt-2 mb-2">
                <div class="row">
                  <div class="col-auto mr-auto">
                    <h6>
                      <strong>Card Squared Borders</strong>
                    </h6>
                  </div>
                  <div class="col-auto">
                    <div class="vb__sidebar__fixSwitch">
                      <a-switch
                        :checked="settings.isSquaredBorders"
                        @click="changeSettingSwitch($event, 'isSquaredBorders')"
                      />
                    </div>
                  </div>
                </div>
              </div>
              <div class="pt-2 mb-2">
                <div class="row">
                  <div class="col-auto mr-auto">
                    <h6>
                      <strong>Card Shadow</strong>
                    </h6>
                  </div>
                  <div class="col-auto">
                    <div class="vb__sidebar__fixSwitch">
                      <a-switch
                        :checked="settings.isCardShadow"
                        @click="changeSettingSwitch($event, 'isCardShadow')"
                      />
                    </div>
                  </div>
                </div>
              </div>
              <div class="pt-2 mb-2">
                <div class="row">
                  <div class="col-auto mr-auto">
                    <h6>
                      <strong>Card Borderless</strong>
                    </h6>
                  </div>
                  <div class="col-auto">
                    <div class="vb__sidebar__fixSwitch">
                      <a-switch
                        :checked="settings.isBorderless"
                        @click="changeSettingSwitch($event, 'isBorderless')"
                      />
                    </div>
                  </div>
                </div>
              </div>
              <div class="pt-2 mb-2">
                <div class="row">
                  <div class="col-auto mr-auto">
                    <h6>
                      <strong>Auth Layout Topbar</strong>
                    </h6>
                  </div>
                  <div class="col-auto">
                    <div class="vb__sidebar__fixSwitch">
                      <a-switch
                        :checked="settings.isAuthTopbar"
                        @click="changeSettingSwitch($event, 'isAuthTopbar')"
                      />
                    </div>
                  </div>
                </div>
              </div>
              <div class="pt-2 mb-2">
                <div class="row">
                  <div class="col-auto mr-auto">
                    <h6>
                      <strong>Auth Layout Bg</strong>
                    </h6>
                  </div>
                  <div class="col-auto">
                    <div class="vb__sidebar__fixSwitch">
                      <vb-color-picker
                        :value="settings.authPagesColor"
                        :setting="'authPagesColor'"
                        :colors="['white', 'gray', 'image']"
                      />
                    </div>
                  </div>
                </div>
              </div>
            </a-collapse-panel>
            <a-collapse-panel key="3" header="Menu Settings">
              <div class="pt-2 mb-2">
                <h6>
                  <strong>Menu Variant</strong>
                </h6>
                <div class="pt-1 clearfix">
                  <a-radio-group
                    :default-value="settings.layoutMenu"
                    @change="changeSettingEvent($event, 'layoutMenu')"
                  >
                    <div class="row">
                      <div class="col-6">
                        <div class="mb-2">
                          <a-radio :value="'classic'">Classic</a-radio>
                        </div>
                        <div class="mb-2">
                          <a-radio :value="'flyout'">Flyout</a-radio>
                        </div>
                        <div class="mb-2">
                          <a-radio :value="'simply'">Simply</a-radio>
                        </div>
                      </div>
                      <div class="col-6">
                        <div class="mb-2">
                          <a-radio :value="'noMenu'">None</a-radio>
                        </div>
                      </div>
                    </div>
                  </a-radio-group>
                </div>
              </div>
              <div v-if="settings.layoutMenu === 'classic' || settings.layoutMenu === 'flyout'">
                <div class="pt-2 mb-2">
                  <h6>
                    <strong>Menu Layout Type</strong>
                  </h6>
                  <div class="pt-1 clearfix">
                    <a-radio-group
                      :default-value="settings.menuLayoutType"
                      @change="changeSettingEvent($event, 'menuLayoutType')"
                    >
                      <div class="row">
                        <div class="col-6">
                          <div class="mb-2">
                            <a-radio :value="'left'">Left</a-radio>
                          </div>
                          <div class="mb-2">
                            <a-radio :value="'top'">Top</a-radio>
                          </div>
                        </div>
                      </div>
                    </a-radio-group>
                  </div>
                </div>
                <div v-if="settings.layoutMenu === 'flyout'" class="pt-2 mb-2">
                  <h6>
                    <strong>Sub Menu Type</strong>
                  </h6>
                  <div class="pt-1 clearfix">
                    <a-radio-group
                      :default-value="settings.flyoutMenuType"
                      @change="changeSettingEvent($event, 'flyoutMenuType')"
                    >
                      <div class="row">
                        <div class="col-6">
                          <div class="mb-2">
                            <a-radio :value="'flyout'">Flyout</a-radio>
                          </div>
                          <div class="mb-2">
                            <a-radio :value="'default'">Default</a-radio>
                          </div>
                          <div class="mb-2">
                            <a-radio :value="'compact'">Compact</a-radio>
                          </div>
                        </div>
                      </div>
                    </a-radio-group>
                  </div>
                </div>
              </div>
              <div
                v-if="
                  settings.layoutMenu === 'classic' ||
                    settings.layoutMenu === 'flyout' ||
                    settings.layoutMenu === 'simply'
                "
              >
                <div class="pt-2 mb-2">
                  <div class="row">
                    <div class="col-auto mr-auto">
                      <h6>
                        <strong>Menu Color</strong>
                      </h6>
                    </div>
                    <div class="col-auto">
                      <div class="vb__sidebar__fixColorPicker">
                        <vb-color-picker
                          :value="settings.menuColor"
                          :setting="'menuColor'"
                          :colors="['white', 'gray', 'dark']"
                        />
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div v-if="settings.layoutMenu === 'flyout'">
                <div
                  v-if="
                    settings.flyoutMenuType === 'flyout' || settings.flyoutMenuType === 'compact'
                  "
                  class="pt-2 mb-2"
                >
                  <div class="row">
                    <div class="col-auto mr-auto">
                      <h6>
                        <strong>Flyout Color</strong>
                      </h6>
                    </div>
                    <div class="col-auto">
                      <div class="vb__sidebar__fixColorPicker">
                        <vb-color-picker
                          :value="settings.flyoutMenuColor"
                          :setting="'flyoutMenuColor'"
                          :colors="['white', 'gray', 'dark', 'blue']"
                        />
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div v-if="settings.layoutMenu === 'classic' || settings.layoutMenu === 'flyout'">
                <div class="pt-2 mb-2">
                  <div class="row">
                    <div class="col-auto mr-auto">
                      <h6>
                        <strong>Menu Collapsed</strong>
                      </h6>
                    </div>
                    <div class="col-auto">
                      <div class="vb__sidebar__fixSwitch">
                        <a-switch
                          :checked="settings.isMenuCollapsed"
                          @click="changeSettingSwitch($event, 'isMenuCollapsed')"
                        />
                      </div>
                    </div>
                  </div>
                </div>
                <div class="pt-2 mb-2">
                  <div class="row">
                    <div class="col-auto mr-auto">
                      <h6>
                        <strong>Menu Unfixed</strong>
                      </h6>
                    </div>
                    <div class="col-auto">
                      <div class="vb__sidebar__fixSwitch">
                        <a-switch
                          :checked="settings.isMenuUnfixed"
                          @click="changeSettingSwitch($event, 'isMenuUnfixed')"
                        />
                      </div>
                    </div>
                  </div>
                </div>
                <div class="pt-2 mb-2">
                  <div class="row">
                    <div class="col-auto mr-auto">
                      <h6>
                        <strong>Menu Shadow</strong>
                      </h6>
                    </div>
                    <div class="col-auto">
                      <div class="vb__sidebar__fixSwitch">
                        <a-switch
                          :checked="settings.isMenuShadow"
                          @click="changeSettingSwitch($event, 'isMenuShadow')"
                        />
                      </div>
                    </div>
                  </div>
                </div>
                <div v-if="settings.menuLayoutType === 'left'" class="pt-2 mb-2">
                  <h6>
                    <strong>Menu Width</strong>
                  </h6>
                  <div class="pt-1 clearfix">
                    <a-slider v-model:value="settings.leftMenuWidth" :min="256" :max="330" />
                  </div>
                </div>
              </div>
            </a-collapse-panel>
            <a-collapse-panel key="4" header="Topbar Settings">
              <div class="pt-2 mb-2">
                <h6>
                  <strong>Topbar Variant</strong>
                </h6>
                <a-radio-group
                  :default-value="settings.layoutTopbar"
                  @change="changeSettingEvent($event, 'layoutTopbar')"
                >
                  <div class="row">
                    <div class="col-6">
                      <div class="mb-2">
                        <a-radio :value="'v1'">Variant 1</a-radio>
                      </div>
                    </div>
                    <div class="col-6">
                      <div class="mb-2">
                        <a-radio :value="'none'">None</a-radio>
                      </div>
                    </div>
                  </div>
                </a-radio-group>
              </div>
              <div class="pt-2 mb-2">
                <div class="row">
                  <div class="col-auto mr-auto">
                    <h6>
                      <strong>Topbar Separated</strong>
                    </h6>
                  </div>
                  <div class="col-auto">
                    <div class="vb__sidebar__fixSwitch">
                      <a-switch
                        :checked="settings.isTopbarSeparated"
                        @click="changeSettingSwitch($event, 'isTopbarSeparated')"
                      />
                    </div>
                  </div>
                </div>
              </div>
              <div class="pt-2 mb-2">
                <div class="row">
                  <div class="col-auto mr-auto">
                    <h6>
                      <strong>Topbar Fixed</strong>
                    </h6>
                  </div>
                  <div class="col-auto">
                    <div class="vb__sidebar__fixSwitch">
                      <a-switch
                        :checked="settings.isTopbarFixed"
                        @click="changeSettingSwitch($event, 'isTopbarFixed')"
                      />
                    </div>
                  </div>
                </div>
              </div>
              <div class="pt-2 mb-2">
                <div class="row">
                  <div class="col-auto mr-auto">
                    <h6>
                      <strong>Topbar Gray Bg</strong>
                    </h6>
                  </div>
                  <div class="col-auto">
                    <div class="vb__sidebar__fixSwitch">
                      <a-switch
                        :checked="settings.isGrayTopbar"
                        @click="changeSettingSwitch($event, 'isGrayTopbar')"
                      />
                    </div>
                  </div>
                </div>
              </div>
            </a-collapse-panel>
            <a-collapse-panel key="5" header="Breadcrumbs Settings">
              <div class="pt-2 mb-2">
                <h6>
                  <strong>Breadcrumbs Variant</strong>
                </h6>
                <a-radio-group
                  :default-value="settings.layoutBreadcrumbs"
                  @change="changeSettingEvent($event, 'layoutBreadcrumbs')"
                >
                  <div class="row">
                    <div class="col-6">
                      <div class="mb-2">
                        <a-radio :value="'v1'">Variant 1</a-radio>
                      </div>
                      <div class="mb-2">
                        <a-radio :value="'v2'">Variant 2</a-radio>
                      </div>
                    </div>
                    <div class="col-6">
                      <div class="mb-2">
                        <a-radio :value="'noBreadcrumbs'">None</a-radio>
                      </div>
                    </div>
                  </div>
                </a-radio-group>
              </div>
            </a-collapse-panel>
            <a-collapse-panel key="6" header="Footer Settings">
              <div class="pt-2 mb-1">
                <h6>
                  <strong>Footer Variant</strong>
                </h6>
                <a-radio-group
                  :default-value="settings.layoutFooter"
                  @change="changeSettingEvent($event, 'layoutFooter')"
                >
                  <div class="row">
                    <div class="col-6">
                      <div class="mb-2">
                        <a-radio :value="'v1'">Variant 1</a-radio>
                      </div>
                      <div class="mb-2">
                        <a-radio :value="'v2'">Variant 2</a-radio>
                      </div>
                      <div class="mb-2">
                        <a-radio :value="'v3'">Variant 3</a-radio>
                      </div>
                      <div class="mb-2">
                        <a-radio :value="'v4'">Variant 4</a-radio>
                      </div>
                    </div>
                    <div class="col-6">
                      <div class="mb-2">
                        <a-radio :value="'noFooter'">None</a-radio>
                      </div>
                    </div>
                  </div>
                </a-radio-group>
              </div>
            </a-collapse-panel>
          </a-collapse>
        </div>
      </perfect-scrollbar>
    </div>
    <div class="vb__utils__sidebar__buttons">
      <a-tooltip placement="left">
        <template #title>
          <span>Try Visual Builder</span>
        </template>
        <a
          href="https://visualbuilder.cloud"
          target="_blank"
          rel="noopener noreferrer"
          :class="'vb__utils__sidebar__button'"
        >
          <svg
            xmlns="http://www.w3.org/2000/svg"
            viewBox="0 0 24 24"
            version="1.1"
            height="24px"
            width="24px"
          >
            <g>
              <path
                fill="#4b7cf3"
                strokeWidth="1"
                stroke="#4b7cf3"
                d="M12,10.9c-0.1,0-0.2,0-0.2-0.1L3.5,6.1C3.4,6,3.3,5.8,3.3,5.6c0-0.2,0.1-0.3,0.2-0.4l8.2-4.7c0.2-0.1,0.3-0.1,0.5,0      l8.2,4.7c0.2,0.1,0.2,0.3,0.2,0.4S20.6,6,20.5,6.1l-8.2,4.7C12.2,10.8,12.1,10.9,12,10.9z M4.8,5.6L12,9.8l7.2-4.2L12,1.5      L4.8,5.6z"
              />
              <path
                fill="#4b7cf3"
                strokeWidth="1"
                stroke="#4b7cf3"
                d="M13.6,23.6c-0.1,0-0.2,0-0.2-0.1c-0.2-0.1-0.2-0.3-0.2-0.4v-9.5c0-0.2,0.1-0.3,0.2-0.4l8.2-4.7c0.2-0.1,0.3-0.1,0.5,0      c0.2,0.1,0.2,0.3,0.2,0.4v9.5c0,0.2-0.1,0.3-0.3,0.4l-8.2,4.7C13.8,23.6,13.7,23.6,13.6,23.6z M14.1,13.9v8.3l7.2-4.2V9.8      L14.1,13.9z"
              />
              <path
                fill="#4b7cf3"
                strokeWidth="1"
                stroke="#4b7cf3"
                d="M10.4,23.6c-0.1,0-0.2,0-0.2-0.1l-8.2-4.7c-0.2-0.1-0.3-0.3-0.3-0.4V8.9c0-0.2,0.1-0.3,0.2-0.4c0.2-0.1,0.3-0.1,0.5,0      l8.2,4.7c0.2,0.1,0.2,0.3,0.2,0.4v9.5c0,0.2-0.1,0.3-0.2,0.4C10.5,23.6,10.5,23.6,10.4,23.6z M2.7,18.1l7.2,4.2v-8.3L2.7,9.8      V18.1z"
              />
            </g>
          </svg>
        </a>
      </a-tooltip>
      <a-tooltip placement="left">
        <template #title>
          <span>Settings</span>
        </template>
        <a href="javascript: void(0);" class="vb__utils__sidebar__button" @click="toggleSettings()">
          <i class="fe fe-settings" />
        </a>
      </a-tooltip>
      <a-tooltip placement="left">
        <template #title>
          <span>Pre-Configured Layouts</span>
        </template>
        <a
          href="javascript: void(0);"
          class="vb__utils__sidebar__button"
          @click="togglePreselectedThemes()"
        >
          <i class="fe fe-image" />
        </a>
      </a-tooltip>
      <a-tooltip placement="left">
        <template #title>
          <span>Switch Dark / Light Theme</span>
        </template>
        <a
          href="javascript: void(0);"
          class="vb__utils__sidebar__button"
          @click="changeSettingValue(settings.theme === 'default' ? 'dark' : 'default', 'theme')"
        >
          <i v-if="settings.theme === 'default'" class="fe fe-moon" />
          <i v-if="settings.theme !== 'default'" class="fe fe-sun" />
        </a>
      </a-tooltip>
      <a-tooltip placement="left">
        <template #title>
          <span>Set Primary Color</span>
        </template>
        <a
          href="javascript: void(0);"
          :class="{
            vb__utils__sidebar__button: true,
            vb__utils__sidebar__button__color: true,
            vb__utils__sidebar__button__color__reset: settings.primaryColor === defaultColor,
          }"
        >
          <button type="button" tabindex="0" @click="resetColor()">
            <i class="fe fe-x-circle" />
          </button>
          <input
            id="colorPicker"
            v-model="settings.primaryColor"
            type="color"
            @change="e => selectColor(e.target.value)"
          />
          <i class="fe fe-package" />
        </a>
      </a-tooltip>
      <a-tooltip placement="left">
        <template #title>
          <span>Documentation</span>
        </template>
        <a
          href="https://docs.cleanuitemplate.com"
          target="_blank"
          rel="noopener noreferrer"
          class="vb__utils__sidebar__button"
        >
          <i class="fe fe-book-open" />
        </a>
      </a-tooltip>
    </div>
  </div>
</template>

<script>
import { computed, ref } from 'vue'
import { useStore } from 'vuex'
import throttle from 'lodash/throttle'
import VbColorPicker from './partials/colorPicker'

export default {
  components: { VbColorPicker },
  setup() {
    const defaultColor = '#4b7cf3'
    const activeKey = ref(['1'])
    const store = useStore()
    const settings = computed(() => store.getters.settings)

    const changeSettingValue = (value, setting) => {
      store.commit('CHANGE_SETTING', { setting, value })
    }
    const changeSettingEvent = (e, setting) => {
      const { value } = e.target
      store.commit('CHANGE_SETTING', { setting, value })
    }
    const changeSettingSwitch = (e, setting) => {
      const value = !settings.value[setting]
      store.commit('CHANGE_SETTING', { setting, value })
    }
    const toggleSettings = () => {
      store.commit('CHANGE_SETTING', {
        setting: 'isSidebarOpen',
        value: !settings.value['isSidebarOpen'],
      })
    }
    const togglePreselectedThemes = () => {
      store.commit('CHANGE_SETTING', {
        setting: 'isPreselectedOpen',
        value: !settings.value['isPreselectedOpen'],
      })
    }
    const selectColor = throttle(color => {
      store.commit('SET_PRIMARY_COLOR', { color })
    }, 200)
    const resetColor = () => {
      store.commit('SET_PRIMARY_COLOR', { color: defaultColor })
    }

    return {
      defaultColor,
      activeKey,
      settings,

      changeSettingValue,
      changeSettingEvent,
      changeSettingSwitch,
      toggleSettings,
      togglePreselectedThemes,
      selectColor,
      resetColor,
    }
  },
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
