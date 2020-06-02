package com.mattar.mobile_ui.injection.module

import com.mattar.data.repository.ProjectsRemote
import com.mattar.mobile_ui.BuildConfig
import com.mattar.remote.ProjectsRemoteImpl
import com.mattar.remote.service.GithubService
import com.mattar.remote.service.GithubServiceFactory
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class RemoteModule {

    @Module
    companion object {
        @Provides
        @JvmStatic
        fun provideGithubService(): GithubService {
            return GithubServiceFactory().makeGithubService(BuildConfig.DEBUG)
        }
    }

    @Binds
    abstract fun bindProjectsRemote(projectsRemote: ProjectsRemoteImpl): ProjectsRemote
}
