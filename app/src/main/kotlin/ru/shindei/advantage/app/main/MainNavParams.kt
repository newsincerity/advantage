package ru.shindei.advantage.app.main

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable
import ru.shindei.advantage.ui.feature.roll.RollScreenNavParams

interface MainNavParams : NavKey {
	@Serializable data object RollScreen : MainNavParams, RollScreenNavParams
}
