package com.mattar.remote

import com.mattar.data.model.ProjectEntity
import com.mattar.data.repository.ProjectsRemote
import com.mattar.remote.mapper.ProjectsResponseModelMapper
import com.mattar.remote.service.GithubService
import io.reactivex.rxjava3.core.Observable
import javax.inject.Inject

open class ProjectsRemoteImpl @Inject constructor(
    private val service: GithubService,
    private val mapper: ProjectsResponseModelMapper
) : ProjectsRemote {

    override fun getProjects(): Observable<List<ProjectEntity>> {
        return service.searchRepositories("language:kotlin", "stars", "desc")
            .map {
                it.items.map { mapper.mapFromModel(it) }
            }
    }
}
