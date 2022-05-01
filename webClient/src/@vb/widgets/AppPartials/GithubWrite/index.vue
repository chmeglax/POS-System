<template>
  <div>
    <div className="d-flex align-items-start">
      <a
        href="javascript: void(0);"
        className="vb__utils__avatar vb__utils__avatar--size50 mr-3 flex-shrink-0"
      >
        <img src="resources/images/avatars/4.jpg" alt="Mary Stanform" />
      </a>
      <div className="card card-skip flex-grow-1">
        <a-tabs :default-active-key="1" class="vb-tabs-bordered pt-2 px-3">
          <a-tab-pane key="1" tab="Write" />
          <a-tab-pane key="2" tab="Preview" />
        </a-tabs>
        <div :class="$style.editor">
          <quill-editor style="height: 100px"></quill-editor>
        </div>
        <div className="card-body border-top py-2 px-3">
          <a
            href="javascript: void(0);"
            className="btn btn-success btn-with-addon text-nowrap ml-3 my-3"
          >
            <span className="btn-addon">
              <i className="btn-addon-icon fe fe-plus-circle" />
            </span>
            Add Comment
          </a>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import { quillEditor } from 'vue3-quill'
export default {
  components: {
    quillEditor,
  },
}
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
