package domain.usecase

import data.model.Student
import domain.repository.Repository

interface SaveStudentUseCase {
    suspend operator fun invoke(student: Student)
}