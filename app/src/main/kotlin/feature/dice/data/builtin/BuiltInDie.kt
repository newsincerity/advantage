package dice

enum class BuiltInDie(
	override val label: String,
	override val kind: BuiltInDieKind,
	override val colors: DieColors,
	override val typography: DieTypography,
) : Die {

	D4("d4", BuiltInDieKind.D4, BuiltInDieColors.Primary, BuiltInDieTypography.Default),
	D6("d6", BuiltInDieKind.D6, BuiltInDieColors.Primary, BuiltInDieTypography.Default),
	D8("d8", BuiltInDieKind.D8, BuiltInDieColors.Primary, BuiltInDieTypography.Default),
	D0("d0", BuiltInDieKind.D0, BuiltInDieColors.Primary, BuiltInDieTypography.Default),
	D12("d12", BuiltInDieKind.D12, BuiltInDieColors.Primary, BuiltInDieTypography.Default),
	D20("d20", BuiltInDieKind.D20, BuiltInDieColors.Primary, BuiltInDieTypography.Default),
	D00("d00", BuiltInDieKind.D00, BuiltInDieColors.Primary, BuiltInDieTypography.Default);

	override val key: String = name
	override val roll: () -> Int = kind.roll
}
