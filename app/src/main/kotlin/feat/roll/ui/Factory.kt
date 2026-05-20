package roll

import dagger.assisted.AssistedFactory

@AssistedFactory
fun interface Factory {
    operator fun invoke(navParams: Params): ViewModel
}
