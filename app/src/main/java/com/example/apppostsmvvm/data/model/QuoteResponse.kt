package com.example.apppostsmvvm.data.model

import com.example.apppostsmvvm.data.model.QuoteModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuoteResponse @Inject constructor() {
        var quotes:List<QuoteModel> = emptyList()
}