package presentation.di

import org.koin.compose.viewmodel.dsl.viewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import presentation.viewmodel.StudentViewModel

val viewModelModule = module {
    viewModelOf(::StudentViewModel)
}