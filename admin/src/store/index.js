import Vue from 'vue'
import Vuex from 'vuex'
import db from "@/utils/localstorage";

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    token: db.get("USER_TOKEN"),
    userID: db.get("USERID"),
  },
  mutations: {
    setToken(state, val) {
      db.save("USER_TOKEN", val);
      state.token = val;
    },
    setUserID(state, val) {
      db.save("USERID", val);
      state.userID = val;
    },
    reLogin(state) {
      db.clear();
      state.userID = "";
      state.token = "";
    }
  }
})
