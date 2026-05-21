package die

enum class BuiltInDieTypography(
	override val id: String,
	override val format: (Number.() -> String)?,
) : DieTypography {

	Default(id = "default", format = null),
}
