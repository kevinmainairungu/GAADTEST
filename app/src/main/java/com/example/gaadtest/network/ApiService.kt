package com.example.gaadtest.network

import com.example.gaadtest.MODEL.Hours
import com.example.gaadtest.MODEL.Skills
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface ApiService {

    @GET("api/hours")
    fun getHoursAsync(): Deferred<List<Hours>>

    @GET("api/skilliq")
    fun getSkillsAsync(): Deferred<List<Skills>>
}