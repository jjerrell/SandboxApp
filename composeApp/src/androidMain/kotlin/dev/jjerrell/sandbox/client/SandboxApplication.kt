package dev.jjerrell.sandbox.client

import android.app.Application
import dev.jjerrell.sandbox.client.storage.createPlatformModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class SandboxApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@SandboxApplication)
            modules(createPlatformModule())
        }
    }
}