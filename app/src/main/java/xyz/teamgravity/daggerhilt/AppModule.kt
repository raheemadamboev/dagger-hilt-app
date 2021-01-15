package xyz.teamgravity.daggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    @Named("name")
    fun provideNameString() = "My name is Raheem"

    @Singleton
    @Provides
    @Named("surname")
    fun provideSurnameString() = "And my surname is Adamboev"

    @Singleton
    @Provides
    @Named("hobby")
    fun provideHobbyString() = "I love racing!"
}