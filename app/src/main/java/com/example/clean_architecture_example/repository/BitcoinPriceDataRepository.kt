package com.example.clean_architecture_example.repository

import com.example.clean_architecture_example.data.data_source.Resource
import com.example.clean_architecture_example.data.model.BitcoinResponse
import com.google.gson.JsonObject
import kotlinx.coroutines.flow.Flow

interface BitcoinPriceDataRepository {
    suspend fun getData(): Flow<Resource<JsonObject>>
}