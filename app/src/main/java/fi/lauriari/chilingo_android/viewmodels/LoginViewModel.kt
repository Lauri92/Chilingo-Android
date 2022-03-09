package fi.lauriari.chilingo_android.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

//@HiltViewModel
class LoginViewModel : ViewModel() {

    val usernameTextState: MutableState<String> = mutableStateOf("")
    val passwordTextState: MutableState<String> = mutableStateOf("")

}