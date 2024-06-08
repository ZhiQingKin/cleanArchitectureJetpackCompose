package com.example.clean_architecture_example.page.module

import com.google.gson.JsonObject

data class MainState(
    var isLoading: Boolean,
    var bitcoinResponse: JsonObject?,
    var isFirstTime: Boolean
)