<template>
  <div class="SecondTabBar">
      <tab-bar :IsFixed="false">
        <slot></slot>
      </tab-bar>
  </div>
</template>

<script>
import TabBar from '@/components/common/TabBar/TabBar.vue'
export default {
  name: 'SecondTabBar',
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
