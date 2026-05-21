package app

import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.navigation3.*
import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy.Companion.listPane
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.*
import androidx.navigation3.ui.NavDisplay

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
fun Navigation() {
	val backStack: SnapshotStateList<Any> = remember { mutableStateListOf(roll.ScreenRoute) }
	val listDetailSceneStrategy: ListDetailSceneStrategy<Any> = rememberListDetailSceneStrategy()
	NavDisplay(
		backStack = backStack,
		onBack = { backStack.removeLastOrNull() },
		entryDecorators = listOf(
			rememberSaveableStateHolderNavEntryDecorator(),
			rememberViewModelStoreNavEntryDecorator(),
		),
		sceneStrategies = listOf(listDetailSceneStrategy),
		entryProvider = entryProvider {
			entry<roll.ScreenRoute>(metadata = listPane()) { route: roll.ScreenRoute ->
				roll.Screen(
					viewModel = hiltViewModel { factory: roll.ViewModelFactory -> factory(route) },
				)
			}
		},
	)
}
