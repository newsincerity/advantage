package ru.shindei.advantage.app.main

import android.os.Bundle
import androidx.activity.*
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import ru.shindei.advantage.ui.roll.RollScreen

class MainActivity : ComponentActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			MainTheme {
				Surface(
					color = MaterialTheme.colorScheme.background,
					content = { RollScreen() },
				)
			}
		}
	}
}
