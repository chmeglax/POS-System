<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading-3
              :data="{
                title: 'Bootstrap Tables',
                button: 'Go to Docs',
                url: 'https://getbootstrap.com/docs/5.0/content/tables/',
              }"
            />
          </div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Basic' }" /></div>
          <div class="card-body"><vb-tables-bootstrap-2 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Dark table' }" /></div>
          <div class="card-body"><vb-tables-bootstrap-3 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Striped rows' }" />
          </div>
          <div class="card-body"><vb-tables-bootstrap-4 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Bordered table' }" />
          </div>
          <div class="card-body"><vb-tables-bootstrap-5 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Borderless table' }" />
          </div>
          <div class="card-body"><vb-tables-bootstrap-6 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Hoverable rows' }" />
          </div>
          <div class="card-body"><vb-tables-bootstrap-7 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Small table' }" /></div>
          <div class="card-body"><vb-tables-bootstrap-8 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Responsive table' }" />
          </div>
          <div class="card-body"><vb-tables-bootstrap-9 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading3 from '@/@vb/widgets/Headers/Heading3'
import VbHeadersCardHeader from '@/@vb/widgets/Headers/CardHeader'
import VbTablesBootstrap2 from '@/@vb/widgets/TablesBootstrap/2'
import VbTablesBootstrap3 from '@/@vb/widgets/TablesBootstrap/3'
import VbTablesBootstrap4 from '@/@vb/widgets/TablesBootstrap/4'
import VbTablesBootstrap5 from '@/@vb/widgets/TablesBootstrap/5'
import VbTablesBootstrap6 from '@/@vb/widgets/TablesBootstrap/6'
import VbTablesBootstrap7 from '@/@vb/widgets/TablesBootstrap/7'
import VbTablesBootstrap8 from '@/@vb/widgets/TablesBootstrap/8'
import VbTablesBootstrap9 from '@/@vb/widgets/TablesBootstrap/9'

export default {
  name: 'VbBootstrap',
  components: {
    VbHeadersHeading3,
    VbHeadersCardHeader,
    VbTablesBootstrap2,
    VbTablesBootstrap3,
    VbTablesBootstrap4,
    VbTablesBootstrap5,
    VbTablesBootstrap6,
    VbTablesBootstrap7,
    VbTablesBootstrap8,
    VbTablesBootstrap9,
  },
}
</script>
