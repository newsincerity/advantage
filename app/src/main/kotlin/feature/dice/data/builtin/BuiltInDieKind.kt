package dice

enum class BuiltInDieKind(
	override val label: String,
	private val roll: () -> Int,
) : DieKind {

	D4("d4", { (1..4).random() }),
	D6("d6", { (1..6).random() }),
	D8("d8", { (1..8).random() }),
	D0("d0", { (0..9).random() }),
	D12("d12", { (1..12).random() }),
	D20("d20", { (1..20).random() }),
	D00("d00", { 10 * (0..9).random() });

	override val key: String = name
	override fun roll(): Int = roll.invoke()
}
