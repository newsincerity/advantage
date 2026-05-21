package roll

import androidx.compose.animation.*
import androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import app.BuildConfig
import app.R
import kotlin.random.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen(
	viewModel: ViewModel,
) {
	var d0 by rememberSaveable { mutableIntStateOf(0) }
	var d00 by rememberSaveable { mutableIntStateOf(0) }
	val d100 by remember { derivedStateOf { (d00 + d0).takeIf { it != 0 } ?: 100 } }

	var aboutAppDialogExpanded by rememberSaveable { mutableStateOf(false) }
	var actionsMenuExpanded by rememberSaveable { mutableStateOf(false) }
	var privacyPolicyDialogExpanded by rememberSaveable { mutableStateOf(false) }

	fun roll() {
		d0 = Random.nextInt(0..9)
		d00 = Random.nextInt(0..9) * 10
	}

	val diceTransitionSpec: AnimatedContentTransitionScope<*>.() -> ContentTransform = {
		slideIntoContainer(SlideDirection.Up) togetherWith slideOutOfContainer(SlideDirection.Up)
	}

	if (aboutAppDialogExpanded) {
		AlertDialog(
			onDismissRequest = { aboutAppDialogExpanded = false },
			title = { Text(stringResource(R.string.title_about_app)) },
			text = {
				Text(
					text = stringResource(
						id = R.string.text_about_app,
						BuildConfig.VERSION_NAME,
						BuildConfig.APPLICATION_ID,
						BuildConfig.VERSION_CODE,
						BuildConfig.BUILD_TYPE,
					),
					style = MaterialTheme.typography.bodyLarge,
				)
			},
			confirmButton = {
				TextButton(
					onClick = { aboutAppDialogExpanded = false },
					content = { Text(stringResource(R.string.button_ok)) },
				)
			},
		)
	}
	if (privacyPolicyDialogExpanded) {
		AlertDialog(
			onDismissRequest = { privacyPolicyDialogExpanded = false },
			title = { Text(stringResource(R.string.title_privacy_policy)) },
			text = {
				Text(
					text = stringResource(R.string.text_privacy_policy),
					style = MaterialTheme.typography.bodyLarge,
				)
			},
			confirmButton = {
				TextButton(
					onClick = { privacyPolicyDialogExpanded = false },
					content = { Text(stringResource(R.string.button_ok)) },
				)
			},
		)
	}
	Scaffold(
		topBar = {
			TopAppBar(
				colors = TopAppBarDefaults.topAppBarColors(
					containerColor = Color.Transparent,
					scrolledContainerColor = Color.Transparent,
					navigationIconContentColor = MaterialTheme.colorScheme.onSurface,
					titleContentColor = MaterialTheme.colorScheme.onSurface,
					actionIconContentColor = MaterialTheme.colorScheme.onSurfaceVariant,
					subtitleContentColor = MaterialTheme.colorScheme.onSurfaceVariant,
				),
				title = { Text(stringResource(R.string.title_d100)) },
				actions = {

					IconButton(
						onClick = { actionsMenuExpanded = true },
						content = {
							Icon(
								Icons.Outlined.MoreVert,
								stringResource(R.string.hint_menu_action),
							)
							DropdownMenu(
								expanded = actionsMenuExpanded,
								onDismissRequest = { actionsMenuExpanded = false },
								content = {
									DropdownMenuItem(
										onClick = {
											actionsMenuExpanded = false
											privacyPolicyDialogExpanded = true
										},
										text = { Text(stringResource(R.string.title_privacy_policy)) },
										leadingIcon = { Icon(Icons.Outlined.Policy, null) },
									)
									DropdownMenuItem(
										onClick = {
											actionsMenuExpanded = false
											aboutAppDialogExpanded = true
										},
										text = { Text(stringResource(R.string.title_about_app)) },
										leadingIcon = { Icon(Icons.Outlined.Info, null) },
									)
								},
							)
						},
					)
				},
			)
		},
		floatingActionButton = {
			FloatingActionButton(onClick = ::roll) {
				Icon(
					modifier = Modifier.size(32.dp),
					imageVector = Icons.Outlined.Casino,
					contentDescription = stringResource(R.string.hint_fab_roll),
				)
			}
		},
		content = { contentPadding ->
			LazyColumn(
				modifier = Modifier.fillMaxSize(),
				contentPadding = contentPadding,
				verticalArrangement = Arrangement.Center,
				horizontalAlignment = Alignment.CenterHorizontally,
				content = {
					item {
						FlowRow(
							horizontalArrangement = Arrangement.spacedBy(
								space = 8.dp,
								alignment = Alignment.CenterHorizontally,
							),
							itemVerticalAlignment = Alignment.CenterVertically,
							content = {
								Card(onClick = ::roll) {
									AnimatedContent(
										targetState = d00,
										transitionSpec = diceTransitionSpec,
										content = {
											Text(
												modifier = Modifier.padding(all = 16.dp),
												text = stringResource(R.string.dice_d00, it),
												style = MaterialTheme.typography.displaySmall,
											)
										},
									)
								}
								Card(onClick = ::roll) {
									AnimatedContent(
										targetState = d0,
										transitionSpec = diceTransitionSpec,
										content = {
											Text(
												modifier = Modifier.padding(all = 16.dp),
												text = stringResource(R.string.dice_d0, it),
												style = MaterialTheme.typography.displaySmall,
											)
										},
									)
								}
							},
						)
					}
					item {
						Spacer(Modifier.height(8.dp))
						AnimatedContent(d100) {
							Text(
								text = stringResource(R.string.dice_d100, it),
								style = MaterialTheme.typography.bodyLarge,
							)
						}
					}
				},
			)
		},
	)
}
