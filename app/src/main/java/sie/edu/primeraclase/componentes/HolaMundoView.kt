package sie.edu.primeraclase.componentes

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp


data class MiObjeto(
    val esGrande: Boolean,
    val saludo: String,
    val ColorText: Color,
    val fontSize: TextUnit,
    val Limite: Int,
)
/////////////////////////////

@Preview(showBackground=true)
@Composable   ////


fun HolaMundoView(){

    /*

     */

    val miObjeto: MiObjeto = MiObjeto( esGrande = false, saludo = "Adios", Color(0xFFFFFFFF),32.sp,Limite=2)
/*
        val esGrande:Boolean = false
        val saludo:String = "De México para el mundo, los Angeles Azules"
        val si: Color= Color(0xFF797BFF)
        val fs: TextUnit= 30.sp
        val lim: Int = 3

    Text(text= saludo,
        color = miObjeto.si,
        fontSize = fs,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Bold,
        fontFamily =  FontFamily.SansSerif,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        ///nuevo (de hoy 20 de enero 2025
        modifier = Modifier
            .background(color= Color(0xFFACEC69))
            .padding(16.dp)
            .background(color = Color(0xB0FFFFFF))
            .padding(horizontal = 8.dp)
            .background(color = Color.White)
            .padding(top = 6.dp)
            .background(color=Color(0xB2FFFFFF))
            .border(width= 4.dp, color = Color(0xFFACEC69))
            .padding(16.dp)
            //.fillMaxWidth() ocupa tod_o el ancho
            //.fillMaxHeight() ocupa tod_o el alto
            .fillMaxSize() //ocupa tod_o el ancho y alto
            .blur(3.dp) //difuminado a una imagen o componente
            //.width(60.dp)
            //Modifier.background (color =Color.green,shape= roundedcornershape(25.dp)
            )
    */
}






