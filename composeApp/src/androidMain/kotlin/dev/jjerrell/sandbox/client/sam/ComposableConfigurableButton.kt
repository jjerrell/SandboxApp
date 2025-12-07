package dev.jjerrell.sandbox.client.sam

import android.widget.Toast
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun ConfigurableButton(
    modifier: Modifier = Modifier,
    data: String,
    action: (data: String) -> Unit
) {
    Button(
        modifier = modifier,
        onClick = { action(data) }
    ) {
        Text("Click me!")
    }
}

@Composable
fun ConfigurableButtonToo(
    modifier: Modifier = Modifier,
    action: () -> Unit
) {
    Button(
        modifier = modifier,
        onClick = { action() }
    ) {
        Text("Click me!")
    }
}

@Composable
fun ButtonView() {
    val context = LocalContext.current
    ConfigurableButton(
        data = "Foo"
    ) { data ->
        Toast.makeText(context, "Data: " + data, Toast.LENGTH_SHORT).show()
    }
}