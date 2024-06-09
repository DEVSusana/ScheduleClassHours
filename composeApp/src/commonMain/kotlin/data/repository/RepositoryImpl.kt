package data.repository

import data.model.Student
import data.repository.dataSource.LocalDataSource
import domain.repository.Repository
import kotlinx.coroutines.flow.Flow

class RepositoryImpl(private val localDataSource: LocalDataSource): Repository {
    override suspend fun saveStudent(student: Student) {
        localDataSource.saveStudentToDB(student)
    }

    override suspend fun deleteStudent(student: Student) {
        localDataSource.deleteStudentFromDB(student)
    }

    override fun getStudentList(): Flow<List<Student>> {
        return localDataSource.getSavedStudents()
    }
}