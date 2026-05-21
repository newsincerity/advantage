package dice

import kotlinx.coroutines.flow.Flow

interface Repository {
	fun flowOfDice(): Flow<List<Die>>
}
