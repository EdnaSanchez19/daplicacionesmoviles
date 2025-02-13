package sie.edu.primeraclase.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable

fun CajaDeTextoView(){
    //recordar importar 4 librerias en remember
    var firstnumber by remember {
        mutableStateOf("")
    }
    Column() {
        Text(text="Dame un numero")
        TextField(value =firstnumber,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text(text = "aqui solo numeros") },
            onValueChange = {
            TextoIngresado ->
            firstnumber = TextoIngresado
        })
}}