package ru.shindei.advantage.app.main

import android.os.Bundle
import androidx.activity.*
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			MainTheme {
				Scaffold(
					modifier = Modifier.fillMaxSize(),
					content = { contentPadding ->
						LazyColumn(
							contentPadding = contentPadding,
							content = { },
						)
					},
				)
			}
		}
	}
}
