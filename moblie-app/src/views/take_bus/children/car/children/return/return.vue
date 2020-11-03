<template>
  <div class="Return">
    <van-form @submit="OnSubmit">
        <order-time title="去程时间"></order-time>
        <order-time title="返程时间"></order-time>
        <order-place></order-place>
        <order-button></order-button>
    </van-form>
      <h2>往返</h2>
  </div>
</template>

<script>
import OrderTime from '@/components/common/OrderTime/OrderTime'
import OrderPlace from '@/components/common/OrderPlace/OrderPlace'
import OrderButton from '@/components/common/OrderButton/OrderButton'
export default {
  name: 'Return',
  components: {
    OrderTime,
    OrderPlace,
    OrderButton
  },
  methods: {
    OnSubmit () {
      console.log('submit success')
    }
  }
}
</script>

<style>

</style>
