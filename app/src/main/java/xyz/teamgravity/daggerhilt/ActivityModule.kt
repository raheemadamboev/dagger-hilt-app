package xyz.teamgravity.daggerhilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object ActivityModule {

    @ActivityScoped
    @Provides
    @Named("car")
    fun provideCarString(
        @ApplicationContext context: Context,
        @Named("hobby") hobby: String
    ) = "$hobby. ${context.getString(R.string.car)}"
}