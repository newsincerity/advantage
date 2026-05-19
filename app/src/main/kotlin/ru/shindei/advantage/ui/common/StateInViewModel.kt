package ru.shindei.advantage.ui.common

import androidx.lifecycle.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.*

private val defaultWhileSubscribed = SharingStarted.WhileSubscribed(5000)

context(viewModel: ViewModel)
fun <T> Flow<T>.stateInViewModel(
	initialValue: T,
	scope: CoroutineScope = viewModel.viewModelScope,
	started: SharingStarted = defaultWhileSubscribed,
) = stateIn(scope, started, initialValue)

context(viewModel: ViewModel)
fun <T> Flow<T>.stateInViewModel(
	scope: CoroutineScope = viewModel.viewModelScope,
	started: SharingStarted = defaultWhileSubscribed,
) = stateIn(scope, started, null)
