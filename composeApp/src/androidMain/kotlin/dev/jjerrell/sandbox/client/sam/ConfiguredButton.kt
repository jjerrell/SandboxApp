package dev.jjerrell.sandbox.client.sam

import android.content.Context
import android.view.View
import android.widget.Toast

class ConfiguredButton(context: Context) {
    val button = ConfigurableButton(context)

    init {
        button.configure("user_123", { view, data ->
            Toast.makeText(context, "Data: " + data, Toast.LENGTH_SHORT).show()
        })
    }
}