<template>
  <div class="OrderTime">
    <van-cell is-link @click="showPopup" :value="timeValue" :title="title"></van-cell>
    <van-popup v-model="show" round position="bottom" :style="{ height: '30%' }">
        <van-datetime-picker
        v-model="currentDate"
        type="datehour"
        title=""
        :min-date="minDate"
        :max-date="maxDate"
        @change="changeFn()"
        @confirm="confirmFn()"
        @cancel="cancelFn()"
        />
    </van-popup>
  </div>
</template>

<script>
export default {
  name: 'OrderTime',
  data () {
    return {
      show: false,
      minDate: new Date(2020, 0, 1),
      maxDate: new Date(2020, 12, 31),
      currentDate: new Date(),
      changeDate: new Date(),
      timeValue: ''
    }
  },
  props: {
    title: {
      type: String,
      default: '空白'
    }
  },
  methods: {
    showPopup () {
      this.show = true
    },
    changeFn () {
      this.changeDate = this.currentDate
    },
    confirmFn () {
      this.timeValue = this.timeFormate(this.currentDate)
      this.show = false
    },
    cancelFn () {
      this.show = false
    },
    timeFormate (time) {
      const month = time.getMonth() + 1
      const day = time.getDate()
      const hour = time.getHours()
      const min = time.getMinutes()
      return month + '月' + day + '日' + hour + '点' + min + '分'
    }
  },
  mounted () {
    this.timeFormate(new Date())
  }
}
</script>

<style>

</style>
