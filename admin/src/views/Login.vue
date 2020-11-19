<template>
   <div style="padding-top: 10%">
      <el-col :span="8"><h1></h1></el-col>
      <el-col :span="8">
         <el-card class="box-card">
            <h1>管理员登录</h1>
            <el-input v-model="username" placeholder="用户名" clearable class="p"></el-input>
            <el-input v-model="password" placeholder="用户名" clearable show-password class="p"></el-input>

            <el-button type="primary" round class="p">登录</el-button>
         </el-card>
      </el-col>

      <el-col :span=8><h1></h1></el-col>
   </div>
</template>

<script>
export default {

   data() {
      return {
         username: "",
         password: ""
      }
   }

}
</script>

<style>

.p {
   padding: 10px;
}

</style>