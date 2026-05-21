package dice

interface DieKind : common.Entity {
	val label: String
	val roll: () -> Int
}
