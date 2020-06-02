package com.mattar.domain.interactor.bookmark

import com.mattar.domain.executor.PostExecutionThread
import com.mattar.domain.interactor.ObservableUseCase
import com.mattar.domain.model.Project
import com.mattar.domain.repository.ProjectsRepository
import io.reactivex.Observable
import javax.inject.Inject

class GetBookmarkedProjects @Inject constructor(
    private val projectsRepository: ProjectsRepository,
    postExecutionThread: PostExecutionThread
) : ObservableUseCase<List<Project>, Nothing>(postExecutionThread) {

    public override fun buildUseCaseObservable(params: Nothing?): Observable<List<Project>> {
        return projectsRepository.getBookmarkedProjects()
    }

}
