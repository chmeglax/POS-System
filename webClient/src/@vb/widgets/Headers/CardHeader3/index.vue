<template>
  <div class="card-header-flex align-items-center">
    <div class="d-flex flex-column justify-content-center mr-auto">
      <h5 class="mb-0">
        <strong>{{ data.title }}</strong>
      </h5>
    </div>
    <div>
      <a-tooltip placement="top" title="Unlock Account">
        <a class="btn btn-sm btn-light mr-2">
          <i class="fe fe-unlock" />
        </a>
      </a-tooltip>
      <a-tooltip placement="top" title="Mark as important">
        <a class="btn btn-sm btn-light mr-2">
          <i class="fe fe-star" />
        </a>
      </a-tooltip>
      <a-tooltip placement="top" title="Delete user">
        <a class="btn btn-sm btn-light">
          <i class="fe fe-trash" />
        </a>
      </a-tooltip>
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
          title: 'With actions',
        }
      },
    },
  },
}
</script>
