import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import { Tabbar, TabbarItem, Icon, Col, Row, NavBar, Button, Image as VanImage } from 'vant'

Vue.use(NavBar)
Vue.use(VanImage)
Vue.use(Col)
Vue.use(Row)
Vue.use(Icon)
Vue.use(Tabbar)
Vue.use(TabbarItem)
Vue.use(Button)
Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
