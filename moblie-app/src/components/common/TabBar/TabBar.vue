<template>
  <div class="tab-bar">
    <van-tabbar route >
      <van-tabbar-item replace to="/take_bus" icon="location-o">打车</van-tabbar-item>
      <van-tabbar-item replace to="/dynamic" icon="fire-o" badge="99+">动态</van-tabbar-item>
      <van-tabbar-item replace to="/ride" icon="qr">乘车</van-tabbar-item>
      <van-tabbar-item replace to="/profile" icon="user-circle-o">我的</van-tabbar-item>
    </van-tabbar>
  </div>
</template>

<script>
export default {
  name: 'TabBar',
  data () {
    return {}
  }
}
</script>

<style></style>
