<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading :data="{ title: 'Gérer les organismes' }" />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Liste des organismes' }" />
          </div>
          <div class="card-body">
            <a-button type="primary" shape="round" :size="size" @click="showDrawer">
              <template #icon>
                <UserAddOutlined />
              </template>
              Ajouter
            </a-button>
            <div class="table-responsive text-nowrap pt-2">
              <a-table :data-source="dataSource" :columns="columns" :loading="tableLoading">
                <template
                  #filterDropdown="{ setSelectedKeys, selectedKeys, confirm, clearFilters, column }"
                >
                  <div style="padding: 8px">
                    <a-input
                      ref="searchInput"
                      :placeholder="`recherche ${column.dataIndex}`"
                      :value="selectedKeys[0]"
                      style="width: 188px; margin-bottom: 8px; display: block"
                      @change="(e) => setSelectedKeys(e.target.value ? [e.target.value] : [])"
                      @pressEnter="handleSearch(selectedKeys, confirm, column.dataIndex)"
                    />
                    <a-button
                      type="primary"
                      size="small"
                      style="width: 90px; margin-right: 8px"
                      @click="handleSearch(selectedKeys, confirm, column.dataIndex)"
                    >
                      <template #icon><SearchOutlined /></template>
                      Search
                    </a-button>
                    <a-button size="small" style="width: 90px" @click="handleReset(clearFilters)">
                      Reset
                    </a-button>
                  </div>
                </template>
                <template #filterIcon="filtered">
                  <search-outlined :style="{ color: filtered ? '#108ee9' : undefined }" />
                </template>
                <template #customRender="{ text, column }">
                  <span v-if="searchText && searchedColumn === column.dataIndex">
                    <template
                      v-for="(fragment, i) in text
                        .toString()
                        .split(new RegExp(`(?<=${searchText})|(?=${searchText})`, 'i'))"
                    >
                      <mark
                        v-if="fragment.toLowerCase() === searchText.toLowerCase()"
                        :key="i"
                        class="highlight"
                      >
                        {{ fragment }}
                      </mark>
                      <template v-else>{{ fragment }}</template>
                    </template>
                  </span>
                  <template v-else>
                    {{ text }}
                  </template>
                </template>
                <template #action="{ record }">
                  <span>
                    <a class="btn btn-sm btn-light mr-2" @click="editT(record)">
                      <i class="fe fe-edit mr-2" />
                      Modifier
                    </a>
                    <a class="btn btn-sm btn-light mr-2" @click="deleteT(record)">
                      <i class="fe fe-edit mr-2" />
                      Supprimer
                    </a>
                  </span>
                </template>
              </a-table>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- add drawer -->
    <a-drawer
      title="Ajouter un organisme"
      :width="720"
      :visible="visible"
      :body-style="{ paddingBottom: '80px' }"
      :footer-style="{ textAlign: 'right' }"
      @close="onClose"
      @finish="onFinish"
      @finishFailed="onFinishFailed"
    >
      <a-form :model="form" :rules="rules" layout="vertical">
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="nom" name="name">
              <a-input v-model:value="form.name" placeholder="Saisir le nom" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="adresse" name="adresse">
              <a-input v-model:value="form.adresse" placeholder="Saisir une valeur" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="phone" name="phone">
              <a-input v-model:value="form.phone" placeholder="Saisir une valeur" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="Email" name="email">
              <a-input v-model:value="form.email" placeholder="Saisir une valeur" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="secteur" name="secteur">
              <a-input v-model:value="form.secteur" placeholder="Saisir une valeur" />
            </a-form-item>
          </a-col>
        </a-row>
      </a-form>
      <template #extra>
        <a-space>
          <a-button @click="onClose">Cancel</a-button>
          <a-button type="primary" @click="addT">Submit</a-button>
        </a-space>
      </template>
    </a-drawer>
    <!-- edit drawer -->

    <a-drawer
      title="Modifier un organisme"
      :width="720"
      :visible="visibleEdit"
      :body-style="{ paddingBottom: '80px' }"
      :footer-style="{ textAlign: 'right' }"
      @close="onClose"
      @finish="onFinish"
      @finishFailed="onFinishFailed"
    >
      <a-form :model="activeOrganisme" :rules="rules" layout="vertical">
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="nom" name="name">
              <a-input v-model:value="activeOrganisme.name" placeholder="Saisir le nom" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="adresse" name="adresse">
              <a-input v-model:value="activeOrganisme.adresse" placeholder="Saisir une valeur" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="phone" name="phone">
              <a-input v-model:value="activeOrganisme.phone" placeholder="Saisir une valeur" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="Email" name="email">
              <a-input v-model:value="activeOrganisme.email" placeholder="Saisir une valeur" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="secteur" name="secteur">
              <a-input v-model:value="activeOrganisme.secteur" placeholder="Saisir une valeur" />
            </a-form-item>
          </a-col>
        </a-row>
      </a-form>
      <template #extra>
        <a-space>
          <a-button @click="onClose">Cancel</a-button>
          <a-button type="primary" @click="saveT">Submit</a-button>
        </a-space>
      </template>
    </a-drawer>
  </div>
