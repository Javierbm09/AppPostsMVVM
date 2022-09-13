package com.example.apppostsmvvm.data

import com.example.apppostsmvvm.data.model.QuoteModel
import com.example.apppostsmvvm.data.model.QuoteProvider
import com.example.apppostsmvvm.data.network.QuoteService
import javax.inject.Inject


class QuoteRepository @Inject constructor(private val api: QuoteService, private val quoteProvider: QuoteProvider) {

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}