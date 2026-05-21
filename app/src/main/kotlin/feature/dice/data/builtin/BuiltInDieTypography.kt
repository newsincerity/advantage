package dice

enum class BuiltInDieTypography(
	override val key: String,
	override val format: (Number.() -> String)?,
) : DieTypography {

	Default(key = "default", format = null),
}
