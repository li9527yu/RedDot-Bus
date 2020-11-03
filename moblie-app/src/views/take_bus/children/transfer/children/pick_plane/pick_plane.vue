<template>
  <div>
    <order-place RemarkStart="请输入航班信息" RemarkEnd="请选择送达地点"></order-place>
    <order-button></order-button>
      <h2>接飞机</h2>
  </div>
</template>

<script>
import OrderPlace from '@/components/common/OrderPlace/OrderPlace'
import OrderButton from '@/components/common/OrderButton/OrderButton'
export default {
  name: 'PickPlane',
  components: {
    OrderPlace,
    OrderButton
  }
}
</script>

<style>

</style>
