package fi.lauriari.chilingo_android.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreenContent(
    usernameTextState: String,
    onUsernameTextChanged: (String) -> Unit,
    passwordTextState: String,
    onPasswordTextChanged: (String) -> Unit,
    registerUsernameTextState: String,
    onRegisterUsernameTextChanged: (String) -> Unit,
    registerPasswordTextState: String,
    onRegisterPasswordTextChanged: (String) -> Unit,
    passwordRetypeTextState: String,
    onPasswordRetypeTextChanged: (String) -> Unit,
) {

    var isLoginInputSelected by rememberSaveable { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .background(color = Color.LightGray)
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        if (isLoginInputSelected) {
            LoginInputs(
                usernameTextState = usernameTextState,
                onUsernameTextChanged = onUsernameTextChanged,
                passwordTextState = passwordTextState,
                onPasswordTextChanged = onPasswordTextChanged,
                selectRegisterInputs = { isLoginInputSelected = false }
            )

        } else {
            RegisterInputs(
                registerUsernameTextState = registerUsernameTextState,
                onRegisterUsernameTextChanged = onRegisterUsernameTextChanged,
                registerPasswordTextState = registerPasswordTextState,
                onRegisterPasswordTextChanged = onRegisterPasswordTextChanged,
                passwordRetypeTextState = passwordRetypeTextState,
                onPasswordRetypeTextChanged = onPasswordRetypeTextChanged,
                selectLoginInputs = { isLoginInputSelected = true }
            )
        }
    }
}

@Composable
fun LoginInputs(
    usernameTextState: String,
    onUsernameTextChanged: (String) -> Unit,
    passwordTextState: String,
    onPasswordTextChanged: (String) -> Unit,
    selectRegisterInputs: () -> Unit,
) {
    LoginTextField(
        placeholderText = "Username",
        textState = usernameTextState,
        onTextChanged = onUsernameTextChanged
    )

    LoginTextField(
        placeholderText = "Password",
        textState = passwordTextState,
        onTextChanged = onPasswordTextChanged
    )
    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = "No account? Register here.",
        color = Color.DarkGray,
        modifier = Modifier
            .clickable {
                selectRegisterInputs()
            },
    )
    OutlinedButton(
        modifier = Modifier
            .padding(16.dp),
        onClick = { /*TODO Handle login*/ }
    ) {
        Text("Login")
    }
}

@Composable
fun RegisterInputs(
    registerUsernameTextState: String,
    onRegisterUsernameTextChanged: (String) -> Unit,
    registerPasswordTextState: String,
    onRegisterPasswordTextChanged: (String) -> Unit,
    passwordRetypeTextState: String,
    onPasswordRetypeTextChanged: (String) -> Unit,
    selectLoginInputs: () -> Unit,
) {
    LoginTextField(
        placeholderText = "Username",
        textState = registerUsernameTextState,
        onTextChanged = onRegisterUsernameTextChanged
    )

    LoginTextField(
        placeholderText = "Password",
        textState = registerPasswordTextState,
        onTextChanged = onRegisterPasswordTextChanged
    )
    LoginTextField(
        placeholderText = "Retype password",
        textState = passwordRetypeTextState,
        onTextChanged = onPasswordRetypeTextChanged
    )
    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = "Already have an account?",
        color = Color.DarkGray,
        modifier = Modifier
            .clickable {
                selectLoginInputs()
            },
    )
    OutlinedButton(
        modifier = Modifier
            .padding(16.dp),
        onClick = {/*TODO Handle register*/ }
    ) {
        Text("Register")
    }
}