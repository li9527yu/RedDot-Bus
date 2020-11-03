<template>
  <div class="OneWay">
    <van-form @submit="OnSubmit">
        <order-time title="选择时间"></order-time>
        <order-place></order-place>
        <order-button></order-button>
    </van-form>
      <h2>单程</h2>
  </div>
</template>

<script>
import OrderTime from '@/components/common/OrderTime/OrderTime'
import OrderPlace from '@/components/common/OrderPlace/OrderPlace'
import OrderButton from '@/components/common/OrderButton/OrderButton'
export default {
  name: 'OneWay',
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
