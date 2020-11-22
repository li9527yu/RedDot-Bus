import axios from "axios";
// import { Message } from "element-ui";
import store from "@/store";
// import BASE_URL from "@/constant";

// 创建axios实例
const service = axios.create({
  // baseURL: BASE_URL, // api的base_url
  baseURL: "/api", // api的base_url
  timeout: 150000000000 // 请求超时时间
});

// 拦截请求;
service.interceptors.request.use(
  request => {
    // 有 token就带上
    if (store.state.isLogin) {
      request.headers["token"] = store.state.Authorization;
    }
    return request;
  },
  error => {
    return Promise.reject(error);
  }
);

// response拦截器
// service.interceptors.response.use(
//   response => {
//     /**
//      * code为非200是抛错 可结合自己业务进行修改
//      */
//     const res = response.data;
//     //console.log(res.code);
//     // console.log(response);
//     if (res.code !== 200) {
//       if (res.status) {
//         return response;
//       }
//       if (res.code === 401) {
//         alert("注册信息已过期，请重新登录！");
//         window.location = "/login";
//         return response;
//         //} else if (res.code === 500) {
//       } else if (res.status === 500) {
//         return response;
//         // Message({
//         //   message: res.msg,
//         //   type: "error",
//         //   duration: 5 * 1000
//         // });
//         // return Promise.reject(new Error(res.msg));
//       }
//     } else {
//       return response;
//     }
//   },
//   error => {
//     console.log("err" + error); // for debug
//     Message({
//       message: error.message,
//       type: "error",
//       duration: 5 * 1000
//     });
//     return Promise.reject(error);
//   }
// );

export default service;
