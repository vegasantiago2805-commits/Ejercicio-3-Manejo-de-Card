package com.example.listacomida.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Platillo(
       @StringRes val stringResourceId: Int,
       @StringRes val precioResourceId: Int,
       @StringRes val ofertaResourceId: Int,
       @DrawableRes val drawableResource: Int
)

