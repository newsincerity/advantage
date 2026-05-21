package roll

import javax.inject.Inject
import kotlinx.coroutines.flow.*

class DefaultRepository @Inject constructor(
	private val builtIn: BuiltInDataSource,
) : Repository {

	override fun flowOfRolls(): Flow<List<Roll>> =
		flowOf(builtIn.rolls)
}
