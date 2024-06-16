package presentation.di

import data.repository.RepositoryImpl
import data.repository.dataSource.LocalDataSource
import data.repository.dataSourceImpl.LocalDataSourceImpl
import domain.repository.Repository
import org.koin.dsl.module

val dataModule = module {
    single<LocalDataSource> { LocalDataSourceImpl(get()) }
    single<Repository> { RepositoryImpl(get()) }
}