package com.tagakov.startscreen.di

import com.tagakov.startscreen.ComponentB
import com.tagakov.startscreen.StartScreenFragment
import com.tagakov.startscreen.api.StartScreenDependencies
import com.tagakov.timelogic.TimelogicComponent
import dagger.Component


@Component(dependencies = [StartScreenDependencies::class, TimelogicComponent::class, ComponentB::class])
internal interface StartScreenComponent {
    fun inject(startScreenFragment: StartScreenFragment)
}