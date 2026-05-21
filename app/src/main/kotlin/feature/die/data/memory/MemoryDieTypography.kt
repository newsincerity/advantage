package die

enum class MemoryDieTypography(
	override val id: String,
	override val format: (Number.() -> String)?,
) : DieTypography {

	Default(id = "default", format = null),
}
