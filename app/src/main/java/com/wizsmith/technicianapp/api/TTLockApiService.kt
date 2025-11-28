package com.wizsmith.technicianapp.api

import com.wizsmith.technicianapp.api.models.LockListResponse
import retrofit2.Response
import retrofit2.http.GET

interface TTLockApiService {
    @GET("locks")
    suspend fun getLocks(): Response<LockListResponse>
}
