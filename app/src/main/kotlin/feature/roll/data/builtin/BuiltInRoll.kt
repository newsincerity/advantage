package roll

enum class BuiltInRoll(
	override val label: String,
	vararg dice: dice.Die,
	private val aggregate: (scores: Iterable<Int>) -> Int = Iterable<Int>::sum,
) : Roll {

	D4("d4", dice.BuiltInDie.D4),
	D6("d6", dice.BuiltInDie.D6),
	D8("d8", dice.BuiltInDie.D8),
	D12("d12", dice.BuiltInDie.D12),
	D20("d20", dice.BuiltInDie.D20),
	D100("d%", dice.BuiltInDie.D0, dice.BuiltInDie.D00, aggregate = { scores ->
        scores.sum().let { score -> if (score == 0) 100 else score }
	});

	override val key: String = name
	override val dice: List<dice.Die> = dice.asList()
	override val roll: () -> Int = { aggregate(dice.map { die -> die.roll() }) }
}
