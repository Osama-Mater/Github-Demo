package com.mattar.mobile_ui.injection.module

import com.mattar.domain.executor.PostExecutionThread
import com.mattar.mobile_ui.UiThread
import com.mattar.mobile_ui.bookmarked.BookmarkedActivity
import com.mattar.mobile_ui.browse.BrowseActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class UiModule {

    @Binds
    abstract fun bindPostExecutionThread(uiThread: UiThread): PostExecutionThread

    @ContributesAndroidInjector
    abstract fun contributesBrowseActivity(): BrowseActivity

    @ContributesAndroidInjector
    abstract fun contributesBookmarkedActivity(): BookmarkedActivity
}
