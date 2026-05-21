package die

import dagger.*
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MemoryModule {
	@Provides
	@Singleton
	fun provideMemoryDataSource(): MemoryDataSource =
		MemoryDataSource()
}
