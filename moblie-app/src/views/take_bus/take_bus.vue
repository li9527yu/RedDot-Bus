<template>
  <div id="TakeBus">
    <nav-bar  theme="打车" class="NavBar">
      <h2 slot="nav-left">123</h2>
      <van-icon slot="nav-right" name="chat-o" size="26" color="#ffffff"/>
    </nav-bar>
    <sub-tab-bar></sub-tab-bar>
    <router-view></router-view>
    <h2>打车</h2>
  </div>
</template>

<script>
import NavBar from '@/components/common/NavBar/NavBar'
import SubTabBar from '@/components/content/SubTabBar/SubTabBar'
export default {
  name: 'take_bus',
  components: {
    NavBar,
    SubTabBar
  }

}
</script>

<style>
.van-nav-bar{
  background-color: #80cfff;
}
</style>
