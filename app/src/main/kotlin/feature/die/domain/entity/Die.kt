package die

import common.Entity

interface Die : Entity {
	val colors: DieColors
	val geometry: DieGeometry
	val typography: DieTypography
}
