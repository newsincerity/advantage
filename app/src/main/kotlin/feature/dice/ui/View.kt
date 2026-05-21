package dice

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Casino
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import app.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun View(
	viewModel: ViewModel,
	onBack: (() -> Unit)?,
	onNavigate: (Any) -> Unit,
) {
	val dice by viewModel.dice.collectAsStateWithLifecycle()
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
				navigationIcon = {
					if (onBack != null) IconButton(
						onClick = onBack,
						content = { Icon(Icons.AutoMirrored.Outlined.ArrowBack, stringResource(R.string.hint_nav_back)) },
					)
				},
				title = { Text(stringResource(R.string.title_dice)) },
				actions = {},
			)
		},
		content = { contentPadding ->
			LazyColumn(
				modifier = Modifier.fillMaxSize(),
				contentPadding = contentPadding,
				verticalArrangement = Arrangement.Center,
				horizontalAlignment = Alignment.CenterHorizontally,
				content = {
					items(dice, { it.key }) { die ->
						ListItem(
							modifier = Modifier.clickable { onNavigate(roll.Route) },
							headlineContent = { Text(die.geometry.key) },
							leadingContent = { Icon(Icons.Outlined.Casino, null) },
						)
					}
				},
			)
		},
	)
}
