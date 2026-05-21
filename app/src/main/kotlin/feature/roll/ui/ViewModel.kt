package roll

import androidx.lifecycle.ViewModel
import common.stateInViewModel
import dagger.assisted.*
import dagger.hilt.android.lifecycle.HiltViewModel
import die.Repository

@HiltViewModel(assistedFactory = ViewModelFactory::class)
class ViewModel @AssistedInject constructor(
	@Assisted route: ScreenRoute,
	dieRepository: Repository,
) : ViewModel() {

	var dice = dieRepository.flowOfDice().stateInViewModel()
}
