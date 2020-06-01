package com.mattar.remote.model

import kotlinx.serialization.Serializable

@Serializable
class ProjectsResponseModel(val items: List<ProjectModel>)