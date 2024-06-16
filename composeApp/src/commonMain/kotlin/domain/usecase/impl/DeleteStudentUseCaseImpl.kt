package domain.usecase.impl

import data.model.Student
import domain.repository.Repository
import domain.usecase.DeleteStudentUseCase

class DeleteStudentUseCaseImpl(private val repository: Repository) : DeleteStudentUseCase {
    override suspend fun invoke(student: Student) = repository.deleteStudent(student)

}