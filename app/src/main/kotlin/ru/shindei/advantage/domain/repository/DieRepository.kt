package ru.shindei.advantage.domain.repository

import kotlinx.coroutines.flow.Flow
import ru.shindei.advantage.domain.entity.feature.die.Die

interface DieRepository {

	fun flowOfDice(): Flow<List<Die>>
}
