<template>
  <div>
    <h1>历史订单</h1>
    <el-col :span="1"><h1></h1></el-col>
    <el-col :span="23">
      <el-table :data="tableData" style="width: 100%" stripe>
        <el-table-column prop="id" label="编号" width="50">
        </el-table-column>
        <el-table-column prop="created_time" label="创建时间" width="150">
        </el-table-column>
        <el-table-column prop="start_time" label="出行时间" width="160">
        </el-table-column>
        <el-table-column prop="end_time" label="结束时间" width="160">
        </el-table-column>
        <el-table-column prop="start_location" label="起点" width="180">
        </el-table-column>
        <el-table-column prop="end_location" label="终点" width="180">
        </el-table-column>
        <el-table-column prop="money" label="金额" width="90">
        </el-table-column>
        <el-table-column label="分配">
          <el-button>查看详情</el-button>
        </el-table-column>
      </el-table>
    </el-col>
  </div>
</template>

<script>
export default {
  data() {
    return {
      tableData: [
        {
          id: "1",
          created_time: "2020-03-05 18:00:00",
          start_time: "2020-03-05 18:00:00",
          end_time: "2020-03-05 18:00:00",
          start_location: "上海市普陀区金沙江路 1518 弄",
          end_location: "上海市普陀区金沙江路 1518 弄",
          money: "￥30",
          assigned: "未分配"
        },
        {
          id: "1",
          created_time: "2020-03-05 18:00:00",
          start_time: "2020-03-05 18:00:00",
          end_time: "2020-03-05 18:00:00",
          start_location: "上海市普陀区金沙江路 1518 弄",
          end_location: "上海市普陀区金沙江路 1518 弄",
          money: "￥30",
          assigned: "未分配"
        },
        {
          id: "1",
          created_time: "2020-03-05 18:00:00",
          start_time: "2020-03-05 18:00:00",
          end_time: "2020-03-05 18:00:00",
          start_location: "上海市普陀区金沙江路 1518 弄",
          end_location: "上海市普陀区金沙江路 1518 弄",
          money: "￥30",
          assigned: "未分配"
        },
        {
          id: "1",
          created_time: "2020-03-05 18:00:00",
          start_time: "2020-03-05 18:00:00",
          end_time: "2020-03-05 18:00:00",
          start_location: "上海市普陀区金沙江路 1518 弄",
          end_location: "上海市普陀区金沙江路 1518 弄",
          money: "￥30",
          assigned: "未分配"
        },
        {
          id: "1",
          created_time: "2020-03-05 18:00:00",
          start_time: "2020-03-05 18:00:00",
          end_time: "2020-03-05 18:00:00",
          start_location: "上海市普陀区金沙江路 1518 弄",
          end_location: "上海市普陀区金沙江路 1518 弄",
          money: "￥30",
          assigned: "未分配"
        },
        {
          id: "1",
          created_time: "2020-03-05 18:00:00",
          start_time: "2020-03-05 18:00:00",
          end_time: "2020-03-05 18:00:00",
          start_location: "上海市普陀区金沙江路 1518 弄",
          end_location: "上海市普陀区金沙江路 1518 弄",
          money: "￥30",
          assigned: "未分配"
        },
        {
          id: "1",
          created_time: "2020-03-05 18:00:00",
          start_time: "2020-03-05 18:00:00",
          end_time: "2020-03-05 18:00:00",
          start_location: "上海市普陀区金沙江路 1518 弄",
          end_location: "上海市普陀区金沙江路 1518 弄",
          money: "￥30",
          assigned: "未分配"
        },
        {
          id: "1",
          created_time: "2020-03-05 18:00:00",
          start_time: "2020-03-05 18:00:00",
          end_time: "2020-03-05 18:00:00",
          start_location: "上海市普陀区金沙江路 1518 弄",
          end_location: "上海市普陀区金沙江路 1518 弄",
          money: "￥30",
          assigned: "未分配"
        },
        {
          id: "1",
          created_time: "2020-03-05 18:00:00",
          start_time: "2020-03-05 18:00:00",
          end_time: "2020-03-05 18:00:00",
          start_location: "上海市普陀区金沙江路 1518 弄",
          end_location: "上海市普陀区金沙江路 1518 弄",
          money: "￥30",
          assigned: "未分配"
        },
        {
          id: "1",
          created_time: "2020-03-05 18:00:00",
          start_time: "2020-03-05 18:00:00",
          end_time: "2020-03-05 18:00:00",
          start_location: "上海市普陀区金沙江路 1518 弄",
          end_location: "上海市普陀区金沙江路 1518 弄",
          money: "￥30",
          assigned: "未分配"
        },
        {
          id: "1",
          created_time: "2020-03-05 18:00:00",
          start_time: "2020-03-05 18:00:00",
          end_time: "2020-03-05 18:00:00",
          start_location: "上海市普陀区金沙江路 1518 弄",
          end_location: "上海市普陀区金沙江路 1518 弄",
          money: "￥30",
          assigned: "未分配"
        },
        {
          id: "1",
          created_time: "2020-03-05 18:00:00",
          start_time: "2020-03-05 18:00:00",
          end_time: "2020-03-05 18:00:00",
          start_location: "上海市普陀区金沙江路 1518 弄",
          end_location: "上海市普陀区金沙江路 1518 弄",
          money: "￥30",
          assigned: "未分配"
        },
        {
          id: "1",
          created_time: "2020-03-05 18:00:00",
          start_time: "2020-03-05 18:00:00",
          end_time: "2020-03-05 18:00:00",
          start_location: "上海市普陀区金沙江路 1518 弄",
          end_location: "上海市普陀区金沙江路 1518 弄",
          money: "￥30",
          assigned: "未分配"
        },
        {
          id: "1",
          created_time: "2020-03-05 18:00:00",
          start_time: "2020-03-05 18:00:00",
          end_time: "2020-03-05 18:00:00",
          start_location: "上海市普陀区金沙江路 1518 弄",
          end_location: "上海市普陀区金沙江路 1518 弄",
          money: "￥30",
          assigned: "未分配"
        },
       
      ],
    };
  },
};
</script>

<style>
</style>