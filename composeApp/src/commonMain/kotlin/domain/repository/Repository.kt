package domain.repository

import data.model.Student
import kotlinx.coroutines.flow.Flow

interface Repository {
    suspend fun saveStudent(student: Student)
    suspend fun deleteStudent(student: Student)
    fun getStudentList(): Flow<List<Student>>
}