package dice

data class BuiltInDie(
	override val key: String,
	override val colors: DieColors,
	override val geometry: DieGeometry,
	override val typography: DieTypography,
) : Die
