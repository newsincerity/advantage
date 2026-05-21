package dice

enum class BuiltInDieGeometry(
	override val key: String,
	val range: IntRange,
	val step: Int = 1,
) : DieGeometry {

	D4(key = "d4", range = 1..4),
	D6(key = "d6", range = 1..6),
	D8(key = "d8", range = 1..8),
	D0(key = "d0", range = 0..9),
	D12(key = "d12", range = 1..12),
	D20(key = "d20", range = 1..20),
	D00(key = "d00", range = 0..90, step = 10);

	override fun roll(): Int =
		range.random() * step
}
