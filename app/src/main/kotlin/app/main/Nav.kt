package main

import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.navigation3.*
import androidx.compose.runtime.*
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.*
import androidx.navigation3.ui.NavDisplay

@OptIn(ExperimentalMaterial3AdaptiveApi::class) @Composable fun Nav() {
	val backStack = remember { mutableStateListOf<Any>() }
	val listDetailSceneStrategy = rememberListDetailSceneStrategy<Any>()
	NavDisplay(
		backStack = backStack,
		onBack = { backStack.removeLastOrNull() },
		entryDecorators = listOf(
			rememberSaveableStateHolderNavEntryDecorator(),
			rememberViewModelStoreNavEntryDecorator(),
		),
		sceneStrategies = listOf(listDetailSceneStrategy),
		entryProvider = entryProvider {
			entry<roll.Params>(
				metadata = ListDetailSceneStrategy.listPane(),
				content = { params -> roll.Screen(
					viewModel = hiltViewModel<roll.ViewModel, roll.Factory> { it(params) },
				) },
			)
		},
	)
}
