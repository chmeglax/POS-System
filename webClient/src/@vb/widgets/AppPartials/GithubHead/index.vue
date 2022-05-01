<template>
  <div>
    <div className="d-flex flex-wrap">
      <div className="mr-auto pr-3 my-2">
        <i className="fe fe-book font-size-21 mr-2" />
        <div className="text-nowrap d-inline-block font-size-18 text-dark">
          <a className="font-size-18 text-blue" href="javascript: void();">
            umijs
          </a>
          /
          <a className="font-size-18 text-blue" href="javascript: void();">
            umi
          </a>
        </div>
      </div>
      <div className="d-flex flex-wrap font-size-16">
        <div className="mr-3 my-2 text-nowrap">
          <i className="fe fe-user-check font-size-21 mr-1" />
          Watch
          <strong className="text-dark font-size-18 ml-1">6,870</strong>
        </div>
        <div className="mr-3 my-2 text-nowrap">
          <i className="fe fe-star font-size-21 mr-1" />
          Star
          <strong className="text-dark font-size-18 ml-1">16,356</strong>
        </div>
        <div className="mr-3 my-2 text-nowrap">
          <i className="fe fe-copy font-size-21 mr-1" />
          Fork
          <strong className="text-dark font-size-18 ml-1">569</strong>
        </div>
      </div>
    </div>
    <a-tabs :default-active-key="1" class="vb-tabs-bordered">
      <a-tab-pane key="1" tab="Code" />
      <a-tab-pane key="2">
        <template #tab>
          <span>Issues <strong>(85)</strong></span>
        </template>
      </a-tab-pane>
      <a-tab-pane key="3">
        <template #tab>
          <span>Pull requests <strong>(4)</strong></span>
        </template>
      </a-tab-pane>
      <a-tab-pane key="3" tab="Security" />
      <a-tab-pane key="3" tab="Insights" />
    </a-tabs>
  </div>
</template>
