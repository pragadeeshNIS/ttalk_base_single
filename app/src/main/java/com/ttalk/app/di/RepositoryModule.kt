package com.ttalk.app.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

// TODO: Bind repository interfaces to implementations for each feature
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule
