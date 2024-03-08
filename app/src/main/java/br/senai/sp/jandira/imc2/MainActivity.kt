package br.senai.sp.jandira.imc2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc2.ui.theme.Imc2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Imc2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column (horizontalAlignment = Alignment.CenterHorizontally) {

        Card(

            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth(),
            shape = RectangleShape,
            colors = CardDefaults.cardColors(containerColor = Color(0xFFF9536B))

        ) {

            Image(

                painter = painterResource(id = R.drawable.bmi), contentDescription = "bmi",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(top = 15.dp),

                contentScale = ContentScale.Fit

            )
            Text(
                text = "Calculadora IMC",
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )

        }

        Column(



        ) {


            Card(

                modifier = Modifier
                    .size(width = 300.dp, height = 420.dp)

                    .offset(
                        x = 0.dp,
                        y = (-30.dp)
                    ),
                colors = CardDefaults
                    .cardColors(containerColor = Color(0xFFE1E7E9))
            ) {

                Column (

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                ){
                    Text(
                        text = "Seus dados",
                        textAlign = TextAlign.Center,

                        fontWeight = FontWeight.Bold,
                        fontSize = 32.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 40.dp),
                        color= Color(0xFFF9536B)

                    )

                    Text(
                        text = "Seu Peso:",
                        color = Color(0xFFF9536B),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 10.dp)

                    )


                    OutlinedTextField(
                        value = "Digite seu nome",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = {
                            Text(text = "Digite o seu nome")
                        },
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedContainerColor = Color(0xFFFFFFFFF),
                                unfocusedBorderColor = Color(0xFFF9536B),
                                unfocusedTextColor = Color(0xFF69626D)
                            )
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    Text(
                        text = "Sua Altura:",
                        color = Color(0xFFF9536B),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 10.dp))

                    OutlinedTextField(
                        value = "Digite seu nome",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = {
                            Text(text = "Digite o seu nome")
                        },
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedContainerColor = Color(0xFFFFFFFFF),
                                unfocusedBorderColor = Color(0xFFF9536B),
                                unfocusedTextColor = Color(0xFF69626D)
                            )
                    )

                    Spacer(modifier = Modifier.height(32.dp))

                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults
                            .buttonColors(Color(0xFFF9536B)),
                        modifier = Modifier
                            .width(350.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(8.dp)


                    ) {
                        Column {
                            Text(text = "CALCULAR")
                        }
                    }
                }

            }


            Card(
                modifier = Modifier
                    .size(width = 300.dp, height = 100.dp)
                ,
                colors = CardDefaults.cardColors(containerColor = Color(0xFF3B722F))
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 30.dp, top = 25.dp)
                ) {
                    Text(


                        text = "Resultado:",
                        color = Color.White

                    )
                    Text(

                        text = "Peso ideal",
                        color = Color.White,

                        )
                    Text(

                        text = "23.3",
                        fontSize = 28.sp,
                        color = Color.White,
                        textAlign = TextAlign.End,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 60.dp)
                            .offset(x = 0.dp, y = (-40.dp))

                    )
                }
            }



        }


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Imc2Theme {
        Greeting()
    }
}