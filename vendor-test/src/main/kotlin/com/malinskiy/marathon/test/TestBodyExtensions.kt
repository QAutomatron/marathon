package com.malinskiy.marathon.test

import com.malinskiy.marathon.Marathon
import org.jetbrains.spek.api.dsl.TestBody

fun TestBody.setupMarathon(f: MarathonFactory.() -> Unit): Marathon {
    val marathonFactory = MarathonFactory()
    return marathonFactory.apply(f).build()
}