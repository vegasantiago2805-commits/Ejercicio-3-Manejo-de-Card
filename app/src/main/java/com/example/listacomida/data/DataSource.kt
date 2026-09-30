package com.example.listacomida.data

import com.example.listacomida.R
import com.example.listacomida.model.Platillo

class DataSource() {
    fun LoadPlatillos(): List<Platillo>{
        return listOf<Platillo>(
            Platillo(R.string.postre, R.string.precio_postre, R.string.oferta_postre, R.drawable.postre),
            Platillo(R.string.pozole, R.string.precio_pozole, R.string.oferta_pozole, R.drawable.pozole),
            Platillo(R.string.pizza, R.string.precio_pizza, R.string.oferta_pizza, R.drawable.pizza),
            Platillo(R.string.tacos, R.string.precio_tacos, R.string.oferta_tacos, R.drawable.tacos),
            Platillo(R.string.hamburger, R.string.precio_hamburger, R.string.oferta_hamburger, R.drawable.hamburguer),
            Platillo(R.string.desayuno, R.string.precio_desayuno, R.string.oferta_desayuno, R.drawable.desayuno)
        )
    }
}
