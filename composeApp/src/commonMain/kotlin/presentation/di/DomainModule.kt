package presentation.di

import domain.usecase.impl.DeleteStudentUseCaseImpl
import domain.usecase.impl.GetStudentsUseCaseImpl
import domain.usecase.impl.SaveStudentUseCaseImpl
import org.koin.dsl.module

val domainModule = module {
    factory { GetStudentsUseCaseImpl(get()) }
    factory { SaveStudentUseCaseImpl(get()) }
    factory { DeleteStudentUseCaseImpl(get()) }
}