@file:JvmName("Lwjgl3Launcher")

package com.nihar.platformer.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.nihar.platformer.PlatformerKT

/** Launches the desktop (LWJGL3) application. */
fun main() {
    Lwjgl3Application(PlatformerKT(), Lwjgl3ApplicationConfiguration().apply {
        setTitle("platformerKt")
        setWindowedMode(640, 480)
        setWindowIcon(*(arrayOf(128, 64, 32, 16).map { "libgdx$it.png" }.toTypedArray()))
    })
}
