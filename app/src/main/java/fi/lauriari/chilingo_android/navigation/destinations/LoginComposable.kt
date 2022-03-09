package fi.lauriari.chilingo_android.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import fi.lauriari.chilingo_android.screens.login.LoginScreen
import fi.lauriari.chilingo_android.util.Constants.LOGIN_SCREEN
import fi.lauriari.chilingo_android.viewmodels.LoginViewModel

fun NavGraphBuilder.loginComposable(
    loginViewModel: LoginViewModel
) {
    composable(
        route = LOGIN_SCREEN
    ) { navBackStackEntry ->
        LoginScreen(
            loginViewModel = loginViewModel
        )
    }
}