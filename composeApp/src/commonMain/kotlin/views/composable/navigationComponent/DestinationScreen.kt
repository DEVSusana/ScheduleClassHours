package views.composable.navigationComponent

sealed class DestinationScreen(val route: String) {
    data object SplashScreenDest : DestinationScreen(route =
    "splash")
    data object MainScreenDest : DestinationScreen(route = "main_screen")
}