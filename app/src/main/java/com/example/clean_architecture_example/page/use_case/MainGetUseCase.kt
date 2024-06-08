package com.example.clean_architecture_example.page.use_case

import com.example.clean_architecture_example.data.data_source.Resource
import com.example.clean_architecture_example.data.model.InvalidUserException
import com.example.clean_architecture_example.repository.BitcoinPriceDataRepository
import com.google.gson.JsonObject

class MainGetUseCase(
    private val repository: BitcoinPriceDataRepository
) {
    @Throws(InvalidUserException::class)
    suspend operator fun invoke(
        onLoading:() -> Unit,
        onSuccess: (JsonObject?) -> Unit,
        onError: (String) -> Unit) {
        repository.getData().collect{
                valueData -> when(valueData){
            is Resource.Success-> {
                onSuccess(valueData.data)
            }
            is Resource.Loading-> {
                onLoading()
            }
            is Resource.Error-> {
                onError(valueData.message ?: "")
            }
        }
        }

    }
}