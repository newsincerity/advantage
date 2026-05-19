package ru.shindei.advantage.data.repository.die

import kotlinx.coroutines.flow.*
import ru.shindei.advantage.data.source.builtin.BuiltInDataSource
import ru.shindei.advantage.domain.entity.feature.die.Die
import ru.shindei.advantage.domain.repository.DieRepository
import javax.inject.Inject

class DefaultDieRepository @Inject constructor(
	private val builtIn: BuiltInDataSource,
) : DieRepository {

	override fun flowOfDice(): Flow<List<Die>> = flowOf(builtIn.dice)

	@Module
	interface Module {

	}
}
