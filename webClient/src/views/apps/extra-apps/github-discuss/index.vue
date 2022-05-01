<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-app-partials-github-head /></div>
          <div class="card-body"><vb-app-partials-github-head-issue /></div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-8 col-md-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-app-partials-github-discuss /></div>
          <div class="card-body"><vb-app-partials-github-write /></div>
        </div>
      </div>
      <div class="col-lg-4 col-md-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-widgets-lists-25 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbAppPartialsGithubHead from '@/@vb/widgets/AppPartials/GithubHead'
import VbAppPartialsGithubHeadIssue from '@/@vb/widgets/AppPartials/GithubHeadIssue'
import VbAppPartialsGithubDiscuss from '@/@vb/widgets/AppPartials/GithubDiscuss'
import VbAppPartialsGithubWrite from '@/@vb/widgets/AppPartials/GithubWrite'
import VbWidgetsLists25 from '@/@vb/widgets/WidgetsLists/25'

export default {
  name: 'VbGithubDiscuss',
  components: {
    VbAppPartialsGithubHead,
    VbAppPartialsGithubHeadIssue,
    VbAppPartialsGithubDiscuss,
    VbAppPartialsGithubWrite,
    VbWidgetsLists25,
  },
}
</script>
