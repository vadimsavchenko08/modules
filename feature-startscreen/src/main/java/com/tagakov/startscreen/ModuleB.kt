package com.tagakov.startscreen

import com.tagakov.common.A
import dagger.Module
import dagger.Provides

@Module
class ModuleB {

    @Provides
    fun provideB(a: A): B = B(a)
}