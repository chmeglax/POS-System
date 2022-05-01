<template>
  <div class="card-header-flex">
    <div class="d-flex flex-column justify-content-center mr-auto">
      <h5 class="mb-0">
        <strong>{{ data.title }}</strong>
      </h5>
    </div>
    <div class="d-inline-flex align-items-center">
      <a-dropdown placement="bottomRight" :trigger="['click']">
        <a class="nav-link dropdown-toggle" href="javascript: void(0);" role="button">Dropdown</a>
        <template #overlay>
          <a-menu>
            <a-menu-item>
              <a href="javascript:;">Action</a>
            </a-menu-item>
            <a-menu-item>
              <a href="javascript:;">Another action</a>
            </a-menu-item>
            <a-menu-item>
              <a href="javascript:;">Something else here</a>
            </a-menu-item>
            <a-menu-divider />
            <a-menu-item>
              <a href="javascript:;">Separated link</a>
            </a-menu-item>
          </a-menu>
        </template>
      </a-dropdown>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    data: {
      type: Object,
      default: () => {
        return {
          title: 'With dropdown',
        }
      },
    },
  },
}
</script>
