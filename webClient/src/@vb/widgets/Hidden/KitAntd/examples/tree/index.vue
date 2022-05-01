<template>
  <div>
    <div class="row">
      <div class="col-lg-4">
        <h5 class="mb-3">
          <strong>Checkable</strong>
        </h5>
        <a-tree
          checkable
          :expanded-keys="expandedKeys"
          :auto-expand-parent="autoExpandParent"
          v-model="checkedKeys"
          @expand="onExpand"
          @select="onSelect"
          :selected-keys="selectedKeys"
          :tree-data="treeData"
        />
      </div>
      <div class="col-lg-4">
        <h5 class="mb-3">
          <strong>Basic</strong>
        </h5>
        <a-tree
          :tree-data="treeData"
          :default-expanded-keys="['0-0-0', '0-0-1']"
          :default-selected-keys="['0-0-0', '0-0-1']"
          :default-checked-keys="['0-0-0', '0-0-1']"
          @select="onSelect"
          @check="onCheck"
        >
          <template #title0010>
            <span style="color: #1890ff">sss</span>
          </template>
        </a-tree>
      </div>
      <div class="col-lg-4">
        <h5 class="mb-3">
          <strong>With Lines</strong>
        </h5>
        <a-tree show-line :default-expanded-keys="['0-0-0']" @select="onSelect">
          <a-tree-node key="0-0">
            <template #title>
              <span style="color: #1890ff">parent 1</span>
            </template>
            <a-tree-node title="parent 1-0" key="0-0-0">
              <a-tree-node title="leaf" key="0-0-0-0" />
              <a-tree-node title="leaf" key="0-0-0-1" />
              <a-tree-node title="leaf" key="0-0-0-2" />
            </a-tree-node>
            <a-tree-node title="parent 1-1" key="0-0-1">
              <a-tree-node title="leaf" key="0-0-1-0" />
            </a-tree-node>
            <a-tree-node title="parent 1-2" key="0-0-2">
              <a-tree-node title="leaf" key="0-0-2-0" />
              <a-tree-node title="leaf" key="0-0-2-1" />
            </a-tree-node>
          </a-tree-node>
        </a-tree>
      </div>
    </div>
  </div>
</template>
<script>
const treeData = [
  {
    title: '0-0',
    key: '0-0',
    children: [
      {
        title: '0-0-0',
        key: '0-0-0',
        children: [
          { title: '0-0-0-0', key: '0-0-0-0' },
          { title: '0-0-0-1', key: '0-0-0-1' },
          { title: '0-0-0-2', key: '0-0-0-2' },
        ],
      },
      {
        title: '0-0-1',
        key: '0-0-1',
        children: [
          { title: '0-0-1-0', key: '0-0-1-0' },
          { title: '0-0-1-1', key: '0-0-1-1' },
          { title: '0-0-1-2', key: '0-0-1-2' },
        ],
      },
      {
        title: '0-0-2',
        key: '0-0-2',
      },
    ],
  },
  {
    title: '0-1',
    key: '0-1',
    children: [
      { title: '0-1-0-0', key: '0-1-0-0' },
      { title: '0-1-0-1', key: '0-1-0-1' },
      { title: '0-1-0-2', key: '0-1-0-2' },
    ],
  },
  {
    title: '0-2',
    key: '0-2',
  },
]

export default {
  name: 'KitAntdTreeExample',
  data() {
    return {
      expandedKeys: ['0-0-0', '0-0-1'],
      autoExpandParent: true,
      checkedKeys: ['0-0-0'],
      selectedKeys: [],
      treeData,
    }
  },
  watch: {
    checkedKeys(val) {
      console.log('onCheck', val)
    },
  },
  methods: {
    onExpand(expandedKeys) {
      console.log('onExpand', expandedKeys)
      // if not set autoExpandParent to false, if children expanded, parent can not collapse.
      // or, you can remove all expanded children keys.
      this.expandedKeys = expandedKeys
      this.autoExpandParent = false
    },
    onCheck(checkedKeys) {
      console.log('onCheck', checkedKeys)
      this.checkedKeys = checkedKeys
    },
    onSelect(selectedKeys, info) {
      console.log('onSelect', info)
      this.selectedKeys = selectedKeys
    },
  },
}
</script>
