/* eslint-disable */
import apiClient from "@/services/axios";
import store from "store";
export async function login(email, password) {
  return new Promise((resolve, reject) => {
    apiClient
      .post("/auth/signin", {
        username: email,
        password: password,
      })
      .then((response) => {
        if (response) {
          const { accessToken } = response.data;
          if (accessToken) {
            store.set("accessToken", accessToken);
          }
          const info = response.data;
          resolve(info)
        }
      })
      .catch((err) =>
        reject({
          message: "Échec de la connexion",
        })
      );
  })
}

export async function register(email, password, name) {
  return apiClient
    .post("/auth/register", {
      email,
      password,
    })
    .then((response) => {
      if (response) {
        const { accessToken } = response.data;
        if (accessToken) {
          store.set("accessToken", accessToken);
        }
        return response.data;
      }
      return false;
    });
}

export async function currentAccount() {
  return {};
}

export async function logout() {
  try {
    store.remove("accessToken"); //app.settings.activeBuilding
    store.remove("app.menu.selectedKeys");
    store.remove("app.topbar.favs");
    return true;
  } catch {
    return false;
  }
}