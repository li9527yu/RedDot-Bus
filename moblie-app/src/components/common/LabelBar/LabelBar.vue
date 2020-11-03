<template>
  <div id="LabelBar">
    <van-tabs v-model="active" animated>
    <van-tab v-for="index in 4" :key="index" :title="'选项 ' + index">
    内容 {{ index }}
  </van-tab>
</van-tabs>
  </div>
</template>

<script>
export default {
  name: 'LabelBar'
}
</script>

<style>

</style>
