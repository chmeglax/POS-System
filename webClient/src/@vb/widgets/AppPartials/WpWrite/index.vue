<template>
  <div>
    <div class="d-flex align-items-center flex-wrap border-bottom mb-3 pb-3">
      <div class="vb__utils__avatar vb__utils__avatar--size64 mr-3 mb-3 flex-shrink-0">
        <img src="resources/images/avatars/5.jpg" alt="Mary Stanform" />
      </div>
      <div class="mb-3">
        <div class="font-weight-bold font-size-16 text-dark">
          Trinity Parson
        </div>
        <p class="font-italic">
          “I hope you enjoy reading this as much as I enjoyed writing this.”
        </p>
        <a href="#" class="btn btn-sm btn-primary"> View Profile </a>
      </div>
    </div>
    <h5 class="text-dark mb-4">Leave a comment</h5>
    <a-form layout="vertical">
      <a-form-item>
        <a-input placeholder="Username">
          <template #icon>
            <a-icon type="user" style="color: rgba(0, 0, 0, 0.25)" />
          </template>
        </a-input>
      </a-form-item>
      <a-form-item>
        <a-input placeholder="Email">
          <template #prefix>
            <a-icon type="mail" style="color: rgba(0, 0, 0, 0.25)" />
          </template>
        </a-input>
      </a-form-item>
      <a-form-item>
        <a-textarea :rows="3" placeholder="Your message"></a-textarea>
      </a-form-item>
      <a-form-item>
        <a-button class="mr-2" type="primary" style="width: 200px">
          <i class="fa fa-send mr-2"></i> Send
        </a-button>
        <a-upload>
          <a-button> Attach File </a-button>
        </a-upload>
      </a-form-item>
    </a-form>
  </div>
</template>
