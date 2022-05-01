<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading-3
              :data="{
                title: 'Feather Icons',
                button: 'Go to Docs',
                url: 'https://linearicons.com/free',
              }"
            />
          </div>
        </div>
        <div class="card">
          <div class="card-body"><vb-hidden-icons-feather /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading3 from '@/@vb/widgets/Headers/Heading3'
import VbHiddenIconsFeather from '@/@vb/widgets/Hidden/IconsFeather'

export default {
  name: 'VbFeatherIcons',
  components: {
    VbHeadersHeading3,
    VbHiddenIconsFeather,
  },
}
</script>
