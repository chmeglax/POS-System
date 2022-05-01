<template>
  <a-modal
    v-model:visible="isPreselectedOpen"
    title="Theme Configurator"
    :footer="null"
    :wrap-class-name="$style.wrapper"
    :mask-сlosable="false"
    :mask="false"
    @cancel="closeModal"
  >
    <div>
      <h6 class="mb-3">
        <strong>Pre-Configured Layouts</strong>
      </h6>
      <template v-for="(item, index) in themes" :key="index">
        <a-button
          size="large"
          :class="$style.button"
          :type="item.preselectedVariant === variant ? 'primary' : 'default'"
          @click="() => applyVariant(item.preselectedVariant)"
        >
          {{ item.preselectedVariant }}
        </a-button>
      </template>
    </div>
    <div class="row">
      <div class="col-lg-6">
        <div class="mt-4">
          <h6 class="mb-3">
            <strong>Visual Builder Style</strong>
          </h6>
          <a-radio-group :default-value="version" @change="changeSettingEvent($event, 'version')">
            <a-radio-button :value="'fluent'">Fluent</a-radio-button>
            <a-radio-button :value="'clean'">Clean</a-radio-button>
            <a-radio-button :value="'air'">Air</a-radio-button>
          </a-radio-group>
        </div>
      </div>
      <div class="col-lg-6">
        <div class="mt-4">
          <h6 class="mb-3">
            <strong>Theme</strong>
          </h6>
          <a-radio-group :default-value="theme" @change="changeSettingEvent($event, 'theme')">
            <a-radio-button :value="'default'">Light</a-radio-button>
            <a-radio-button :value="'dark'">Dark</a-radio-button>
          </a-radio-group>
        </div>
      </div>
    </div>
  </a-modal>
</template>

<script>
import { computed, ref, watch } from 'vue'
import { useStore } from 'vuex'
import themes from './configs.json'

export default {
  setup() {
    const store = useStore()
    const isPreselectedOpen = computed(() => store.getters.settings.isPreselectedOpen)
    const preselectedVariant = computed(() => store.getters.settings.preselectedVariant)
    const version = computed(() => store.getters.settings.version)
    const theme = computed(() => store.getters.settings.theme)
    const variant = ref('default')

    const closeModal = () => {
      store.commit('CHANGE_SETTING', {
        setting: 'isPreselectedOpen',
        value: false,
      })
    }

    const changeSettingEvent = (e, setting) => {
      const { value } = e.target
      store.commit('CHANGE_SETTING', { setting, value })
    }

    const applyVariant = key => {
      variant.value = key
      const payload = JSON.parse(JSON.stringify(themes[key]))
      if (theme.value === 'dark') {
        payload.menuColor = 'dark'
      }
      store.commit('CHANGE_SETTING_BULK', payload)
    }

    watch(preselectedVariant, preselectedVariant => {
      applyVariant(preselectedVariant)
    })

    return {
      isPreselectedOpen,
      preselectedVariant,
      version,
      theme,
      closeModal,
      changeSettingEvent,
      themes,
      applyVariant,
      variant,
    }
  },
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
