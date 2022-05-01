<template>
  <div>
    <div class="d-flex align-items-center mb-4">
      <div class="vb__utils__avatarGroup mr-4 flex-shrink-0">
        <div class="vb__utils__avatar vb__utils__avatar--size46 vb__utils__avatar--rounded">
          <img src="resources/images/avatars/1.jpg" alt="Mary Stanform" />
        </div>
        <div class="vb__utils__avatar vb__utils__avatar--size46 vb__utils__avatar--rounded">
          <img src="resources/images/avatars/2.jpg" alt="Mary Stanform" />
        </div>
        <div class="vb__utils__avatar vb__utils__avatar--size46 vb__utils__avatar--rounded">
          <img src="resources/images/avatars/3.jpg" alt="Mary Stanform" />
        </div>
        <div class="vb__utils__avatar vb__utils__avatar--size46 vb__utils__avatar--rounded">
          <img src="resources/images/avatars/4.jpg" alt="Mary Stanform" />
        </div>
        <button class="vb__utils__avatarGroupAdd">
          <i class="fe fe-plus"></i>
        </button>
      </div>
      <a class="mr-4" href="javascript: void(0);">Only My Issues</a>
      <div>Recently Updated</div>
    </div>
    <div class="row">
      <div class="col-lg-3 col-md-6">
        <div :class="$style.column" class="card bg-light py-3 px-2">
          <h3 class="font-weight-bold text-dark font-size-18 mb-3">Backlog</h3>
          <draggable v-model="backlog" item-key="id" group="board" style="min-height: 500px">
            <template #item="{ element: item }">
              <div :class="$style.card">
                <div :class="$style.content">
                  <div :class="[$style.flag, 'bg-' + item.color]"></div>
                  <div class="d-flex flex-wrap-reverse align-items-center">
                    <h5 class="text-dark font-size-18 mt-2 mr-auto">
                      {{ item.title }}
                    </h5>
                    <i
                      :class="[
                        item.income
                          ? 'fe-arrow-left-circle text-success'
                          : 'fe-arrow-right-circle text-danger',
                      ]"
                      class="font-size-30 flex-shrink-0 fe"
                    ></i>
                  </div>
                  <div class="text-gray-5 mb-2">Deadline {{ item.deadline }}</div>
                  <div class="d-flex align-items-center flex-wrap pb-2">
                    <div
                      class="vb__utils__avatar vb__utils__avatar--rounded vb__utils__avatar--size27 flex-shrink-0 mr-2"
                    >
                      <img :src="item.participant" alt="User" />
                    </div>
                    <div class="text-gray-5">
                      <del>{{ item.note }}</del>
                    </div>
                  </div>
                </div>
              </div>
            </template>
          </draggable>
        </div>
      </div>
      <div class="col-lg-3 col-md-6">
        <div :class="$style.column" class="card bg-light py-3 px-2">
          <h3 class="font-weight-bold text-dark font-size-18 mb-3">To Do</h3>
          <draggable v-model="todo" item-key="id" group="board" style="min-height: 500px">
            <template #item="{ element: item }">
              <div :class="$style.card">
                <div :class="$style.content">
                  <div :class="[$style.flag, 'bg-' + item.color]"></div>
                  <div class="d-flex flex-wrap-reverse align-items-center">
                    <h5 class="text-dark font-size-18 mt-2 mr-auto">
                      {{ item.title }}
                    </h5>
                    <i
                      :class="[
                        item.income
                          ? 'fe-arrow-left-circle text-success'
                          : 'fe-arrow-right-circle text-danger',
                      ]"
                      class="font-size-30 flex-shrink-0 fe"
                    ></i>
                  </div>
                  <div class="text-gray-5 mb-2">Deadline {{ item.deadline }}</div>
                  <div class="d-flex align-items-center flex-wrap pb-2">
                    <div
                      class="vb__utils__avatar vb__utils__avatar--rounded vb__utils__avatar--size27 flex-shrink-0 mr-2"
                    >
                      <img :src="item.participant" alt="User" />
                    </div>
                    <div class="text-gray-5">
                      <del>{{ item.note }}</del>
                    </div>
                  </div>
                </div>
              </div>
            </template>
          </draggable>
        </div>
      </div>
      <div class="col-lg-3 col-md-6">
        <div :class="$style.column" class="card bg-light py-3 px-2">
          <h3 class="font-weight-bold text-dark font-size-18 mb-3">
            In Progress
          </h3>
          <draggable v-model="progress" item-key="id" group="board" style="min-height: 500px">
            <template #item="{ element: item }">
              <div :class="$style.card">
                <div :class="$style.content">
                  <div :class="[$style.flag, 'bg-' + item.color]"></div>
                  <div class="d-flex flex-wrap-reverse align-items-center">
                    <h5 class="text-dark font-size-18 mt-2 mr-auto">
                      {{ item.title }}
                    </h5>
                    <i
                      :class="[
                        item.income
                          ? 'fe-arrow-left-circle text-success'
                          : 'fe-arrow-right-circle text-danger',
                      ]"
                      class="font-size-30 flex-shrink-0 fe"
                    ></i>
                  </div>
                  <div class="text-gray-5 mb-2">Deadline {{ item.deadline }}</div>
                  <div class="d-flex align-items-center flex-wrap pb-2">
                    <div
                      class="vb__utils__avatar vb__utils__avatar--rounded vb__utils__avatar--size27 flex-shrink-0 mr-2"
                    >
                      <img :src="item.participant" alt="User" />
                    </div>
                    <div class="text-gray-5">
                      <del>{{ item.note }}</del>
                    </div>
                  </div>
                </div>
              </div>
            </template>
          </draggable>
        </div>
      </div>
      <div class="col-lg-3 col-md-6">
        <div :class="$style.column" class="card bg-light py-3 px-2">
          <h3 class="font-weight-bold text-dark font-size-18 mb-3">
            Completed
          </h3>
          <draggable v-model="completed" item-key="id" group="board" style="min-height: 500px">
            <template #item="{ element: item }">
              <div :class="$style.card">
                <div :class="$style.content">
                  <div :class="[$style.flag, 'bg-' + item.color]"></div>
                  <div class="d-flex flex-wrap-reverse align-items-center">
                    <h5 class="text-dark font-size-18 mt-2 mr-auto">
                      {{ item.title }}
                    </h5>
                    <i
                      :class="[
                        item.income
                          ? 'fe-arrow-left-circle text-success'
                          : 'fe-arrow-right-circle text-danger',
                      ]"
                      class="font-size-30 flex-shrink-0 fe"
                    ></i>
                  </div>
                  <div class="text-gray-5 mb-2">Deadline {{ item.deadline }}</div>
                  <div class="d-flex align-items-center flex-wrap pb-2">
                    <div
                      class="vb__utils__avatar vb__utils__avatar--rounded vb__utils__avatar--size27 flex-shrink-0 mr-2"
                    >
                      <img :src="item.participant" alt="User" />
                    </div>
                    <div class="text-gray-5">
                      <del>{{ item.note }}</del>
                    </div>
                  </div>
                </div>
              </div>
            </template>
          </draggable>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import { ref } from 'vue'
import draggable from 'vuedraggable'
import { backlogData, todoData, progressData, completedData } from './data.json'

export default {
  components: {
    draggable,
  },
  data() {
    const backlog = ref(backlogData)
    const todo = ref(todoData)
    const progress = ref(progressData)
    const completed = ref(completedData)

    return {
      backlog,
      todo,
      progress,
      completed,
    }
  },
}
</script>
<style lang="scss" module>
@import './style.module.scss';
</style>
