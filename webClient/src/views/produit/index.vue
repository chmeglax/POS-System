<template>
  <div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card-placeholder">
          <div class="card-header">
            <vb-headers-heading :data="{ title: 'Gérer les produits' }" />
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <div class="card">
          <div class="card-header">
            <vb-headers-card-header :data="{ title: 'Liste des produits' }" />
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
                <template #expandedRowRender="{ record }">
                  <QRCodeVue3
                    :width="200"
                    :height="200"
                    :value="record.id"
                    :qrOptions="{ typeNumber: 0, mode: 'Byte', errorCorrectionLevel: 'H' }"
                    :imageOptions="{ hideBackgroundDots: true, imageSize: 0.4, margin: 0 }"
                    :dotsOptions="{
                      type: 'classy',
                    }"
                    :backgroundOptions="{ color: '#ffffff' }"
                    :cornersSquareOptions="{ type: 'classy', color: '#000000' }"
                    :cornersDotOptions="{ type: undefined, color: '#000000' }"
                    fileExt="png"
                    :download="true"
                  />
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
      title="Ajouter un produit"
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
            <a-form-item label="nom du produit" name="name">
              <a-input v-model:value="form.name" placeholder="Saisir le nom" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="prix unitaire" name="price">
              <a-input v-model:value="form.price" placeholder="Saisir une valeur" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="Quantité" name="quantity">
              <a-input v-model:value="form.quantity" placeholder="Saisir une valeur" />
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
      title="Modifier un produit"
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
            <a-form-item label="nom" name="name">
              <a-input v-model:value="activeProduct.name" placeholder="Saisir le nom" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="Prix unitaire" name="price">
              <a-input-number v-model:value="activeProduct.price" placeholder="Saisir une valeur" />
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="16">
          <a-col :span="24">
            <a-form-item label="Quantité actuel" name="quantity">
              <a-input-number
                v-model:value="activeProduct.quantity"
                placeholder="Saisir une valeur"
              />
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
import QRCodeVue3 from 'qrcode-vue3'
export default defineComponent({
  components: {
    VbHeadersHeading,
    VbHeadersCardHeader,
    UserAddOutlined,
    SearchOutlined,
    QRCodeVue3,
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
        title: 'prix',
        dataIndex: 'price',
        key: 'price',
        slots: {
          filterDropdown: 'filterDropdown',
          filterIcon: 'filterIcon',
          customRender: 'customRender',
        },
        onFilter: (value, record) =>
          record.price.toString().toLowerCase().includes(value.toLowerCase()),
        onFilterDropdownVisibleChange: (visible) => {
          if (visible) {
            setTimeout(() => {
              searchInput.value.focus()
            }, 0)
          }
        },
      },
      {
        title: 'Quantité actuel',
        dataIndex: 'quantity',
        key: 'quantity',
        slots: {
          filterDropdown: 'filterDropdown',
          filterIcon: 'filterIcon',
          customRender: 'customRender',
        },
        onFilter: (value, record) =>
          record.quantity.toString().toLowerCase().includes(value.toLowerCase()),
        onFilterDropdownVisibleChange: (visible) => {
          if (visible) {
            setTimeout(() => {
              searchInput.value.focus()
            })
          }
        },
      },
      {
        title: "Date d'ajout",
        dataIndex: 'createdDate',
        key: 'createdDate',
        slots: {
          filterDropdown: 'filterDropdown',
          filterIcon: 'filterIcon',
          customRender: 'date',
        },
        onFilter: (value, record) =>
          record.createdDate.toString().toLowerCase().includes(value.toLowerCase()),
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

    //get produits
    ApiClient.get('/product/')
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
      ApiClient.delete('/product/' + record.id)
        .then((res) => {
          dataSource.value = dataSource.value.filter((e) => {
            return e.id !== record.id
          })
          message.success('Produit supprimé avec succées ! ')
        })
        .catch((e) => {
          message.success('veuillez réesseilez ! ')
        })
    }
    const addT = () => {
      ApiClient.post('/product/', form)
        .then((res) => {
          dataSource.value.push(res.data)
          message.success('Produit ajouté avec succées ! ')
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
      price: '',
      quantity: '',
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
      name: '',
      price: 0,
      quantity: 0,
    })
    const visibleEdit = ref(false)
    const editT = (record) => {
      activeProduct.value = JSON.parse(JSON.stringify(record))
      activeProduct.name = record.name
      activeProduct.price = parseFloat(record.price)
      activeProduct.quantity = parseInt(record.quantity)
      visibleEdit.value = true
    }
    const saveT = () => {
      console.log(activeProduct)
      ApiClient.put('/product/' + activeProduct.value.id, activeProduct)
        .then((res) => {
          dataSource.value = dataSource.value.map((elem) =>
            elem.id == activeProduct.value.id
              ? {
                  ...elem,
                  price: activeProduct.price,
                  quantity: activeProduct.quantity,
                  name: activeProduct.name,
                }
              : elem,
          )
          //activeProduct.value = res.data
          message.success('Produit modifié ! ')
        })
        .catch((e) => {
          console.log(e)
          message.error('Veuillez refraichir la page ! ')
        })
        .finally(() => {
          visibleEdit.value = false
        })
    }
    const qrCode = (record) => {
      console.log(record)
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
      qrCode,
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
