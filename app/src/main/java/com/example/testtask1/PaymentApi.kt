package com.example.testtask1

import com.example.testtask1.model.PaymentsResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface PaymentApi {
    @Headers(
        "app-key: 12345",
        "v: 1"
    )
    @GET("payments")
    suspend fun getListPayments(@Header("token") token: String): PaymentsResponse
}