package com.susanadev.scheduleclasshours

import android.app.Application
import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class AndroidApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AndroidApp)
            androidLogger()
//            modules(
//                NetModule,
//                RepositoryModule,
//                UseCaseModule,
//                ViewModelModule
//            )
        }
    }
}