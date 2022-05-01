<template>
  <div>
    <h6 class="mb-4 text-uppercase">
      <strong>Order items</strong>
    </h6>
    <div class="mb-4">
      <a-table :columns="columns" :data-source="data" :pagination="false">
        <template #description="{ text }">
          <a href="javascript: void(0);" class="btn btn-sm btn-light">{{ text }}</a>
        </template>
        <template #quantity="{ text: value }">
          <a-input-number size="small" :min="1" :default-value="+value" />
        </template>
        <template #actions>
          <a href="javascript: void(0);" class="btn btn-sm btn-light">
            <i class="fe fe-trash mr-1" /> Remove
          </a>
        </template>
      </a-table>
    </div>
    <h6 class="mb-4 text-uppercase">
      <strong>Shipment details</strong>
    </h6>
    <a-form :form="form" layout="vertical">
      <div class="row mb-4">
        <div class="col-md-8">
          <div class="row">
            <div class="col-md-6">
              <a-form-item label="Email">
                <a-input placeholder="Email" />
              </a-form-item>
            </div>
            <div class="col-md-6">
              <a-form-item label="Phone Number">
                <a-input placeholder="Phone Number" />
              </a-form-item>
            </div>
            <div class="col-md-6">
              <a-form-item label="Name">
                <a-input placeholder="Name" />
              </a-form-item>
            </div>
            <div class="col-md-6">
              <a-form-item label="Surname">
                <a-input placeholder="Surname" />
              </a-form-item>
            </div>
            <div class="col-md-12">
              <a-form-item label="City">
                <a-input placeholder="City" />
              </a-form-item>
            </div>
            <div class="col-md-12 mb-3">
              <a-form-item label="Address">
                <a-input placeholder="Address" />
              </a-form-item>
            </div>
          </div>
          <h6 class="mb-4 text-uppercase">
            <strong>Payment details</strong>
          </h6>
          <div class="row">
            <div class="col-md-12">
              <a-form-item label="Card Number">
                <a-input placeholder="Card Number">
                  <template #addonBefore>
                    <a-icon type="credit-card" />
                  </template>
                </a-input>
              </a-form-item>
            </div>
            <div class="col-md-7">
              <a-form-item label="Expiration Date">
                <a-input placeholder="Surname" />
              </a-form-item>
            </div>
            <div class="col-md-5">
              <a-form-item label="Card CVC">
                <a-input placeholder="CVC" />
              </a-form-item>
            </div>
            <div class="col-md-12">
              <a-form-item label="Card Holder Name">
                <a-input placeholder="Name and Surname" />
              </a-form-item>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <h4 class="text-black mb-3">
            <strong>General Info</strong>
          </h4>
          <h2>
            <i class="fa fa-cc-visa text-primary mr-1" />
            <i class="fa fa-cc-mastercard text-default mr-1" />
            <i class="fa fa-cc-amex text-default" />
          </h2>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
            incididunt ut labore et dolore magna aliqua.
          </p>
          <p>
            Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
            commodo consequat.
          </p>
        </div>
      </div>
    </a-form>
    <div class="border-top text-dark font-size-18 pt-4 text-right">
      <p class="mb-1">
        Sub - Total amount:
        <strong class="font-size-24">$5,700.00</strong>
      </p>
      <p class="mb-1">
        VAT:
        <strong class="font-size-24">$57.00</strong>
      </p>
      <p class="mb-4">
        Grand Total:
        <strong class="font-size-36">$5,757.00</strong>
      </p>
      <a href="javascript: void(0);" class="btn btn-lg btn-success width-200 mb-2">Order Now</a>
    </div>
  </div>
</template>

<script>
import data from './data'
const columns = [
  {
    title: '#',
    dataIndex: 'number',
  },
  {
    title: 'Description',
    dataIndex: 'description',
    scopedSlots: { customRender: 'description' },
  },
  {
    title: 'Quantity',
    dataIndex: 'quantity',
    scopedSlots: { customRender: 'quantity' },
    class: 'text-right',
  },
  {
    title: 'Unit Cost',
    dataIndex: 'unitcost',
    class: 'text-right',
  },
  {
    title: 'Total',
    dataIndex: 'total',
    class: 'text-right',
  },
  {
    title: '',
    dataIndex: '',
    class: 'text-right',
    scopedSlots: { customRender: 'actions' },
  },
]

export default {
  setup() {
    return {
      data,
      columns,
    }
  },
}
</script>
