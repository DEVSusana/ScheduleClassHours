import androidx.compose.ui.window.ComposeUIViewController
import presentation.di.initKoin
import views.App

fun MainViewController() = ComposeUIViewController(
    configure = { initKoin() }
) {
    App()
}