package sie.edu.primeraclase.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Preview(showBackground = true)
@Composable
fun ColumnasView() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            .background(Color(0xFF756C6C)),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "hola",
            color = Color(0xFFE91E63),
            fontSize = 30.sp,
            modifier = Modifier
                .padding(6.dp)
                .fillMaxWidth()
                .background(color = Color(0xFF000000))
                )


        Text (text = "adios",
            color = Color(0xFF7106BD),
            fontSize = 30.sp,
            modifier = Modifier
                .padding(6.dp)
                .background(
                    color = Color(0xFFFFFFFF))
        )

                    Text(
                        text = "otravez", color = Color(0xFF7106BD),
                        fontSize = 30.sp,
                        modifier = Modifier
                            .padding(6.dp)
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .background(
                                color = Color(0xFFFFFFFF))
                    )
    }


}


@Preview(showBackground = true)
@Composable
fun ColumnasSeparadas(){
    Column(modifier = Modifier.fillMaxSize()){
        Text(text="1")
        Spacer(modifier= Modifier.height(16.dp))
        Text(text="2")
        Spacer(modifier= Modifier.height(40.dp))
        HorizontalDivider()
        Text(text="3")
    }

}