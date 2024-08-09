package presentation.di

import data.repository.RepositoryImpl
import data.repository.dataSource.LocalDataSource
import data.repository.dataSourceImpl.LocalDataSourceImpl
import domain.repository.Repository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val dataModule = module {
    singleOf(::LocalDataSourceImpl) { bind<LocalDataSource>() }
    singleOf(::RepositoryImpl){ bind<Repository>() }
}