<template>
  <div class="SubTabBar">
      <tab-bar :IsFixed="false">
        <van-tabbar-item replace to="/take_bus/car" >滴滴打车</van-tabbar-item>
        <van-tabbar-item replace to="/take_bus/fixed_route" >固定路线</van-tabbar-item>
        <van-tabbar-item replace to="/take_bus/transfer" >接送机/火车</van-tabbar-item>
      </tab-bar>
  </div>
</template>

<script>
import TabBar from '@/components/common/TabBar/TabBar.vue'
export default {
  name: 'SubTabBar',
  components: {
    TabBar
  }
}
</script>

<style>
.van-tabbar-item__text{
  font-size: 16px;
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}
</style>
