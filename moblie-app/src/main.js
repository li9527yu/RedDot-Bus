import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import { Tabbar, TabbarItem, Icon, Col, Row, NavBar, Cell, Grid, Popup, Calendar, IndexBar, IndexAnchor, DatetimePicker, Form, Field, GridItem, CellGroup, Button, Tab, Tabs, Image as VanImage } from 'vant'

Vue.use(NavBar)
Vue.use(VanImage)
Vue.use(Col)
Vue.use(Row)
Vue.use(Icon)
Vue.use(Tabbar)
Vue.use(TabbarItem)
Vue.use(Button)
Vue.use(Tab)
Vue.use(Tabs)
Vue.use(Cell)
Vue.use(CellGroup)
Vue.use(Grid)
Vue.use(GridItem)
Vue.use(Popup)
Vue.use(DatetimePicker)
Vue.use(Form)
Vue.use(Field)
Vue.use(Calendar)
Vue.use(IndexBar)
Vue.use(IndexAnchor)
Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
