package roll

import dagger.assisted.AssistedFactory

@AssistedFactory
fun interface ViewModelFactory : (ScreenRoute) -> ViewModel {
	override operator fun invoke(route: ScreenRoute): ViewModel
}
