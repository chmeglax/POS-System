<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading :data="{ title: 'Gérer les users' }" />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Liste des users' }" />
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
                <template #date="{ text }">
                  {{ moment(text).format('YYYY-MM-DD HH:mm:ss') }}
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
      title="Ajouter un caissier"
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
            <a-form-item label="Nom" name="lName">
              <a-input v-model:value="form.lName" placeholder="Saisir le nom" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="Prénom" name="fName">
              <a-input v-model:value="form.fName" placeholder="Saisir une valeur" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="email" name="email">
              <a-input v-model:value="form.email" placeholder="Saisir une valeur" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="username" name="username">
              <a-input v-model:value="form.username" placeholder="Saisir une valeur" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="Mot de passe" name="password">
              <a-input-password v-model:value="form.password" placeholder="Saisir une valeur" />
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
      title="Modifier un user"
      :width="720"
      :visible="visibleEdit"
      :body-style="{ paddingBottom: '80px' }"
      :footer-style="{ textAlign: 'right' }"
      @close="onClose"
      @finish="onFinish"
      @finishFailed="onFinishFailed"
    >
      <a-form :model="activeProduct" :rules="rules" layout="vertical">
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="Nom" name="lName">
              <a-input v-model:value="activeProduct.lName" placeholder="Saisir le nom" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="Prénom" name="fName">
              <a-input v-model:value="activeProduct.fName" placeholder="Saisir une valeur" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="email" name="email">
              <a-input v-model:value="activeProduct.email" placeholder="Saisir une valeur" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="username" name="username">
              <a-input v-model:value="activeProduct.username" placeholder="Saisir une valeur" />
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
import moment from 'moment'
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
        title: 'Nom',
        dataIndex: 'lName',
        key: 'lName',
        slots: {
          filterDropdown: 'filterDropdown',
          filterIcon: 'filterIcon',
          customRender: 'customRender',
        },
        onFilter: (value, record) =>
          record.lName.toString().toLowerCase().includes(value.toLowerCase()),
        onFilterDropdownVisibleChange: (visible) => {
          if (visible) {
            setTimeout(() => {
              searchInput.value.focus()
            }, 0)
          }
        },
      },
      {
        title: 'Prénom',
        dataIndex: 'fName',
        key: 'fName',
        slots: {
          filterDropdown: 'filterDropdown',
          filterIcon: 'filterIcon',
          customRender: 'customRender',
        },
        onFilter: (value, record) =>
          record.fName.toString().toLowerCase().includes(value.toLowerCase()),
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
        title: 'UserName',
        dataIndex: 'username',
        key: 'username',
        slots: {
          filterDropdown: 'filterDropdown',
          filterIcon: 'filterIcon',
          customRender: 'customRender',
        },
        onFilter: (value, record) =>
          record.username.toString().toLowerCase().includes(value.toLowerCase()),
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

    //get users
    ApiClient.get('/auth/')
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
      ApiClient.delete('/auth/' + record.id)
        .then((res) => {
          dataSource.value = dataSource.value.filter((e) => {
            return e.id !== record.id
          })
          message.success('user supprimé avec succées ! ')
        })
        .catch((e) => {
          message.success('veuillez réesseilez ! ')
        })
    }
    const addT = () => {
      ApiClient.post('/auth/signup', form)
        .then((res) => {
          dataSource.value.push(form)
          message.success('user ajouté avec succées ! ')
          visible.value = false
        })
        .catch((e) => {
          console.log(e.response.data.message)
          message.error(e.response.data.message)
        })
    }
    //drawer actions
    const form = reactive({
      email: '',
      fName: '',
      lName: '',
      username: '',
      password: '',
    })
    const rules = {
      name: [
        {
          required: true,
          message: 'champ obligatoire !',
        },
      ],
      quantity: [
        {
          required: true,
          message: 'champ obligatoire !',
        },
      ],
      price: [
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
    const activeProduct = reactive({
      id: '',
      email: '',
      fName: '',
      lName: '',
      username: '',
      password: '',
    })
    const visibleEdit = ref(false)
    const editT = (record) => {
      activeProduct.value = JSON.parse(JSON.stringify(record))
      activeProduct.id = record.id
      activeProduct.email = record.email
      activeProduct.fName = record.fName
      activeProduct.lName = record.lName
      activeProduct.username = record.username
      visibleEdit.value = true
    }
    const saveT = () => {
      console.log(activeProduct)
      ApiClient.put('/auth/', activeProduct)
        .then((res) => {
          dataSource.value = dataSource.value.map((elem) =>
            elem.id == activeProduct.value.id
              ? {
                  ...elem,
                  email: activeProduct.email,
                  fName: activeProduct.fName,
                  lName: activeProduct.lName,
                  username: activeProduct.username,
                }
              : elem,
          )
          //activeProduct.value = res.data
          message.success('user modifié ! ')
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
      activeProduct,
      visibleEdit,
      saveT,
      moment,
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
