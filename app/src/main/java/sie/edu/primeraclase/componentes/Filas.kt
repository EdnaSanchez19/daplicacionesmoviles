package sie.edu.primeraclase.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable

fun FilasView(){

    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically


    ){
        Text(text ="primero")
        //Spacer(modifier= Modifier.height(16.dp))

        Column(){
            Text(text ="Segundo")
            Spacer(modifier= Modifier.height(16.dp))
            Text(text ="Tercero")
            Spacer(modifier= Modifier.height(16.dp))
            Text(text ="Cuarto")



        }
    }

}

