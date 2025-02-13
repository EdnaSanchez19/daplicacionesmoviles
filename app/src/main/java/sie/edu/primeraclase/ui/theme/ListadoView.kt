package sie.edu.primeraclase.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import sie.edu.primeraclase.compartido.TarjetaView
import sie.edu.primeraclase.compartido.TerminalView

@Preview(showBackground = true)
@Composable

fun ListadoView(){

    Column(modifier = Modifier
        .fillMaxSize()){
        TerminalView()
        TerminalView()
        TerminalView()

        TarjetaView()
        TarjetaView(text="HSBC")
        TarjetaView(colorText = Color.Black)
        TarjetaView(colorText = Color.Blue)
        TarjetaView(colorText = Color.Magenta)

    }

}