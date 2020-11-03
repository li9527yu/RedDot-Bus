<template>
<div class="SearchStation">
  <van-form @submit="OnSubmit">
        <vcalendar></vcalendar>
        <order-place></order-place>
        <order-button></order-button>
    </van-form>
  <h2>站点查找</h2>
</div>

</template>

<script>
import Vcalendar from '@/components/common/Vcalendar/Vcalendar'
import OrderPlace from '@/components/common/OrderPlace/OrderPlace'
import OrderButton from '@/components/common/OrderButton/OrderButton'
export default {
  name: 'SearchStation',
  components: {
    OrderPlace,
    OrderButton,
    Vcalendar
  },
  methods: {
    OnSubmit () {
      console.log('submit success')
    }
  }
}
</script>

<style>

</style>
