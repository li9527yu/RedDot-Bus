<template>
  <div class="FileCard">
      <van-row type="flex" justify="center" align="center">
        <van-col span='12' class="profile-image">
            <van-image round width="8rem" height="8rem" :src="require('@/assets/img/profile/profile.jpg')"></van-image>
        </van-col>
        <van-col span='12' class="profile-info">
            <span>{{ProfileName}}</span>
            <span>{{ProfileNum}}</span>
        </van-col>
      </van-row>
  </div>
</template>

<script>
export default {
  name: 'FileCard',
  data () {
    return {
      ProfileName: '新垣结衣',
      ProfileNum: '18822562630'
    }
  }
}
</script>

<style>
.FileCard{
    background-color: #4466ec;
}
.profile-image{
    text-align: center;
    padding: 0.5rem 0;
}
.profile-info span{
    display: block;
    color: #ffffff;
    font-size: 1.2rem;
    padding: 10px 0;
}
</style>
