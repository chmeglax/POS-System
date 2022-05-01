<template>
  <div :class="$style.container">
    <div :class="$style.head">
      <h4>Total: $2,436.00</h4>
      <span>4 Items</span>
    </div>
    <div v-for="item in data" :key="item.id">
      <a href="#" class="clearfix" :class="$style.item">
        <div :class="$style.image">
          <img :src="`/resources/images/products/${item.img}`" :alt="item.title" />
        </div>
        <div :class="$style.info">
          <div :class="$style.title">{{ item.title }}</div>
          <div :class="$style.description">{{ item.description }}</div>
          <div :class="$style.price">
            <strong>{{ item.price }}</strong>
            <sup v-if="item.oldPrice">
              <u>{{ item.oldPrice }}</u>
            </sup>
            <span class="ml-1">x1</span>
          </div>
        </div>
        <span :class="$style.close">
          <i class="fe fe-x-circle" />
        </span>
      </a>
    </div>
    <div :class="$style.footer">
      <button type="button" class="btn btn-primary text-center d-block width-100p">
        <i class="fe fe-shopping-cart" />
        Checkout
      </button>
    </div>
  </div>
</template>
<script>
export default {
  name: 'VbGeneral26',
  setup() {
    const data = [
      {
        id: 1,
        title: 'Gigabyte GeForce RTX 3060 Ti Eagle 8G',
        sku: 'GV-N306TEAGLE-8GD',
        img: '001.jpg',
        price: 599,
        oldPrice: 736,
        description:
          'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.',
      },
      {
        id: 2,
        title: 'Gigabyte GeForce GTX 1660 Super Gaming OC 6GB GDDR6',
        sku: 'GV-N166SGAMING OC-6GD',
        img: '002.jpg',
        price: 399.99,
        oldPrice: 470,
        description:
          'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.',
      },
      {
        id: 3,
        title: 'Palit GeForce RTX 2070 Super GR 8GB GDDR6',
        sku: 'NE6207S020P2-1040G',
        img: '003.jpg',
        price: 649,
        description:
          'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.',
      },
      {
        id: 4,
        title: 'Palit GeForce RTX 3080 GamingPro 10GB GDDR6X',
        sku: 'NED3080019IA-132AA',
        img: '004.jpg',
        price: 789.99,
        oldPrice: 1099,
        description:
          'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.',
      },
    ]

    return {
      data,
    }
  },
}
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
