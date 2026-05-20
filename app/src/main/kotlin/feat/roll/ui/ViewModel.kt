package roll

import androidx.lifecycle.ViewModel
import dagger.assisted.*
import dagger.hilt.android.lifecycle.HiltViewModel
import feat.die.domain.DieRepository
import ru.shindei.advantage.ui.common.stateInViewModel

@HiltViewModel(assistedFactory = Factory::class)
class ViewModel @AssistedInject constructor(
    @Assisted navParams: Params,
    dieRepository: DieRepository,
) : ViewModel() {
    var dice = dieRepository.flowOfDice().stateInViewModel()
}
