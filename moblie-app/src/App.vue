<template>
  <div id="app">
    <router-view></router-view>
    <tab-bar></tab-bar>
  </div>
</template>
<script>
import TabBar from '@/components/common/TabBar/TabBar'
export default {
  name: 'App',
  components: {
    TabBar
  }
}
</script>
<style>

</style>
