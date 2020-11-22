<template>
  <div style="padding-top: 10%">
    <el-col :span="8"><h1></h1></el-col>
    <el-col :span="8">
      <el-card class="box-card">
        <h1>管理员登录</h1>
        <el-input
          v-model="username"
          placeholder="用户名"
          clearable
          class="p"
        ></el-input>
        <el-input
          v-model="password"
          placeholder="用户名"
          clearable
          show-password
          class="p"
        ></el-input>

        <el-button type="primary" round class="p" @click="login()"
          >登录</el-button
        >
      </el-card>
    </el-col>

    <el-col :span="8"><h1></h1></el-col>
  </div>
</template>

<script>
import service from "@/utils/request";
export default {
  data() {
    return {
      username: "",
      password: "",
    };
  },
  methods: {
    login() {
      console.log(this.username);
      service
        .post("/user/login", {
          username: this.username,
          password: this.password,
        })
        .then((res) => {
          console.log(res);
          if (res.data.status_code == 200) {
            if (res.data.message.type != 2) {
              alert("你不是管理员");
            } else {
              this.$store.commit("setUserID", res.data.message.id);
              this.$store.commit("setToken", res.data.message.id);
              this.$router.push("/home");
            }
          } else {
            alert(res.data.message);
          }
        });
    },
  },
};
</script>

<style>
.p {
  padding: 10px;
}
</style>