<template>
  <div>
    <div class="row">
      <div class="col-lg-6 col-md-12">
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Basic Header' }" />
          </div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
        <div class="card">
          <div class="card-header py-0">
            <vb-headers-card-header-4
              :data="{
                title: 'With Icon',
                icon: 'fe fe-phone-call',
                description: 'Some descriptiopn here...',
              }"
            />
          </div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
        <div class="card">
          <div class="card-header card-header-borderless py-0">
            <vb-headers-card-header-5 :data="{ title: 'Borderless' }" />
          </div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
        <div class="card bg-light">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'Tinted' }" /></div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
      </div>
      <div class="col-lg-6 col-md-12">
        <div class="card card-top card-top-primary">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Colored Top Border' }" />
          </div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
        <div class="card">
          <div class="card-header py-0">
            <vb-headers-card-header-3 :data="{ title: 'With Actions' }" />
          </div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
        <div class="card">
          <div class="card-header"><vb-headers-card-header :data="{ title: 'With Footer' }" /></div>
          <div class="card-body"><vb-typography-2 /></div>
          <div class="card-footer">
            <vb-headers-card-footer
              :data="{
                mainTitle: 'Unlock Account',
                mainIcon: 'fe fe-lock',
                mainType: 'btn-success',
                additionalTitle: 'Cancel',
              }"
            />
          </div>
        </div>
        <div class="card">
          <div class="card-header py-0">
            <vb-headers-card-header-4
              :data="{
                title: 'With Icon',
                icon: 'fe fe-phone-call',
                description: 'Some descriptiopn here...',
              }"
            />
          </div>
          <div class="card-body"><vb-typography-2 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersCardHeader from '@/@vb/widgets/Headers/CardHeader'
import VbTypography2 from '@/@vb/widgets/Typography/2'
import VbHeadersCardHeader4 from '@/@vb/widgets/Headers/CardHeader4'
import VbHeadersCardHeader5 from '@/@vb/widgets/Headers/CardHeader5'
import VbHeadersCardHeader3 from '@/@vb/widgets/Headers/CardHeader3'
import VbHeadersCardFooter from '@/@vb/widgets/Headers/CardFooter'

export default {
  name: 'VbBasicCards',
  components: {
    VbHeadersCardHeader,
    VbTypography2,
    VbHeadersCardHeader4,
    VbHeadersCardHeader5,
    VbHeadersCardHeader3,
    VbHeadersCardFooter,
  },
}
</script>
