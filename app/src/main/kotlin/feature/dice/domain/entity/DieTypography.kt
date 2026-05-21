package dice

interface DieTypography : common.Entity {
	val format: (Number.() -> String)?
}
