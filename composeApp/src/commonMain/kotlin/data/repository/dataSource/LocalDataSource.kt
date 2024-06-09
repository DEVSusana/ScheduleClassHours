package data.repository.dataSource

import data.model.Student
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {
    suspend fun saveStudentToDB(student: Student)
    fun getSavedStudents(): Flow<List<Student>>
    suspend fun deleteStudentFromDB(student: Student)
}