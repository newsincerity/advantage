package dice

enum class BuiltInDieColors(
	override val key: String,
) : DieColors {

	Primary(key = "primary"),
	Secondary(key = "secondary"),
	Tertiary(key = "tertiary"),
	Error(key = "error"),
}
