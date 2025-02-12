package com.example.authentication.viewmodel;

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.authentication.data.AuthRepository
import kotlinx.coroutines.launch

class AuthViewModel(private val repository: AuthRepository) : ViewModel() {

    var loginResult: ((Boolean) -> Unit)? = null
    var registerResult: ((Boolean) -> Unit)? = null

    fun register(
        email: String,
        password: String,
        name: String,
        onResult: (Boolean) -> Unit
    ) {
        viewModelScope.launch {
            val success = repository.registerUser(email, password, name)
            onResult(success)
        }
    }

    fun login(
        email: String,
        password: String,
        onResult: (Boolean) -> Unit
    ) {
        viewModelScope.launch {
            val success = repository.loginUser(email, password)
            onResult(success)
        }
    }

    fun resetPassword(
        email: String,
        onResult: (Boolean) -> Unit
    ) {
        viewModelScope.launch {
            val success = repository.resetPassword(email)
            onResult(success)
        }
    }

    fun getUserName(
        onResult: (String?) -> Unit
    ) {
        viewModelScope.launch {
            val name = repository.getUsername()
            onResult(name)
        }
    }

    fun loginWithGoogle(
        idToken: String,
        onResult: (Boolean) -> Unit
    ) {
        viewModelScope.launch {
            val success = repository.loginWithGoogle(idToken)
            onResult(success)
        }
    }

    fun getGoogleSignInClient(
        context: Context
    ) {
        viewModelScope.launch {
            val success = repository.getGoogleSignInClient(context)
        }
    }

    fun logout() {
        repository.logout()
    }
}

