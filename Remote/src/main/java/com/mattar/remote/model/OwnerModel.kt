package com.mattar.remote.model

import kotlinx.serialization.Serializable

@Serializable
class OwnerModel(
    val login: String,
    val avatar_url: String
)
