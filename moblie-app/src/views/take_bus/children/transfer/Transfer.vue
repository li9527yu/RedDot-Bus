<template>
  <div class="Transfer">
    <second-tab-bar>
      <van-tabbar-item replace to="/take_bus/transfer/pick_plane" >接机</van-tabbar-item>
      <van-tabbar-item replace to="/take_bus/transfer/pick_train" >接火车</van-tabbar-item>
      <van-tabbar-item replace to="/take_bus/transfer/send_plane" >送机</van-tabbar-item>
      <van-tabbar-item replace to="/take_bus/transfer/send_train" >送火车</van-tabbar-item>
    </second-tab-bar>
    <router-view></router-view>
    <h2>接送机/火车</h2>
  </div>
</template>

<script>
import SecondTabBar from '@/components/content/SecondTabBar/SecondTabBar'
export default {
  name: 'Transfer',
  components: {
    SecondTabBar
  }
}
</script>

<style>

</style>
