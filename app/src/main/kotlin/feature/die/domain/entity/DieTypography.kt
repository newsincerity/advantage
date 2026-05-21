package die

import common.Entity

interface DieTypography : Entity {
	val format: (Number.() -> String)?
}
