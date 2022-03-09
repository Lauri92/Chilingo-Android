package fi.lauriari.chilingo_android.screens.login

import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun LoginTextField(
    placeholderText: String,
    textState: String,
    onTextChanged: (String) -> Unit
) {
    OutlinedTextField(
        modifier = Modifier
            .padding(16.dp),
        maxLines = 1,
        label = {
            Text(
                text = placeholderText
            )
        },
        value = textState,
        onValueChange = onTextChanged,
        placeholder = {
            Text(
                text = placeholderText
            )
        }
    )
}