<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading-3
              :data="{
                title: 'Antd Tables',
                button: 'Go to Docs',
                url: 'https://ant.design/components/table/',
              }"
            />
          </div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Basic Usage' }" /></div>
          <div class="card-body"><vb-tables-antd-3 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Row Selection' }" />
          </div>
          <div class="card-body"><vb-tables-antd-4 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Custom Filters' }" />
          </div>
          <div class="card-body"><vb-tables-antd-6 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Expandable Row' }" />
          </div>
          <div class="card-body"><vb-tables-antd-7 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Fixed Header and Columns' }" />
          </div>
          <div class="card-body"><vb-tables-antd-8 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Filter and Sorter' }" />
          </div>
          <div class="card-body"><vb-tables-antd-5 /></div>
        </div>
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Resizable column' }" />
          </div>
          <div class="card-body"><vb-tables-antd-9 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading3 from '@/@vb/widgets/Headers/Heading3'
import VbHeadersCardHeader from '@/@vb/widgets/Headers/CardHeader'
import VbTablesAntd3 from '@/@vb/widgets/TablesAntd/3'
import VbTablesAntd4 from '@/@vb/widgets/TablesAntd/4'
import VbTablesAntd6 from '@/@vb/widgets/TablesAntd/6'
import VbTablesAntd7 from '@/@vb/widgets/TablesAntd/7'
import VbTablesAntd8 from '@/@vb/widgets/TablesAntd/8'
import VbTablesAntd5 from '@/@vb/widgets/TablesAntd/5'
import VbTablesAntd9 from '@/@vb/widgets/TablesAntd/9'

export default {
  name: 'VbAntDesign',
  components: {
    VbHeadersHeading3,
    VbHeadersCardHeader,
    VbTablesAntd3,
    VbTablesAntd4,
    VbTablesAntd6,
    VbTablesAntd7,
    VbTablesAntd8,
    VbTablesAntd5,
    VbTablesAntd9,
  },
}
</script>
