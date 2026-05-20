package die

import kotlinx.coroutines.flow.Flow
import ru.shindei.advantage.domain.entity.feature.die.Die

interface Repository {

	fun flowOfDice(): Flow<List<Die>>
}
