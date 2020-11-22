import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Login from '../views/Login.vue'
import Order from '../views/Order.vue'
import HistoryOrder from '../views/HistoryOrder.vue'
import AddBus from '../views/AddBus.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    redirect: 'home'
  },
  {
    path: '/login',
    name: 'Login',
    component: Login,
    meta: {
      isLogin: false
    }
  },
  {
    path: '/home',
    name: 'Home',
    component: Home,
    meta: {
      isLogin: false
    },
    children: [
      {
        path: '',
        redirect: 'order'
      },
      {
        path: 'order',
        name: 'order',
        component: Order
      },
      {
        path: 'addbus',
        name: 'addbus',
        component: AddBus
      },
      {
        path: 'history_order',
        name: 'history_order',
        component: HistoryOrder
      }
    ]
  },
]

const router = new VueRouter({
  routes
});

router.beforeEach((to, from, next) => {
  if (to.path === "/login") {
    next();
  } else {
    let token = localStorage.getItem("USER_TOKEN");
    console.log(token);
    if (token === null || token === "") {
      alert("请先登录");
      next("/login");
    } else {
      next();
    }
  }
});


export default router
