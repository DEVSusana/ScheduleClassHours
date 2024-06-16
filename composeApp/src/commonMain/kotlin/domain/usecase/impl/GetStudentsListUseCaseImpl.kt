package domain.usecase.impl

import data.model.Student
import domain.repository.Repository
import domain.usecase.GetStudentsUseCase
import kotlinx.coroutines.flow.Flow

class GetStudentsUseCaseImpl(private val repository: Repository) : GetStudentsUseCase {
    override suspend fun invoke(): Flow<List<Student>> = repository.getStudentList()
}