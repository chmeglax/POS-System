<template>
  <div>
    <div class="d-flex flex-wrap align-items-center">
      <div class="vb__utils__avatar vb__utils__avatar--size64 flex-shrink-0 mr-4 mb-3">
        <img src="resources/images/avatars/2.jpg" alt="Mary Stanform" />
      </div>
      <div class="mr-auto mb-3">
        <div class="text-dark font-weight-bold font-size-24">
          <span class="mr-3">Visual Builder Group</span>
          <span class="align-middle text-primary text-uppercase font-size-12 badge badge-light">
            Default
          </span>
        </div>
        <div>
          Operational / Developer tooling / Update your project information under Settings
        </div>
      </div>
      <a class="btn btn-light btn-lg text-blue font-size-14" href="javascript: voi(0);">
        Move Resources →
      </a>
    </div>
    <a-tabs :default-active-key="1" class="vb-tabs-bordered">
      <a-tab-pane key="1" tab="Resources" />
      <a-tab-pane key="2" tab="Activity" />
      <a-tab-pane key="3" tab="Settings" />
    </a-tabs>
  </div>
</template>
