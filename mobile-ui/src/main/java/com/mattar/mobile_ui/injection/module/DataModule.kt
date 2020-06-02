package com.mattar.mobile_ui.injection.module

import com.mattar.data.ProjectsDataRepository
import com.mattar.domain.repository.ProjectsRepository
import dagger.Binds
import dagger.Module

@Module
abstract class DataModule {

    @Binds
    abstract fun bindDataRepository(dataRepository: ProjectsDataRepository): ProjectsRepository
}
