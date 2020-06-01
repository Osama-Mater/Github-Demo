package com.mattar.domain.repository

import com.mattar.domain.model.Project
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable

interface ProjectsRepository {
    fun getProjects(): Observable<List<Project>>

    fun bookmarkProject(projectId: String): Completable

    fun unbookmarkProject(projectId: String): Completable

    fun getBookmarkedProjects(): Observable<List<Project>>
}