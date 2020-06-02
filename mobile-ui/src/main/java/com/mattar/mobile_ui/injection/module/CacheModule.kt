package com.mattar.mobile_ui.injection.module

import android.app.Application
import com.mattar.cache.ProjectsCacheImpl
import com.mattar.cache.db.ProjectsDatabase
import com.mattar.data.repository.ProjectsCache
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class CacheModule {

    @Module
    companion object {
        @Provides
        @JvmStatic
        fun providesDataBase(application: Application): ProjectsDatabase {
            return ProjectsDatabase.getInstance(application)
        }
    }

    @Binds
    abstract fun bindProjectsCache(projectsCache: ProjectsCacheImpl): ProjectsCache
}
