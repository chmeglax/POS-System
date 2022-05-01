<template>
  <div
    :class="{
      [$style.footerDark]: true,
      [$style.footerFullWidth]: !settings.isContentMaxWidth,
    }"
  >
    <div class="pt-5 pb-4" :class="$style.outer">
      <div :class="$style.container">
        <div class="row">
          <div class="col-md-6 col-lg-4">
            <h5 class="font-weight-bold mb-4">Quick Links</h5>
            <div class="row">
              <div class="col-sm-6">
                <div class="d-flex flex-column">
                  <a class="mb-1 vb__utils__link" href="#"> Documentation </a>
                  <a class="mb-1 vb__utils__link" href="#"> Service Rules </a>
                  <a class="mb-1 vb__utils__link" href="#"> User Settings </a>
                  <a class="mb-1 vb__utils__link" href="#">
                    Dashboard Setings
                  </a>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="d-flex flex-column mb-4">
                  <a class="mb-1 vb__utils__link" href="#"> User Settings </a>
                  <a class="mb-1 vb__utils__link" href="#">
                    Dashboard Settings
                  </a>
                  <a class="mb-1 vb__utils__link" href="#"> Documentation </a>
                  <a class="mb-1 vb__utils__link" href="#"> Service Rules </a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-12 col-lg-4">
            <h5 class="font-weight-bold mb-4">About</h5>
            <p>
              Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum
              has been the industrys standard dummy text ever since the 1500s, when an unknown
              printer took a galley of type and scrambled it to make a type specimen book.
            </p>
          </div>
          <div class="col-md-6 col-lg-4">
            <h5 class="font-weight-bold mb-4">Get In Touch</h5>
            <input
              class="form-control mb-4"
              :class="$style.input"
              type="email"
              placeholder="Enter your email"
            />
            <button type="button" class="btn btn-primary">Subscribe</button>
          </div>
        </div>
      </div>
    </div>
    <div :class="$style.bottom" class="py-4">
      <div :class="$style.container">
        <div class="d-sm-flex align-items-sm-center">
          <div class="clearfix mr-sm-auto" :class="$style.logo">
            <div :class="$style.logo__letter">
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
            </div>
            <div :class="$style.logo__name">{{ settings.logo }}</div>
            <div :class="$style.logo__descr">{{ settings.version }}</div>
          </div>
          <div class="d-flex flex-column flex-sm-row">
            <a class="mb-1 mb-sm-0 px-sm-3" href="#"> About </a>
            <a class="mb-1 mb-sm-0 px-sm-3" href="#"> Terms of Use </a>
            <a class="mb-1 mb-sm-0 px-sm-3" href="#"> Buy Now </a>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { computed } from 'vue'
import { useStore } from 'vuex'
export default {
  setup() {
    const store = useStore()
    const settings = computed(() => store.getters.settings)

    return {
      settings,
    }
  },
}
</script>

<style lang="scss" module>
@import './style.module.scss';
</style>
