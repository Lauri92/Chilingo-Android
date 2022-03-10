package fi.lauriari.chilingo_android.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlin.properties.ReadOnlyProperty

//@HiltViewModel
class LoginViewModel : ViewModel() {

    val usernameTextState: MutableState<String> = mutableStateOf("")
    val passwordTextState: MutableState<String> = mutableStateOf("")
    val registerUsernameTextState: MutableState<String> = mutableStateOf("")
    val registerPasswordTextState: MutableState<String> = mutableStateOf("")
    val passwordRetypeTextState: MutableState<String> = mutableStateOf("")

}