<template>
  <div class="Vcalendar">
    <div @click="show = true"><van-cell title="选择乘车日期" :value="date"  /></div>
    <van-calendar v-model="show" @confirm="onConfirm" color="#1989fa"/>
  </div>
</template>

<script>
export default {
  name: 'Vcalendar',
  data () {
    return {
      date: '',
      show: false
    }
  },
  methods: {
    formatDate (date) {
      const vmonth = date.getMonth() + 1
      const vdate = date.getDate()
      return vmonth + '月' + vdate + '日'
    },
    onConfirm (date) {
      this.show = false
      this.date = this.formatDate(date)
    }
  }
}
</script>

<style>

</style>
