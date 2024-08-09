package presentation.di

import androidx.room.RoomDatabase
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import data.database.StudentsDAO
import data.database.StudentsDataBase
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

val appModule = module {
    single<StudentsDAO> {
        val dbBuilder = get<RoomDatabase.Builder<StudentsDataBase>>()
        dbBuilder.setDriver(BundledSQLiteDriver()).build().studentsDao()
    }
}

expect val nativeModule: Module

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(appModule, dataModule, domainModule, viewModelModule, nativeModule)
    }
}
