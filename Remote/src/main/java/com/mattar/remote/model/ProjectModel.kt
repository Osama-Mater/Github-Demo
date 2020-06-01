package com.mattar.remote.model

import kotlinx.serialization.Serializable

@Serializable
class ProjectModel(
    val id: String, val name: String,
    val full_name: String,
    val stargazers_count: Int,
    val created_at: String,
    val owner: OwnerModel
)
