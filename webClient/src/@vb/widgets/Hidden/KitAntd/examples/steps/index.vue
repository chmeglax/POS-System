<template>
  <div>
    <h5 class="mb-3">
      <strong>Basic</strong>
    </h5>
    <div class="mb-5">
      <a-steps :current="1">
        <a-step>
          <template #title>Finished</template>
          <template #description>
            <span>This is a description.</span>
          </template>
        </a-step>
        <a-step title="In Progress" description="This is a description." />
        <a-step title="Waiting" description="This is a description." />
      </a-steps>
    </div>
    <h5 class="mb-3">
      <strong>With Icons</strong>
    </h5>
    <div class="mb-5">
      <a-steps>
        <a-step status="finish" title="Login">
          <template #icon>
            <a-icon type="user" />
          </template>
        </a-step>
        <a-step status="finish" title="Verification">
          <template #icon>
            <a-icon type="solution" />
          </template>
        </a-step>
        <a-step status="process" title="Pay">
          <template #icon>
            <a-icon type="loading" />
          </template>
        </a-step>
        <a-step status="wait" title="Done">
          <template #icon>
            <a-icon type="smile-o" />
          </template>
        </a-step>
      </a-steps>
    </div>
    <h5 class="mb-3">
      <strong>Centered</strong>
    </h5>
    <div class="mb-5">
      <a-steps progress-dot :current="1">
        <a-step title="Finished" description="This is a description." />
        <a-step title="In Progress" description="This is a description." />
        <a-step title="Waiting" description="This is a description." />
      </a-steps>
    </div>
    <h5 class="mb-3">
      <strong>Vertical</strong>
    </h5>
    <div class="mb-5">
      <a-steps direction="vertical" :current="1">
        <a-step title="Finished" description="This is a description." />
        <a-step title="In Progress" description="This is a description." />
        <a-step title="Waiting" description="This is a description." />
      </a-steps>
    </div>
  </div>
</template>
<script>
export default {
  name: 'KitAntdStepsExample',
}
</script>
