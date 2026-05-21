package common

import androidx.lifecycle.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.*

private const val DefaultTimeoutWhileSubscribed: Long = 5000

context(viewModel: ViewModel)
fun <T> Flow<T>.stateInViewModel(
	initialValue: T,
	scope: CoroutineScope = viewModel.viewModelScope,
	started: SharingStarted = SharingStarted.WhileSubscribed(DefaultTimeoutWhileSubscribed),
) =
	stateIn(scope, started, initialValue)

context(viewModel: ViewModel)
fun <T> Flow<T>.stateInViewModel(
	scope: CoroutineScope = viewModel.viewModelScope,
	started: SharingStarted = SharingStarted.WhileSubscribed(DefaultTimeoutWhileSubscribed),
) =
	stateIn(scope, started, null)
