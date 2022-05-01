import localeAntd from 'ant-design-vue/lib/locale-provider/en_US'

const messages = {
  topBar: {
    issuesHistory: 'Issues',
    projectManagement: 'Project',
    typeToSearch: 'Search...',
    findPages: 'Find pages...',
    actions: 'Actions',
    status: 'Status',
    profileMenu: {
      hello: 'Hello',
      billingPlan: 'Billing Plan',
      role: 'Role',
      email: 'Email',
      phone: 'Phone',
      editProfile: 'Edit Profile',
      logout: 'Logout',
    },
  },
}

export default {
  locale: 'en-US',
  localeAntd,
  messages,
}
