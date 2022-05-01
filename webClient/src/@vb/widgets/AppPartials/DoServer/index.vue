<template>
  <div>
    <div className="d-flex align-items-center flex-wrap">
      <div className="d-flex flex-nowrap align-items-center width-200 flex-shrink-1 mr-2">
        <div className="vb__utils__donut vb__utils__donut--danger mr-2 flex-shrink-0" />
        <a href="javascript: void(0);" className="font-weight-bold text-blue text-nowrap">
          mediatec-main-server
        </a>
      </div>
      <div className="flex-grow-1 mr-2">FRA1 / 1GB / 25GB Disk</div>
      <div className="flex-grow-1 mr-auto">46.101.103.230</div>
      <div className="dropdown d-inline-block">
        <a-dropdown placement="bottomRight" :trigger="['click']">
          <button type="button" class="btn btn-light dropdown-toggle dropdown-toggle-noarrow">
            <i class="fe fe-more-vertical" />
          </button>
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
  </div>
</template>
