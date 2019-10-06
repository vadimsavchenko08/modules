package com.tagakov.common

import com.tagakov.common.A
import com.tagakov.common.ComponentDependencies

interface AProvider : ComponentDependencies {
    fun provideA(): A
}