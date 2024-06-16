package presentation.viewmodel

import androidx.lifecycle.ViewModel
import domain.usecase.DeleteStudentUseCase
import domain.usecase.GetStudentsUseCase
import domain.usecase.SaveStudentUseCase

class StudentViewModel(
    private val getStudentsUseCase: GetStudentsUseCase,
    private val saveStudentUseCase: SaveStudentUseCase,
    private val deleteStudentUseCase: DeleteStudentUseCase
) : ViewModel() {

}