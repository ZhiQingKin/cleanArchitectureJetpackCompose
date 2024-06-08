package com.example.clean_architecture_example.page.module

sealed class  MainEvent {
    data object InitEvent:  MainEvent()
}