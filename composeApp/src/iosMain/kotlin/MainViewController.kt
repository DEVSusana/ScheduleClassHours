import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController { App() }


//fun initKoin() {
//    startKoin {
//        modules(
//            RemoteModule,
//            RepositoryModule,
//            UseCaseModule,
//            ViewModelModule
//        )
//    }
//}