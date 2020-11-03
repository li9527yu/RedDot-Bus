import Vue from 'vue'
import VueRouter from 'vue-router'

const TakeBus = () => import('@/views/take_bus/take_bus')
const Ride = () => import('@/views/ride/ride')
const Dynamic = () => import('@/views/dynamic/dynamic')
const Profile = () => import('@/views/profile/profile')

const Car = () => import('@/views/take_bus/children/car/Car')
const FixedRoute = () => import('@/views/take_bus/children/fixed_route/FixedRoute')
const Transfer = () => import('@/views/take_bus/children/transfer/Transfer')

const OneWay = () => import('@/views/take_bus/children/car/children/one_way/one_way')
const Return = () => import('@/views/take_bus/children/car/children/return/return')

const RouteList = () => import('@/views/take_bus/children/fixed_route/children/route_list/route_list')
const SearchStation = () => import('@/views/take_bus/children/fixed_route/children/search_station/search_station')
const PickPlane = () => import('@/views/take_bus/children/transfer/children/pick_plane/pick_plane')
const PickTrain = () => import('@/views/take_bus/children/transfer/children/pick_train/pick_train')
const SendPlane = () => import('@/views/take_bus/children/transfer/children/send_plane/send_plane')
const SendTrain = () => import('@/views/take_bus/children/transfer/children/send_train/send_train')

const MainMap = () => import('@/components/content/MainMap/MainMap')
Vue.use(VueRouter)

const routes = [
  {
    path: '',
    redirect: '/profile'
  },
  {
    path: '/take_bus',
    component: TakeBus,
    children: [
      {
        path: '',
        redirect: 'car'
      },
      {
        path: 'map',
        component: MainMap
      },
      {
        path: 'car',
        component: Car,
        children: [
          {
            path: '',
            redirect: 'one_way'
          },
          {
            path: 'one_way',
            component: OneWay
          },
          {
            path: 'return',
            component: Return
          }
        ]
      },
      {
        path: 'fixed_route',
        component: FixedRoute,
        children: [
          {
            path: '',
            redirect: 'search_station'
          },
          {
            path: 'route_list',
            component: RouteList
          },
          {
            path: 'search_station',
            component: SearchStation
          }
        ]
      },
      {
        path: 'transfer',
        component: Transfer,
        children: [
          {
            path: '',
            redirect: 'pick_plane'
          },
          {
            path: 'pick_plane',
            component: PickPlane
          },
          {
            path: 'pick_train',
            component: PickTrain
          },
          {
            path: 'send_plane',
            component: SendPlane
          },
          {
            path: 'send_train',
            component: SendTrain
          }
        ]
      }
    ]
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
