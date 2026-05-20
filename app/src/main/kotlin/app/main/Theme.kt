package main

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val defaultDarkColorScheme = darkColorScheme()
private val defaultLightColorScheme = lightColorScheme()

@Composable
fun Theme(
	darkTheme: Boolean = isSystemInDarkTheme(),
	dynamicColor: Boolean = true,
	content: @Composable () -> Unit,
) {
	val colorScheme = when {
		dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
			val context = LocalContext.current
			when {
				darkTheme -> dynamicDarkColorScheme(context)
				else -> dynamicLightColorScheme(context)
			}
		}

		darkTheme -> defaultDarkColorScheme
		else -> defaultLightColorScheme
	}
	MaterialTheme(
		colorScheme = colorScheme,
		content = content,
	)
}
