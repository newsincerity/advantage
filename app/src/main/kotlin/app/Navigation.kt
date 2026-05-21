package app

import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.navigation3.*
import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy.Companion.detailPane
import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy.Companion.listPane
import androidx.compose.runtime.Composable
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.*
import androidx.navigation3.ui.NavDisplay

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
fun Navigation() {
	val backStack: NavBackStack<NavKey> = rememberNavBackStack(roll.Route, dice.Route)
	val listDetailSceneStrategy: ListDetailSceneStrategy<NavKey> = rememberListDetailSceneStrategy()
	NavDisplay(
		backStack = backStack,
		onBack = { backStack.removeLastOrNull() },
		entryDecorators = listOf(
			rememberSaveableStateHolderNavEntryDecorator(),
			rememberViewModelStoreNavEntryDecorator(),
		),
		sceneStrategies = listOf(listDetailSceneStrategy),
		entryProvider = entryProvider {
			entry<dice.Route>(metadata = listPane()) { route -> dice.View(
				viewModel = hiltViewModel { factory: dice.ViewModelFactory -> factory(route) },
				onNavigate = { route -> },
			) }
			entry<roll.Route>(metadata = detailPane()) { route -> roll.View(
				viewModel = hiltViewModel { factory: roll.ViewModelFactory -> factory(route) },
			) }
		},
	)
}
