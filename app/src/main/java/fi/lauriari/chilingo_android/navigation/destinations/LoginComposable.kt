package fi.lauriari.chilingo_android.navigation.destinations

import androidx.compose.material.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import fi.lauriari.chilingo_android.util.Constants.LOGIN_SCREEN

fun NavGraphBuilder.loginComposable(

) {
    composable(
        route = LOGIN_SCREEN
    ) { navBackStackEntry ->
        Text("Hello login screen")
    }
}