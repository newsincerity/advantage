package ru.shindei.advantage.app.main

import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy
import androidx.compose.material3.adaptive.navigation3.rememberListDetailSceneStrategy
import androidx.compose.runtime.*
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.*
import androidx.navigation3.ui.NavDisplay
import ru.shindei.advantage.ui.feature.roll.RollScreen

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
fun MainNav() {
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
			entry<MainNavParams.RollScreen>(
				metadata = ListDetailSceneStrategy.listPane(),
				content = { navParams ->
					RollScreen(
						viewModel = hiltViewModel(),
					)
				},
			)
			/*
			entry<MainNavParams.RollScreen>(
				metadata = ListDetailSceneStrategy.detailPane(),
				content = {},
			)
			entry<MainNavParams.RollScreen>(
				metadata = ListDetailSceneStrategy.extraPane(),
				content = {},
			)
			*/
		},
	)
}
