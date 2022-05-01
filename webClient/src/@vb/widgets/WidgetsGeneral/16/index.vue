<template>
  <div class="overflow-hidden position-relative rounded">
    <div v-if="isNew" :class="$style.new">New</div>
    <div class="card-body">
      <a
        href="#"
        :class="[$style.favorite, favorite ? 'text-dark' : 'text-gray-3']"
        @click="toggleFavorite"
      >
        <i class="fe fe-heart font-size-21" />
      </a>
      <div :class="$style.image" class="border-bottom height-250 mb-3">
        <img class="img-fluid" :src="image" :alt="name" />
      </div>
      <div class="font-size-24 font-weight-bold text-dark mb-2">
        {{ price }}
        <del v-if="oldPrice" class="align-text-top font-size-14 mr-2">
          {{ oldPrice }}
        </del>
      </div>
      <div>
        <a href="javascript:void(0);" class="text-blue font-size-18">
          {{ name }}
        </a>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: 'VbGeneral16',
  props: {
    isNew: {
      type: Boolean,
      default: Math.random() < 0.5,
    },
    isFavorite: {
      type: Boolean,
      default: Math.random() < 0.5,
    },
    image: {
      type: String,
      default: `resources/images/products/00${Math.floor(Math.random() * 4) + 1}.jpg`,
    },
    name: {
      type: String,
      default:
        'TP-Link AC1750 Smart WiFi Router - Dual Band Gigabit Wireless Internet Routers for Home',
    },
    price: {
      type: String,
      default: '99.99',
    },
    oldPrice: {
      type: String,
      default: '199.99',
    },
  },
  data: function() {
    return {
      favorite: this.isFavorite,
    }
  },
  methods: {
    toggleFavorite: function(event) {
      event.preventDefault()
      this.favorite = !this.favorite
    },
  },
}
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
