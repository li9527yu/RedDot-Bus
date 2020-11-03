<template>
  <div class="OrderPlace">
  <van-cell-group>
      <van-field v-model="value" @click-input="InputStart()" :left-icon="LeftIcon" :placeholder="RemarkStart" />
      <van-field v-model="value" @click-input="InputEnd()" :left-icon="LeftIcon" :placeholder="RemarkEnd" />
  </van-cell-group>
  </div>
</template>

<script>
export default {
  name: 'OrderPlace',
  data () {
    return {
      value: ''
    }
  },
  props: {
    LeftIcon: {
      type: String,
      default: 'location'
    },
    RemarkStart: {
      type: String,
      default: '从哪出发'
    },
    RemarkEnd: {
      type: String,
      default: '到哪儿去'
    }
  },
  methods: {
    InputStart () {
      console.log('click right')
    },
    InputEnd () {
      console.log('click right')
    }
  }
}
</script>

<style>

</style>
