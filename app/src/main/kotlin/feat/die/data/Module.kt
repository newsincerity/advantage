package die

import dagger.Module

@Module
interface Module {
	fun bindRepository(repository: DefaultRepository): Repository
}
