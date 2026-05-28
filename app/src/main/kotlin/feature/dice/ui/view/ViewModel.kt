package dice

import androidx.lifecycle.ViewModel
import common.stateInViewModel
import dagger.assisted.*
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel(assistedFactory = ViewModelFactory::class)
class ViewModel @AssistedInject constructor(
	@Assisted route: Route,
	diceRepository: Repository,
) : ViewModel() {

	val dice = diceRepository.flowOfDice()
		.stateInViewModel(initialValue = emptyList())
}
