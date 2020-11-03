<template>
  <div class="tab-bar">
    <van-tabbar route :fixed="IsFixed" v-model="active">
      <slot></slot>
    </van-tabbar>
  </div>
</template>

<script>
export default {
  name: 'TabBar',
  props: {
    IsFixed: {
      type: Boolean,
      default: true
    }
  },
  data () {
    return {
      active: 0
    }
  }
}
</script>

<style></style>
