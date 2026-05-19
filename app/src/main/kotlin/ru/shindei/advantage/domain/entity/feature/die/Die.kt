package ru.shindei.advantage.domain.entity.feature.die

import ru.shindei.advantage.domain.entity.common.Entity

interface Die : Entity {

	val colors: DieColors
	val geometry: DieGeometry
	val typography: DieTypography
}
