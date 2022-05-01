<template>
  <div>
    <div class="pb-4 mb-3 border-bottom">
      <label class="font-weight-bold d-block" htmlFor="search-input">
        <span class="mb-2 d-inline-block">Search Post</span>
        <input
          id="search-input"
          class="form-control width-100p"
          type="text"
          placeholder="Search post..."
        />
      </label>
    </div>
    <div class="pb-4 mb-3 border-bottom">
      <label class="font-weight-bold d-block" htmlFor="subscribe-input">
        <span class="mb-2 d-inline-block">Subscribe</span>
        <input
          id="subscribe-input"
          class="form-control width-100p"
          type="text"
          placeholder="Enter your email..."
        />
      </label>
    </div>
    <div class="pb-4 border-bottom">
      <div class="font-weight-bold mb-2">Categories</div>
      <div>
        <a
          href="javascript: void(0)"
          class="badge text-blue text-uppercase bg-light font-size-12 mr-2"
        >
          Umi
        </a>
        <a
          href="javascript: void(0)"
          class="badge text-blue text-uppercase bg-light font-size-12 mr-2"
        >
          React-framework
        </a>
        <a
          href="javascript: void(0)"
          class="badge text-blue text-uppercase bg-light font-size-12 mr-2"
        >
          Umijs
        </a>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: 'VbList21',
}
</script>
