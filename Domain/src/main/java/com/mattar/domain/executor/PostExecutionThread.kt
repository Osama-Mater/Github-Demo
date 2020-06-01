package com.mattar.domain.executor

import io.reactivex.rxjava3.core.Scheduler

interface PostExecutionThread {
    val scheduler: Scheduler
}