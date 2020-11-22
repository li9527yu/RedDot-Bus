<template>
  <div>
      <h1>添加车辆</h1>
      <el-card>
          车牌号:
          <el-input v-model="number"></el-input>
          类型：
          <el-input v-model="type"></el-input>
          司机号:
          <el-input v-model="type"></el-input>

          <el-button>添加</el-button>

      </el-card>
  </div>
</template>

<script>
export default {
    data() {
        return {
            number: "",
            type: ""
        }
    }
}
</script>

<style>

</style>