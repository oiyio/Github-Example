package com.smarttoolfactory.githubexample.di.component


import android.app.Application
import com.smarttoolfactory.githubexample.MyApplication
import com.smarttoolfactory.githubexample.di.module.ActivityContributorModule
import com.smarttoolfactory.githubexample.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * [ActivityContributorModule] defines which Activities will have which modules and inject objects
 * If an Activity has any fragments it should add them via FragmentContributorModule with @ContributesAndroidInjector
 * @ContributesAndroidInjector(modules = {MainActivity.class, FragmentContributorModule.class})
 */
@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityContributorModule::class
    ]
)
interface AppComponent : AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    override fun inject(app: MyApplication)
}
