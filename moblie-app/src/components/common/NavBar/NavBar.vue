<template>
  <div class="NavBar">
    <van-nav-bar :title="theme"  >
    <template #left>
        <slot name="nav-left"></slot>
    </template>
    <template #right>
        <slot name="nav-right"></slot>
    </template>
    </van-nav-bar>
  </div>
</template>

<script>
export default {
  name: 'NavBar',
  props: {
    theme: {
      type: String,
      default: '空白'
    }
  }
}
</script>

<style>
</style>
