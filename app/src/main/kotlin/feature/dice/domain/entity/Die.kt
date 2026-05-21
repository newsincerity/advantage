package dice

interface Die : common.Entity {
	val colors: DieColors
	val geometry: DieGeometry
	val typography: DieTypography
}
