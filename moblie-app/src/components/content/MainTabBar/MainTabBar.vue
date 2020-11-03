<template>
  <div class="MainTabBar">
    <tab-bar>
      <van-tabbar-item replace to="/take_bus" icon="location-o">打车</van-tabbar-item>
      <van-tabbar-item replace to="/dynamic" icon="fire-o" badge="99+">动态</van-tabbar-item>
      <van-tabbar-item replace to="/ride" icon="qr">乘车</van-tabbar-item>
      <van-tabbar-item replace to="/profile" icon="user-circle-o">我的</van-tabbar-item>
    </tab-bar>
  </div>
</template>

<script>
import TabBar from '@/components/common/TabBar/TabBar.vue'
export default {
  name: 'MainTabBar',
  components: {
    TabBar
  }
}
</script>
<style>

</style>
