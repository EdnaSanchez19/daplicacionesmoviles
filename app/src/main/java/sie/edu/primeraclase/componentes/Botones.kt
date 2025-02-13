package sie.edu.primeraclase.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import sie.edu.primeraclase.R

@Preview
@Composable

fun BotonesView(){

    //var texto: String = "centro"

    //el mutable se importa varias veces

    var texto by remember{
        mutableStateOf("Que hay?")
    }
    var cambio by remember{
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize() //es para que se vea como pantalla de celular
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .background(color = Color(0xFF000000)),
        ) {
            HorizontalDivider()
            Text(
                text = texto, color = Color(0xFF000000),
                modifier = Modifier
                    .background(color = Color(0xFFFFFFFF))
            )
            HorizontalDivider()
            Button(onClick={
                if(!cambio){
                texto = "hola a todos"
                }
                else{
                    texto = "Hola que hay"
                }
                cambio =!cambio
            },
                modifier =Modifier.fillMaxWidth().padding(horizontal =16.dp ),
                colors = ButtonDefaults.buttonColors(
                    containerColor =Color.Red,
                    contentColor = Color.White

                )) {

                Text(text ="cambiar texto")

            }
        }

        Image(
            painter = painterResource(id = R.drawable.capibara),
            contentDescription = "fondo",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .size(100.dp)
        )

        Icon(imageVector = Icons.Default.Call,
            contentDescription = "icono",
            tint = Color.Black,
            modifier = Modifier.align(Alignment.CenterEnd))

        Text(text="Edna", color = Color(0xFFFFFFFF),
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.BottomCenter)
                .background(Color.White)
                .fillMaxWidth())
    }

}

