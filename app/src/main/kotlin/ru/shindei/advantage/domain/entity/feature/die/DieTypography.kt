package ru.shindei.advantage.domain.entity.feature.die

import ru.shindei.advantage.domain.entity.common.Entity

interface DieTypography : Entity {

	val format: (Number.() -> String)?
}
