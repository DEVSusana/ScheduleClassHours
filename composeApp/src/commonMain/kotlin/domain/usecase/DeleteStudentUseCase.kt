package domain.usecase

import data.model.Student
import domain.repository.Repository

interface DeleteStudentUseCase {
    suspend operator fun invoke(student: Student)
}