package dice

class BuiltInDataSource {
	val dice: List<Die> = listOf(
		BuiltInDie(
			key = "d4",
			colors = BuiltInDieColors.Primary,
			geometry = BuiltInDieGeometry.D4,
			typography = BuiltInDieTypography.Default,
		),
		BuiltInDie(
			key = "d6",
			colors = BuiltInDieColors.Primary,
			geometry = BuiltInDieGeometry.D6,
			typography = BuiltInDieTypography.Default,
		),
		BuiltInDie(
			key = "d8",
			colors = BuiltInDieColors.Primary,
			geometry = BuiltInDieGeometry.D8,
			typography = BuiltInDieTypography.Default,
		),
		BuiltInDie(
			key = "d0",
			colors = BuiltInDieColors.Primary,
			geometry = BuiltInDieGeometry.D0,
			typography = BuiltInDieTypography.Default,
		),
		BuiltInDie(
			key = "d12",
			colors = BuiltInDieColors.Primary,
			geometry = BuiltInDieGeometry.D12,
			typography = BuiltInDieTypography.Default,
		),
		BuiltInDie(
			key = "d20",
			colors = BuiltInDieColors.Primary,
			geometry = BuiltInDieGeometry.D20,
			typography = BuiltInDieTypography.Default,
		),
		BuiltInDie(
			key = "d00",
			colors = BuiltInDieColors.Primary,
			geometry = BuiltInDieGeometry.D00,
			typography = BuiltInDieTypography.Default,
		),
	)
}
