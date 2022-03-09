package fi.lauriari.chilingo_android.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreenContent(
    usernameTextState: String,
    onUsernameTextChanged: (String) -> Unit,
    passwordTextState: String,
    onPasswordTextChanged: (String) -> Unit
) {

    Column(
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
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
        Text(
            text = "Third item",
            modifier = Modifier.padding(16.dp)
        )
    }

}