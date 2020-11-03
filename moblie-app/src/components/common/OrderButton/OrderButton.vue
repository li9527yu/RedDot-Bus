<template>
  <div class="OrderButton">
      <div style="margin: 16px;">
        <van-button round block type="info" native-type="submit">
        {{Context}}
        </van-button>
    </div>
  </div>
</template>

<script>
export default {
  name: 'OrderButton',
  props: {
    Context: {
      type: String,
      default: '下单'
    }
  }
}
</script>

<style>

</style>
