package com.wizsmith.technicianapp.api

import com.wizsmith.technicianapp.api.models.LockListResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TTLockRepository {

    private val api: TTLockApiService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.ttlock.com/v3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(TTLockApiService::class.java)
    }

    suspend fun getLocks(): LockListResponse? {
        val response = api.getLocks()
        return if (response.isSuccessful) response.body() else null
    }
}
