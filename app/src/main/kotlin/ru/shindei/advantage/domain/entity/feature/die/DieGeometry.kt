package ru.shindei.advantage.domain.entity.feature.die

import ru.shindei.advantage.domain.entity.common.Entity

interface DieGeometry : Entity {

	fun roll(): Number
}
