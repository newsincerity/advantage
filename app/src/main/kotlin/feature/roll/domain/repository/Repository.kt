package roll

import kotlinx.coroutines.flow.Flow

interface Repository {
	fun flowOfRolls(): Flow<List<Roll>>
}
