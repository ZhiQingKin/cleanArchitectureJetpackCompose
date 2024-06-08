package com.example.clean_architecture_example.page.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.clean_architecture_example.data.model.InvalidUserException
import com.example.clean_architecture_example.page.module.MainEvent
import com.example.clean_architecture_example.page.module.MainState
import com.example.clean_architecture_example.page.use_case.MainUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.time.Duration.Companion.seconds


@HiltViewModel
class MainViewModel @Inject constructor(private val mainUseCase: MainUseCase) : ViewModel() {

    private val _state = mutableStateOf(MainState(false, null,true))
    val state: State<MainState> = _state

    init {
        viewModelScope.launch {
            while(true) {
                onEvent(MainEvent.InitEvent)
                delay(3.seconds)
            }
        }

    }

    fun onEvent(event: MainEvent) {
        when (event) {
            is MainEvent.InitEvent -> {
                viewModelScope.launch {
                    try {
                        mainUseCase.getBitcoinResponse({
                            _state.value = state.value.copy(
                                isLoading = true
                            )
                        },{
                            viewModelScope.launch {

                                _state.value = state.value.copy(
                                    isLoading = false,
                                    bitcoinResponse = it,
                                    isFirstTime = false
                                )

                            }
                        },{
                            viewModelScope.launch {
                                _state.value = state.value.copy(
                                    isLoading = false,
                                )
                            }
                        })
                    } catch(e: InvalidUserException) {
                        viewModelScope.launch {
                            _state.value = state.value.copy(
                                isLoading = false,
                            )
                        }
                    }

                }
            }
        }
    }
}