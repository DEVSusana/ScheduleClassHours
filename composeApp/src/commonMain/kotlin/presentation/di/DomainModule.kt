package presentation.di

import domain.usecase.DeleteStudentUseCase
import domain.usecase.GetStudentsUseCase
import domain.usecase.SaveStudentUseCase
import domain.usecase.impl.DeleteStudentUseCaseImpl
import domain.usecase.impl.GetStudentsUseCaseImpl
import domain.usecase.impl.SaveStudentUseCaseImpl
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val domainModule = module {
    factory { DeleteStudentUseCaseImpl(get()) }
    factoryOf(::GetStudentsUseCaseImpl) { bind<GetStudentsUseCase>() }
    factoryOf(::SaveStudentUseCaseImpl) { bind<SaveStudentUseCase>() }
    factoryOf(::DeleteStudentUseCaseImpl) { bind<DeleteStudentUseCase>() }
}