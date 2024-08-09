package com.susanadev.scheduleclasshours

import android.app.Application
import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import presentation.di.appModule
import presentation.di.dataModule
import presentation.di.domainModule
import presentation.di.initKoin
import presentation.di.viewModelModule

class AndroidApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidLogger()
            androidContext(this@AndroidApp)
        }
    }
}