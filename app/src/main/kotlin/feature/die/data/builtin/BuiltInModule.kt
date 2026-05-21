package die

import dagger.*
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object BuiltInModule {
	@Provides
	@Singleton
	fun provideMemoryDataSource(): BuiltInDataSource =
		BuiltInDataSource()
}
