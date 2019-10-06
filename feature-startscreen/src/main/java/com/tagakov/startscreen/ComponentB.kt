package com.tagakov.startscreen

import com.tagakov.common.A
import com.tagakov.common.AProvider
import com.tagakov.timelogic.TimeMachine
import com.tagakov.timelogic.TimelogicComponent
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [ModuleB::class], dependencies = [AProvider::class])
interface ComponentB {

    fun b(): B


    @Component.Builder
    interface Builder {
        fun aProvider(aProvider: AProvider): Builder
        fun build(): ComponentB
    }
}

