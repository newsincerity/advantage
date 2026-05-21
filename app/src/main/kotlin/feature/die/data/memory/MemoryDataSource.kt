package die

class MemoryDataSource {
	val dice: List<Die> = listOf(
		MemoryDie(
			id = "d4",
			colors = MemoryDieColors.Primary,
			geometry = MemoryDieGeometry.D4,
			typography = MemoryDieTypography.Default,
		),
		MemoryDie(
			id = "d6",
			colors = MemoryDieColors.Primary,
			geometry = MemoryDieGeometry.D6,
			typography = MemoryDieTypography.Default,
		),
		MemoryDie(
			id = "d8",
			colors = MemoryDieColors.Primary,
			geometry = MemoryDieGeometry.D8,
			typography = MemoryDieTypography.Default,
		),
		MemoryDie(
			id = "d10",
			colors = MemoryDieColors.Primary,
			geometry = MemoryDieGeometry.D10,
			typography = MemoryDieTypography.Default,
		),
		MemoryDie(
			id = "d12",
			colors = MemoryDieColors.Primary,
			geometry = MemoryDieGeometry.D12,
			typography = MemoryDieTypography.Default,
		),
		MemoryDie(
			id = "d20",
			colors = MemoryDieColors.Primary,
			geometry = MemoryDieGeometry.D20,
			typography = MemoryDieTypography.Default,
		),
	)
}
