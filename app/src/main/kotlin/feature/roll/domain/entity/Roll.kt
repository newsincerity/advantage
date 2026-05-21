package roll

import dice.Die

interface Roll : common.Entity {
	val label: String
	val dice: List<Die>
	val roll: () -> Int
}
