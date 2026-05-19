package ru.shindei.advantage.ui.feature.roll

import androidx.lifecycle.ViewModel
import dagger.assisted.*
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.shindei.advantage.domain.repository.DieRepository
import ru.shindei.advantage.ui.common.stateInViewModel

@HiltViewModel(assistedFactory = RollScreenViewModel.Factory::class)
class RollScreenViewModel @AssistedInject constructor(
	@Assisted navParams: RollScreenNavParams,
	dieRepository: DieRepository,
) : ViewModel() {

	var dice = dieRepository.flowOfDice().stateInViewModel()

	@AssistedFactory
	fun interface Factory {

		fun create(navParams: RollScreenNavParams): RollScreenViewModel
	}
}
