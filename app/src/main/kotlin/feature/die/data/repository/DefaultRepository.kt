package die

import javax.inject.Inject
import kotlinx.coroutines.flow.*

class DefaultRepository @Inject constructor(
	private val builtIn: MemoryDataSource,
) : Repository {

	override fun flowOfDice(): Flow<List<Die>> =
		flowOf(builtIn.dice)
}
