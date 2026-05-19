package ru.shindei.advantage.data.source.builtin

import ru.shindei.advantage.domain.entity.feature.die.DieTypography

enum class BuiltInDieTypography(
	override val id: String,
	override val format: (Number.() -> String)?,
) : DieTypography {

	Default(id = "default", format = null),
}
