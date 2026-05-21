package die

enum class BuiltInDieGeometry(
	override val id: String,
	val range: IntRange,
) : DieGeometry {

	D4(id = "d4", range = 1..4),
	D6(id = "d6", range = 1..6),
	D8(id = "d8", range = 1..8),
	D10(id = "d10", range = 1..10),
	D12(id = "d12", range = 1..12),
	D20(id = "d20", range = 1..20),
	;

	override fun roll(): Int =
		range.random()
}
