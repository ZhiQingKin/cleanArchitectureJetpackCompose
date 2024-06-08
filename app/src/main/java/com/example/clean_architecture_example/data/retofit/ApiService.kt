package com.example.clean_architecture_example.data.retofit

import com.example.clean_architecture_example.data.model.BitcoinResponse
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("v2/exchange-rates?currency=BTC")
    fun getBitcoinResponse(): Call<JsonObject>
}