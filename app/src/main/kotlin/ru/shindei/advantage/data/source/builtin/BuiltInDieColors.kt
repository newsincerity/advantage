package ru.shindei.advantage.data.source.builtin

import ru.shindei.advantage.domain.entity.feature.die.DieColors

enum class BuiltInDieColors(
	override val id: String,
) : DieColors {

	Primary(id = "primary"),
	Secondary(id = "secondary"),
	Tertiary(id = "tertiary"),
	Error(id = "error"),
}
