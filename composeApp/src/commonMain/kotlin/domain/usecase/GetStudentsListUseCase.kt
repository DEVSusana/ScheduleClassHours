package domain.usecase

import data.model.Student
import domain.repository.Repository
import kotlinx.coroutines.flow.Flow

interface GetStudentsUseCase {
    suspend operator fun invoke(): Flow<List<Student>>
}