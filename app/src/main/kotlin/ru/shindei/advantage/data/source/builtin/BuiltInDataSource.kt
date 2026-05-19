package ru.shindei.advantage.data.source.builtin

import ru.shindei.advantage.domain.entity.feature.die.Die

class BuiltInDataSource {

	val dice: List<Die> = listOf(
		BuiltInDie(
			id = "d4",
			colors = BuiltInDieColors.Primary,
			geometry = BuiltInDieGeometry.D4,
			typography = BuiltInDieTypography.Default,
		),
		BuiltInDie(
			id = "d6",
			colors = BuiltInDieColors.Primary,
			geometry = BuiltInDieGeometry.D6,
			typography = BuiltInDieTypography.Default,
		),
		BuiltInDie(
			id = "d8",
			colors = BuiltInDieColors.Primary,
			geometry = BuiltInDieGeometry.D8,
			typography = BuiltInDieTypography.Default,
		),
		BuiltInDie(
			id = "d10",
			colors = BuiltInDieColors.Primary,
			geometry = BuiltInDieGeometry.D10,
			typography = BuiltInDieTypography.Default,
		),
		BuiltInDie(
			id = "d12",
			colors = BuiltInDieColors.Primary,
			geometry = BuiltInDieGeometry.D12,
			typography = BuiltInDieTypography.Default,
		),
		BuiltInDie(
			id = "d20",
			colors = BuiltInDieColors.Primary,
			geometry = BuiltInDieGeometry.D20,
			typography = BuiltInDieTypography.Default,
		),
	)
}
