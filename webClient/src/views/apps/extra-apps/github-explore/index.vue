<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-body"><vb-app-partials-github-descr /></div>
        </div>
        <div class="card-placeholder">
          <div class="card-body"><vb-tables-bootstrap-1 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbAppPartialsGithubDescr from '@/@vb/widgets/AppPartials/GithubDescr'
import VbTablesBootstrap1 from '@/@vb/widgets/TablesBootstrap/1'

export default {
  name: 'VbGithubExplore',
  components: {
    VbAppPartialsGithubDescr,
    VbTablesBootstrap1,
  },
}
</script>
