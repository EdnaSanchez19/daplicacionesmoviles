package sie.edu.primeraclase.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import sie.edu.primeraclase.R
@Preview (showBackground = true)
@Composable
fun CajasView(){

    Box(
        modifier = Modifier
            .background(Color.White)
            .size(128.dp)

    ){
        //9 textos en las 9 posiciones diferentes de la box

        Image(
            painter= painterResource(id= R.drawable.capibara),
            contentDescription = "fondo",
            modifier = Modifier.align(Alignment.Center),
            contentScale = ContentScale.Crop,
            alpha = 0.8f)

        Text(text="5",
            modifier = Modifier.align(Alignment.Center))
        Text(text="3",
            modifier = Modifier.align(Alignment.TopEnd))
        Text(text="1",
            modifier = Modifier.align(Alignment.TopStart))
        Text(text="9",
            modifier = Modifier.align(Alignment.BottomEnd))
        Text(text="6",
            modifier = Modifier.align(Alignment.CenterEnd))
        Text(text="2",
            modifier = Modifier.align(Alignment.TopCenter))
        Text(text="7",
            modifier = Modifier.align(Alignment.BottomStart))
        Text(text="8",
            modifier = Modifier.align(Alignment.BottomCenter))
        Text(text="4",
            modifier = Modifier.align(Alignment.CenterStart))

        Icon(imageVector = Icons.Default.Call,
            contentDescription = "icono",
            tint = Color.Black)
    }
}
