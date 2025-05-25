package com.example.roomatchapp.utils

sealed class Resource<out T> {
    data class Success<out T>(val data: T) : Resource<T>()
    data class Error(val message: String? = null) : Resource<Nothing>()
    object Loading : Resource<Nothing>()
}