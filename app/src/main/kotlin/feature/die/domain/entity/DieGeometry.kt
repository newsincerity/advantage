package die

import common.Entity

interface DieGeometry : Entity {
	fun roll(): Number
}
