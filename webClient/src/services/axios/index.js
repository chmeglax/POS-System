import axios from 'axios'
import store from 'store'

const apiClient = axios.create({
  baseURL: process.env.VUE_APP_API_URL,
  "Content-Type": "application/json",
});

apiClient.interceptors.request.use(request => {
  const accessToken = store.get('accessToken')
  if (accessToken) {
    request.headers.Authorization = `Bearer ${accessToken}`
    request.headers.AccessToken = accessToken
  }
  return request
})


export default apiClient
