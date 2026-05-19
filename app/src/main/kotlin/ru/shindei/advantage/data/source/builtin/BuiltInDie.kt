package ru.shindei.advantage.data.source.builtin

import ru.shindei.advantage.domain.entity.feature.die.*

data class BuiltInDie(
	override val id: String,
	override val colors: DieColors,
	override val geometry: DieGeometry,
	override val typography: DieTypography,
) : Die