</template>

<script>
import VbHeadersHeading from '@/@vb/widgets/Headers/Heading'
import VbHeadersCardHeader from '@/@vb/widgets/Headers/CardHeader'
import { message } from 'ant-design-vue'

import { SearchOutlined, UserAddOutlined } from '@ant-design/icons-vue'
import { defineComponent, reactive, ref } from 'vue'
import ApiClient from '@/services/axios'
export default defineComponent({
  components: {
    VbHeadersHeading,
    VbHeadersCardHeader,
    UserAddOutlined,
    SearchOutlined,
  },
  setup() {
    const searchInput = ref()
    const columns = [
      {
        title: 'Name',
        dataIndex: 'name',
        key: 'name',
        slots: {
          filterDropdown: 'filterDropdown',
          filterIcon: 'filterIcon',
          customRender: 'customRender',
        },
        onFilter: (value, record) =>
          record.name.toString().toLowerCase().includes(value.toLowerCase()),
        onFilterDropdownVisibleChange: (visible) => {
          if (visible) {
            setTimeout(() => {
              searchInput.value.focus()
            }, 0)
          }
        },
      },
      {
        title: 'adresse',
        dataIndex: 'adresse',
        key: 'adresse',
        slots: {
          filterDropdown: 'filterDropdown',
          filterIcon: 'filterIcon',
          customRender: 'customRender',
        },
        onFilter: (value, record) =>
          record.adresse.toString().toLowerCase().includes(value.toLowerCase()),
        onFilterDropdownVisibleChange: (visible) => {
          if (visible) {
            setTimeout(() => {
              searchInput.value.focus()
            }, 0)
          }
        },
      },
      {
        title: 'email',
        dataIndex: 'email',
        key: 'email',
        slots: {
          filterDropdown: 'filterDropdown',
          filterIcon: 'filterIcon',
          customRender: 'customRender',
        },
        onFilter: (value, record) =>
          record.email.toString().toLowerCase().includes(value.toLowerCase()),
        onFilterDropdownVisibleChange: (visible) => {
          if (visible) {
            setTimeout(() => {
              searchInput.value.focus()
            })
          }
        },
      },
      {
        title: 'Téléphone',
        dataIndex: 'phone',
        key: 'phone',
        slots: {
          filterDropdown: 'filterDropdown',
          filterIcon: 'filterIcon',
          customRender: 'customRender',
        },
        onFilter: (value, record) =>
          record.phone.toString().toLowerCase().includes(value.toLowerCase()),
        onFilterDropdownVisibleChange: (visible) => {
          if (visible) {
            setTimeout(() => {
              searchInput.value.focus()
            })
          }
        },
      },
      {
        title: 'secteur',
        dataIndex: 'secteur',
        key: 'secteur',
        slots: {
          filterDropdown: 'filterDropdown',
          filterIcon: 'filterIcon',
          customRender: 'customRender',
        },
        onFilter: (value, record) =>
          record.secteur.toString().toLowerCase().includes(value.toLowerCase()),
        onFilterDropdownVisibleChange: (visible) => {
          if (visible) {
            setTimeout(() => {
              searchInput.value.focus()
            })
          }
        },
      },
      {
        title: 'Action',
        slots: { customRender: 'action' },
      },
    ]
    const state = reactive({
      searchText: '',
      searchedColumn: '',
    })
    const tableLoading = ref(true)
    const dataSource = ref([])

    //get organismes
    ApiClient.post('/admin/organisme/filter', {
      query: {},
    })
      .then((res) => {
        dataSource.value = res.data
      })
      .catch((e) => {
        message.error('Veuillez refraichir la page ! ')
      })
      .finally(() => {
        tableLoading.value = false
      })

    const handleSearch = (selectedKeys, confirm, dataIndex) => {
      confirm()
      console.log(selectedKeys[0])
      state.searchText = selectedKeys[0]
      state.searchedColumn = dataIndex
    }

    const handleReset = (clearFilters) => {
      clearFilters()
      state.searchText = ''
    }

    const deleteT = (record) => {
      ApiClient.delete('/admin/organisme/' + record._id)
        .then((res) => {
          dataSource.value = dataSource.value.filter((e) => {
            return e._id !== record._id
          })
          message.success('organisme supprimé avec succées ! ')
        })
        .catch((e) => {
          message.success('veuillez réesseilez ! ')
        })
    }
    const addT = () => {
      ApiClient.put('/admin/organisme/', { data: form })
        .then((res) => {
          dataSource.value.push(res.data)
          message.success('organisme ajouter avec succées ! ')
          visible.value = false
        })
        .catch((e) => {
          console.log(e.response.data.message)
          message.error(e.response.data.message)
        })
    }
    //drawer actions
    const form = reactive({
      name: '',
      adresse: '',
      phone: '',
      email: '',
      secteur: '',
    })
    const rules = {
      name: [
        {
          required: true,
          message: 'champ obligatoire !',
        },
      ],
      email: [
        {
          required: true,
          message: 'champ obligatoire !',
        },
      ],
    }
    const visible = ref(false)

    const showDrawer = () => {
      visible.value = true
    }

    const onClose = () => {
      visible.value = false
      visibleEdit.value = false
    }
    const onFinish = (values) => {
      console.log('Success:', values)
    }

    const onFinishFailed = (errorInfo) => {
      console.log('Failed:', errorInfo)
    }
    //edit drawer
    const activeOrganisme = reactive({
      name: '',
      adresse: '',
      phone: '',
      email: '',
      secteur: '',
    })
    const visibleEdit = ref(false)
    const editT = (record) => {
      activeOrganisme.value = JSON.parse(JSON.stringify(record))
      activeOrganisme.name = record.name
      activeOrganisme.adresse = record.adresse
      activeOrganisme.phone = record.phone
      activeOrganisme.secteur = record.secteur
      activeOrganisme.email = record.email
      visibleEdit.value = true
    }
    const saveT = () => {
      ApiClient.patch('/admin/organisme/' + activeOrganisme.value._id, {
        data: activeOrganisme,
      })
        .then((res) => {
          dataSource.value = dataSource.value.map((elem) =>
            elem._id == activeOrganisme.value._id
              ? {
                  ...elem,
                  adresse: activeOrganisme.adresse,
                  name: activeOrganisme.name,
                  phone: activeOrganisme.phone,
                  secteur: activeOrganisme.secteur,
                  email: activeOrganisme.email,
                }
              : elem,
          )
          //activeOrganisme.value = res.data
          message.success('Enseignat modifié ! ')
        })
        .catch((e) => {
          console.log(e)
          message.error('Veuillez refraichir la page ! ')
        })
        .finally(() => {
          visibleEdit.value = false
        })
    }

    return {
      columns,
      handleSearch,
      handleReset,
      searchText: '',
      searchInput: null,
      searchedColumn: '',
      dataSource,
      tableLoading,
      deleteT,
      editT,
      form,
      rules,
      visible,
      showDrawer,
      onClose,
      addT,
      activeOrganisme,
      visibleEdit,
      saveT,
    }
  },
})
</script>
<style scoped>
.highlight {
  background-color: rgb(255, 192, 105);
  padding: 0px;
}
</style>
