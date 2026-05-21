package roll

import android.R.attr.name
import dice.*

enum class BuiltInRoll(
	override val label: String,
	vararg dice: Die,
	private val aggregate: (scores: Iterable<Int>) -> Int = Iterable<Int>::sum,
) : Roll {

	D4("d4", BuiltInDie.D4),
	D6("d6", BuiltInDie.D6),
	D8("d8", BuiltInDie.D8),
	D12("d12", BuiltInDie.D12),
	D20("d20", BuiltInDie.D20),
	D100("d%", BuiltInDie.D0, BuiltInDie.D00, aggregate = { scores -> scores.sum()
		.let { score -> if (score == 0) 100 else score }
	});

	override val key: String = name
	override val dice: List<Die> = dice.asList()
	override val roll: () -> Int = { aggregate(dice.map { die -> die.roll() }) }
}
