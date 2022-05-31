package com.example.point_of_sale.network

import com.example.point_of_sale.models.OrderItem
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    @GET("product/{id}")
    fun getProductById(@Path("id") productId : String) : Call<OrderItem>


    companion object {

            val BASE_URL = ""

            fun create() : ApiInterface {

                val retrofit = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .build()
                return retrofit.create(ApiInterface::class.java)

            }
        }
    }
