import androidx.compose.ui.window.ComposeUIViewController
import org.koin.core.context.startKoin
import presentation.di.dataModule
import presentation.di.domainModule
import presentation.di.viewModelModule

fun MainViewController() = ComposeUIViewController(
    configure = { initKoin() }
) {
    App()
}


fun initKoin() {
    startKoin {
        modules(listOf(dataModule, domainModule, viewModelModule))
    }
}