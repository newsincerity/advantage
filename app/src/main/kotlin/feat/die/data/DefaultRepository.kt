package die

import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import ru.shindei.advantage.data.source.builtin.BuiltInDataSource
import ru.shindei.advantage.domain.entity.feature.die.Die

class DefaultRepository @Inject constructor(
	private val builtIn: BuiltInDataSource,
) : Repository {

	override fun flowOfDice(): Flow<List<Die>> = flowOf(builtIn.dice)
}
