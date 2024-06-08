package com.example.clean_architecture_example.data.implementation

import kotlinx.coroutines.*
import com.example.clean_architecture_example.data.data_source.Resource
import com.example.clean_architecture_example.data.model.BitcoinResponse
import com.example.clean_architecture_example.data.retofit.ApiClient
import com.example.clean_architecture_example.repository.BitcoinPriceDataRepository
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import retrofit2.Call
import retrofit2.Response
import retrofit2.awaitResponse


class BitcoinResponseAPIImpl(private val apiClient: ApiClient): BitcoinPriceDataRepository {
    override suspend fun getData(): Flow<Resource<JsonObject>> {
        return flow<Resource<JsonObject>> {
            emit(value = Resource.Loading<JsonObject>())

           val call: Call<JsonObject> = apiClient.apiService.getBitcoinResponse()
            val response: Response<JsonObject> = call.awaitResponse()

            emit(value = Resource.Success<JsonObject>(data = response.body()!!))

            //emit(value = Resource.Success(data = result))
        }.catch {
             emit(value = Resource.Error<JsonObject>(it.message.toString()) )
        }
    }
}
