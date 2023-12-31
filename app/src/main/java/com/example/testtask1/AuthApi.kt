package com.example.testtask1

import com.example.testtask1.model.LoginResponse
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface AuthApi {
    @POST("login")
    suspend fun logInUser(@Body requestBody: RequestBody): LoginResponse?
}