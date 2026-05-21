package dice

interface Die : common.Entity {
	val label: String
	val kind: DieKind
	val colors: DieColors
	val typography: DieTypography
	val roll: () -> Int
}
