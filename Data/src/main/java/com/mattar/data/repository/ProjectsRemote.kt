package com.mattar.data.repository

import com.mattar.data.model.ProjectEntity
import io.reactivex.rxjava3.core.Observable

interface ProjectsRemote {

    fun getProjects(): Observable<List<ProjectEntity>>

}
