import Vue from 'vue'
import VueRouter from 'vue-router'

const TakeBus = () => import('@/views/take_bus/take_bus')
const Ride = () => import('@/views/ride/ride')
const Dynamic = () => import('@/views/dynamic/dynamic')
const Profile = () => import('@/views/profile/profile')

Vue.use(VueRouter)

const routes = [
  {
    path: '',
    redirect: '/profile'
  },
  {
    path: '/take_bus',
    component: TakeBus
  },
  {
    path: '/dynamic',
    component: Dynamic
  },
  {
    path: '/ride',
    component: Ride
  },
  {
    path: '/profile',
    component: Profile
  }
]

const router = new VueRouter({
  routes,
  mode: 'history'
})

export default router
