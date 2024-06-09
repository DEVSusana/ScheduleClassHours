package data.repository.dataSourceImpl

import data.database.StudentsDAO
import data.model.Student
import data.repository.dataSource.LocalDataSource
import kotlinx.coroutines.flow.Flow

class LocalDataSourceImpl(private val studentsDAO: StudentsDAO): LocalDataSource {
    override suspend fun saveStudentToDB(student: Student) {
        studentsDAO.insert(student)
    }

    override fun getSavedStudents(): Flow<List<Student>> {
        return studentsDAO.getAllStudents()
    }

    override suspend fun deleteStudentFromDB(student: Student) {
        studentsDAO.DeleteStudent(student)
    }

}