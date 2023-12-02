package com.example.testtask1.model

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("success") val _success: Boolean?,
    @SerializedName("response") val _response: ResponseToken?,
)