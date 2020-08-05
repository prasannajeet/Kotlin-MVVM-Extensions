package com.prasan.kmx.contract

import com.prasan.kmx.ViewState
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

/**
 * A UseCase defines a specific task performed in the app. For this project there would be two:
 * 1. Get Popular Photos
 * 2. Get details of a photo
 * [Output] type defines the output of the use-case execution
 * @author Prasan
 */
interface IUseCase<Repository : IRepository, in Input : Any, out Output : Any> {

    val repository: Repository

    /**
     * Execution contract which will run the business logic associated with completing a
     * particular use case
     * @param input [Input] type input parameter
     * @since 1.0
     * @return [Output] model type used to define the UseCase class as a [Flow] of [ViewState]
     */
    @ExperimentalCoroutinesApi
    suspend fun execute(input: Input): Flow<ViewState<Output>>
}