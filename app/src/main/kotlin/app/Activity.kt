package app

import android.os.Bundle
import androidx.activity.*
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Activity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			Theme {
				Surface(
					color = MaterialTheme.colorScheme.background,
					content = { Navigation() },
				)
			}
		}
	}
}
