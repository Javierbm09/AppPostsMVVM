package com.example.apppostsmvvm.domain

import com.example.apppostsmvvm.data.QuoteRepository
import com.example.apppostsmvvm.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository: QuoteRepository) {

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}