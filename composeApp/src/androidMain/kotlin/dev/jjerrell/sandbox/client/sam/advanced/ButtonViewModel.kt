package dev.jjerrell.sandbox.client.sam.advanced

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

class ButtonViewModel : ViewModel() {
    var data: String by mutableStateOf("")
        private set

    fun onSetData() {
        data = "Primary button clicked!"
    }
}

@Composable
fun ButtonView() {
    val viewModel: ButtonViewModel = viewModel()
    Button(
        onClick = { viewModel.onSetData() }
    ) {
        Text("Primary button")
    }
}