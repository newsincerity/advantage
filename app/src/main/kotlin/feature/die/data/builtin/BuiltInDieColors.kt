package die

enum class BuiltInDieColors(
	override val id: String,
) : DieColors {

	Primary(id = "primary"),
	Secondary(id = "secondary"),
	Tertiary(id = "tertiary"),
	Error(id = "error"),
}
