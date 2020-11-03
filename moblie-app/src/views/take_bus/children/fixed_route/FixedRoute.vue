<template>
  <div class="FixedRoute">
    <second-tab-bar>
      <van-tabbar-item replace to="/take_bus/fixed_route/search_station" >站点查询</van-tabbar-item>
      <van-tabbar-item replace to="/take_bus/fixed_route/route_list" >线路列表</van-tabbar-item>
    </second-tab-bar>
    <router-view></router-view>
    <h2>固定路线</h2>
  </div>
</template>

<script>
import SecondTabBar from '@/components/content/SecondTabBar/SecondTabBar'
export default {
  name: 'FixedRoute',
  components: {
    SecondTabBar
  }
}
</script>

<style>

</style>
