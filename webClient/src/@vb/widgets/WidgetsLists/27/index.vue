<template>
  <div>
    <Tree :value="checklist">
      <template #default="{ node, path, tree }">
        <span class="tree-node-item">
          <button type="button" @click="tree.toggleFold(node, path)">
            {{ node.$folded ? '+' : '-' }}
          </button>
          <div class="tree-node-content">
            <a-checkbox :default-checked="node.$checked">{{ node.name }}</a-checkbox>
          </div>
        </span>
      </template>
    </Tree>
  </div>
</template>
<script>
import { Tree, Draggable, Fold, Check } from 'he-tree-vue'

export default {
  name: 'VbList27',
  components: { Tree: Tree.mixPlugins([Draggable, Fold, Check]) },
  setup() {
    const checklist = [
      { name: 'IT Manager', checked: true },
      { name: 'Branch Manager', checked: true },
      { name: 'Project Manager', checked: true },
    ]

    return {
      checklist,
    }
  },
}
</script>
