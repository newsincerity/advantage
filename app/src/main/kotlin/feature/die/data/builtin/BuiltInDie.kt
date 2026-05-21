package die

data class BuiltInDie(
	override val id: String,
	override val colors: DieColors,
	override val geometry: DieGeometry,
	override val typography: DieTypography,
) : Die
