<template>
  <div class="SendPlane">
    <order-time title="用车时间"></order-time>
    <order-place  RemarkEnd="请选择火车站"></order-place>
    <order-button></order-button>
    <h2>送飞机</h2>
  </div>
</template>

<script>
import OrderTime from '@/components/common/OrderTime/OrderTime'
import OrderPlace from '@/components/common/OrderPlace/OrderPlace'
import OrderButton from '@/components/common/OrderButton/OrderButton'
export default {
  name: 'SendPlane',
  components: {
    OrderPlace,
    OrderTime,
    OrderButton
  }
}
</script>

<style>

</style>
