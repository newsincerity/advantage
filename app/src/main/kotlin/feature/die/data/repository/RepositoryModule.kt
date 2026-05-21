package die

import dagger.*
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface RepositoryModule {
	@Binds
	fun bindDefaultRepository(repository: DefaultRepository): Repository
}
