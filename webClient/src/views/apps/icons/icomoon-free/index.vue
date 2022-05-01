<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading-3
              :data="{
                title: 'Icomoon Free',
                button: 'Go to Docs',
                url: 'https://icomoon.io/#icons-icomoon',
              }"
            />
          </div>
        </div>
        <div class="card">
          <div class="card-body"><vb-hidden-icons-icomoon-free /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading3 from '@/@vb/widgets/Headers/Heading3'
import VbHiddenIconsIcomoonFree from '@/@vb/widgets/Hidden/IconsIcomoonFree'

export default {
  name: 'VbIcomoonFree',
  components: {
    VbHeadersHeading3,
    VbHiddenIconsIcomoonFree,
  },
}
</script>
