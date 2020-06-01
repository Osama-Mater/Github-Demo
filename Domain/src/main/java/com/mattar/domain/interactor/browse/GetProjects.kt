package com.mattar.domain.interactor.browse

import com.mattar.domain.executor.PostExecutionThread
import com.mattar.domain.interactor.ObservableUseCase
import com.mattar.domain.model.Project
import com.mattar.domain.repository.ProjectsRepository
import io.reactivex.rxjava3.core.Observable
import javax.inject.Inject

class GetProjects @Inject constructor(
    private val projectsRepository: ProjectsRepository,
    postExecutionThread: PostExecutionThread
) : ObservableUseCase<List<Project>, Nothing>(postExecutionThread) {

    public override fun buildUseCaseObservable(params: Nothing?): Observable<List<Project>> {
        return projectsRepository.getProjects()
    }

}
