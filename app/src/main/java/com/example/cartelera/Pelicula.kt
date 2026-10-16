package com.example.cartelera
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.lazy.items

data class Pelicula(
    val id: Int,
    val titulo: String,
    val anio: Int,
    val duracionMin: Int,
    val genero: String,
    val director: String,
    val sinopsis: String,
    val imagen: Int
)

val peliculas = listOf(
    Pelicula(
        id = 1,
        titulo = "Akira",
        anio = 1988,
        duracionMin = 124,
        genero = "Animación",
        director = "Katsuhiro Otomo",
        sinopsis = " La historia ocurre en una ciudad futurista construida sobre las ruinas del antiguo Tokio, destruido 31 años antes por una misteriosa explosión que desencadenó la Tercera Guerra Mundial.",
        imagen = R.drawable.akira
    ),
    Pelicula(
        id = 2,
        titulo = "Megamind",
        anio = 2010,
        duracionMin = 95,
        genero = "Animación",
        director = "Tom McGrath",
        sinopsis = "De bebés, dos alienígenas son enviados a la Tierra en cápsulas espaciales desde sus planetas en destrucción.",
        imagen = R.drawable.megamind
    ),
    Pelicula(
        id = 3,
        titulo = "Weathering With You",
        anio = 2019,
        duracionMin = 112,
        genero = "Animación",
        director = "Makoto Shinkai",
        sinopsis = "La historia se ambienta en un Tokio azotado por lluvias torrenciales e incesantes que parecen no tener fin. Hodaka Morishima, un estudiante de secundaria de 16 años, huye de su problemático hogar en una isla remota para buscar una nueva vida en la caótica capital. ",
        imagen = R.drawable.weathering_with_you
    ),
    Pelicula(
        id = 4,
        titulo = "Inglourious Basterds",
        anio = 2009,
        duracionMin = 153,
        genero = "Belico, Comedia, Accion",
        director = "Quentin Tarantino",
        sinopsis = " Un escuadrón de soldados judíos-estadounidenses liderado por el teniente Aldo Raine, dedicados a sembrar el terror cazando, asesinando y escalpando soldados nazis.",
        imagen = R.drawable.inglourious_basterds
    ),
    Pelicula(
        id = 5,
        titulo = "GoodFellas",
        anio = 1990,
        duracionMin = 145,
        genero = "Mafia, Drama",
        director = "Martin Scorsese",
        sinopsis = " Henry se adentra en el crimen organizado trabajando junto a figuras importantes de la familia criminal Lucchese, como el experimentado ladrón Jimmy Conway (Robert De Niro) y el volátil y peligroso Tommy DeVito (Joe Pesci).",
        imagen = R.drawable.goodfellas
    ),
    Pelicula(
        id = 6,
        titulo = "All Quiet On The Western Front",
        anio = 2022,
        duracionMin = 147,
        genero = "Belico",
        director = "Edward Berger",
        sinopsis = "Sigue a Paul Bäumer (interpretado por Felix Kammerer en la versión de 2022), un joven alemán de 17 años que, impulsado por el fervor patriótico y los discursos de sus profesores, se alista voluntariamente al ejército junto a sus amigos.",
        imagen = R.drawable.all_quiet_on_the_western_front
    ),
// ... una Pelicula por cada póster, separadas por comas
)