package fi.lauriari.chilingo_android.screens.login


import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import fi.lauriari.chilingo_android.viewmodels.LoginViewModel

@Composable
fun LoginScreen(
    loginViewModel: LoginViewModel
) {

    val usernameTextState: String by loginViewModel.usernameTextState
    val passwordTextState: String by loginViewModel.passwordTextState

    Scaffold(
        content = {
            LoginScreenContent(
                usernameTextState = usernameTextState,
                onUsernameTextChanged = { newUsernameText ->
                    loginViewModel.usernameTextState.value = newUsernameText
                },
                passwordTextState = passwordTextState,
                onPasswordTextChanged = { newPasswordText ->
                    loginViewModel.passwordTextState.value = newPasswordText
                }
            )
        }
    )
}