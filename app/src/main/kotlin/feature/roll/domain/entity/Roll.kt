package roll

interface Roll : common.Entity {
	val label: String
	val dice: List<dice.Die>
	val roll: () -> Int
}
