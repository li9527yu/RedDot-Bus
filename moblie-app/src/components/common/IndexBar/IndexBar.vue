<template>
  <div class="IndexBar">
    <van-index-bar :index-list="indexList" @select="SelectIn">
        <van-index-anchor index="1">标题1</van-index-anchor>
        <van-cell title="文本" />
        <van-cell title="文本" />
        <van-cell title="文本" />

        <van-index-anchor index="2">标题2</van-index-anchor>
        <van-cell title="文本" />
        <van-cell title="文本" />
        <van-cell title="文本" />

        <van-index-anchor index="3">标题3</van-index-anchor>
        <van-cell title="文本" />
        <van-cell title="文本" />
        <van-cell title="文本" />

        <van-index-anchor index="4">标题4</van-index-anchor>
        <van-cell title="文本" />
        <van-cell title="文本" />
        <van-cell title="文本" />

        <van-index-anchor index="5">标题5</van-index-anchor>
        <van-cell title="文本" />
        <van-cell title="文本" />
        <van-cell title="文本" />
        ...
    </van-index-bar>
  </div>
</template>

<script>
export default {
  name: 'IndexBar',
  data () {
    return {
      indexList: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
  },
  methods: {
    SelectIn () {
      console.log('select it')
    }
  }
}
</script>

<style>

</style>
