import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Login from '../views/Login.vue'
import Order from '../views/Order.vue'
import HistoryOrder from '../views/HistoryOrder.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    redirect: 'home'
  },
  {
    path: '/login',
    name: 'Login',
    component: Login
  },
  {
    path: '/home',
    name: 'Home',
    component: Home,
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
        path: 'history_order',
        name: 'history_order',
        component: HistoryOrder
      }
    ]
  },
]

const router = new VueRouter({
  routes
})

export default router
