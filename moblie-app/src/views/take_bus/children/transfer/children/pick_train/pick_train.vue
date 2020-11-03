<template>
  <div class="PickTrain">
    <order-time title="用车时间"></order-time>
    <order-place RemarkStart="请选择火车站" RemarkEnd="请选择送达地点"></order-place>
    <order-button></order-button>
    <h2>接火车</h2>
  </div>
</template>

<script>
import OrderTime from '@/components/common/OrderTime/OrderTime'
import OrderPlace from '@/components/common/OrderPlace/OrderPlace'
import OrderButton from '@/components/common/OrderButton/OrderButton'
export default {
  name: 'PickTrain',
  components: {
    OrderPlace,
    OrderTime,
    OrderButton
  }
}
</script>

<style>

</style>
