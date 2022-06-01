package com.example.point_of_sale.network

import com.example.point_of_sale.models.OrderItem
import com.example.point_of_sale.models.Product
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    @GET("product/{id}")
    suspend  fun getProductById(@Path("id") productId : String) : Response<Product>


    companion object {

            val BASE_URL = "http://192.168.1.4:8090/api/"

            fun create() : ApiInterface {

                val retrofit = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .build()
                return retrofit.create(ApiInterface::class.java)

            }
        }
    }
