package com.nihar.platformer.android

import android.os.Bundle

import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import com.nihar.platformer.PlatformerKT

/** Launches the Android application. */
class AndroidLauncher : AndroidApplication() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialize(PlatformerKT(), AndroidApplicationConfiguration().apply {
            // Configure your application here.
        })
    }
}
