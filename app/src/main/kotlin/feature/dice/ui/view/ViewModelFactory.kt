package dice

import dagger.assisted.AssistedFactory

@AssistedFactory
fun interface ViewModelFactory : (Route) -> ViewModel {
	override operator fun invoke(route: Route): ViewModel
}
