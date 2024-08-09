import androidx.compose.ui.window.ComposeUIViewController
import data.database.StudentsDataBase
import data.database.getRoomDatabase
import database.getDatabaseBuilder
import org.koin.core.context.startKoin
import presentation.di.appModule
import presentation.di.dataModule
import presentation.di.domainModule
import presentation.di.initKoin
import presentation.di.viewModelModule
import views.App

fun MainViewController() = ComposeUIViewController(
    configure = { initKoin() }
) {
    App()
}