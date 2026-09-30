package com.example.listacomida.ui.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listacomida.data.DataSource
import com.example.listacomida.model.Platillo

@Composable
fun MenuCard(platillo: Platillo, modifier: Modifier = Modifier){
    Card(modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = Color(0xFFE8EDF2))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(platillo.drawableResource),
                contentDescription = stringResource(platillo.stringResourceId),
                modifier = Modifier
                    .size(140.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier.padding(start = 16.dp),
                verticalArrangement = Arrangement.Center
            ){
                //Para el título
                Text(
                    text = stringResource(platillo.stringResourceId),
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.DarkGray
                )

                //Para el precio
                Text(
                    text = stringResource(platillo.precioResourceId),
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.DarkGray,
                    modifier = Modifier.padding(vertical = 4.dp)
                )

                //Oferta
                Text(
                    text = stringResource(platillo.ofertaResourceId),
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun MenuCardList(platilloList:List<Platillo>, modifier: Modifier = Modifier){
    LazyColumn(modifier) {
        items(platilloList){
                platillo -> MenuCard(
            platillo = platillo,
            modifier.padding(10.dp)
        )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MenuCardPreview(){
    val datasource = DataSource()
    val platillos = datasource.LoadPlatillos()

    MenuCard(platillos.get(1))
}


