<template>
  <div class="Car">
    <second-tab-bar>
      <van-tabbar-item replace to="/take_bus/car/one_way" >单程</van-tabbar-item>
      <van-tabbar-item replace to="/take_bus/car/return" >往返</van-tabbar-item>
    </second-tab-bar>
    <router-view></router-view>
    <h2>滴滴打车</h2>
  </div>
</template>

<script>
import SecondTabBar from '@/components/content/SecondTabBar/SecondTabBar'
export default {
  name: 'Car',
  components: {
    SecondTabBar
  }
}
</script>

<style>

</style>
