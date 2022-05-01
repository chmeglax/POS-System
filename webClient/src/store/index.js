import { createStore } from 'vuex'
import user from './user'
import settings from './settings'

export default createStore({
  modules: {
    user,
    settings,
  },
  state: {},
  mutations: {},
  actions: {},
  getters: {},
})
