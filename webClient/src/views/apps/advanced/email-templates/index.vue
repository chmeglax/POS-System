<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header"><vb-headers-heading :data="{ title: 'Simple Email' }" /></div>
        </div>
        <div class="card">
          <div class="card-body"><vb-emails-1 /></div>
        </div>
        <div class="card-placeholder">
          <div class="card-header"><vb-headers-heading :data="{ title: 'Email w/ Header' }" /></div>
        </div>
        <div class="card">
          <div class="card-body"><vb-emails-2 /></div>
        </div>
        <div class="card-placeholder">
          <div class="card-header"><vb-headers-heading :data="{ title: 'Ecommerce Email' }" /></div>
        </div>
        <div class="card">
          <div class="card-body"><vb-emails-3 /></div>
        </div>
        <div class="card-placeholder">
          <div class="card-header"><vb-headers-heading :data="{ title: 'Email w/ Action' }" /></div>
        </div>
        <div class="card">
          <div class="card-body"><vb-emails-4 /></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import VbHeadersHeading from '@/@vb/widgets/Headers/Heading'
import VbEmails1 from '@/@vb/widgets/Emails/1'
import VbEmails2 from '@/@vb/widgets/Emails/2'
import VbEmails3 from '@/@vb/widgets/Emails/3'
import VbEmails4 from '@/@vb/widgets/Emails/4'

export default {
  name: 'VbEmailTemplates',
  components: {
    VbHeadersHeading,
    VbEmails1,
    VbEmails2,
    VbEmails3,
    VbEmails4,
  },
}
</script>
