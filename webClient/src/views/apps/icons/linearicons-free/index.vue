<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading-3
              :data="{
                title: 'Linearicons Free',
                button: 'Go to Docs',
                url: 'https://linearicons.com/free',
              }"
            />
          </div>
        </div>
        <div class="card">
          <div class="card-body"><vb-hidden-icons-linearicons-free /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading3 from '@/@vb/widgets/Headers/Heading3'
import VbHiddenIconsLineariconsFree from '@/@vb/widgets/Hidden/IconsLineariconsFree'

export default {
  name: 'VbLinearicons',
  components: {
    VbHeadersHeading3,
    VbHiddenIconsLineariconsFree,
  },
}
</script>
