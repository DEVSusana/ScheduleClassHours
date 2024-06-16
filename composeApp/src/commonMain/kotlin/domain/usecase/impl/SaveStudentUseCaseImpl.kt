package domain.usecase.impl

import data.model.Student
import domain.repository.Repository
import domain.usecase.SaveStudentUseCase

class SaveStudentUseCaseImpl(private val repository: Repository) : SaveStudentUseCase {
    override suspend fun invoke(student: Student) = repository.saveStudent(student)
}