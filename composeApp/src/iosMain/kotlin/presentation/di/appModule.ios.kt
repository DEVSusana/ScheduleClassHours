package presentation.di

import database.getDatabaseBuilder
import org.koin.core.module.Module
import org.koin.dsl.module

actual val nativeModule = module {
    single { getDatabaseBuilder() }
}