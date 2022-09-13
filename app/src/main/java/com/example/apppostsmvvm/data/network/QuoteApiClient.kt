package com.example.apppostsmvvm.data.network

import android.database.Observable
import com.example.apppostsmvvm.data.model.QuoteModel
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.*

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>

    @GET("posts")
    fun getTodoList(
    ): Observable<List<QuoteModel>>

    @PUT("posts/{id}")
    fun updateTodo(
        @Body body: RequestBody, @Path("id")id:Int):Observable<QuoteModel>

    @POST("posts/")
    fun createTodo(
        @Body body: RequestBody
    ):Observable<QuoteModel>

    @DELETE("posts/{id}")
    fun deleteTodo(@Path("id")id:Int):Observable<QuoteModel>
}