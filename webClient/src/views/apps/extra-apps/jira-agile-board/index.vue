<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-app-partials-jira-agile-board /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbAppPartialsJiraAgileBoard from '@/@vb/widgets/AppPartials/JiraAgileBoard'

export default {
  name: 'VbJiraAgileBoard',
  components: {
    VbAppPartialsJiraAgileBoard,
  },
}
</script>
