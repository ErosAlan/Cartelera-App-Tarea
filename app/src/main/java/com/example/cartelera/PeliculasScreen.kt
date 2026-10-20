package com.example.cartelera

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cartelera.ui.theme.CarteleraTheme

@Composable
fun PeliculasScreen(
    correo: String,
    onPeliculaClick: (Int) -> Unit,
    onCerrarSesion: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Películas",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp)
        )
        if (correo.isNotEmpty()) {
            Text(
                text = correo,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(peliculas) { pelicula ->
                PeliculaItem(
                    pelicula = pelicula,
                    onClick = { onPeliculaClick(pelicula.id) }
                )
            }
        }
        TextButton(
            onClick = onCerrarSesion,
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Cerrar sesión")
        }
    }
}

@Composable
fun PeliculaItem(pelicula: Pelicula, onClick: () -> Unit) {
    Card(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(pelicula.imagen),
                contentDescription = "Póster de ${pelicula.titulo}",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(width = 80.dp, height = 120.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Column {
                Text(
                    text = pelicula.titulo,
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = "${pelicula.anio} - ${pelicula.genero}",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PeliculasScreenPreview() {
    CarteleraTheme {
        PeliculasScreen(
            correo = "usuario@ejemplo.com",
            onPeliculaClick = {},
            onCerrarSesion = {}
        )
    }
}
