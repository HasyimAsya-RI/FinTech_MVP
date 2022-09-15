package com.example.fintech1832_mvp.rectangle

class RectanglePresenter( private val rectangleView: RectangleActivity) {

    fun rectangleArea( panjang: Float, lebar: Float ) {
        // Validasi
        if( panjang == 0F ) {
            rectangleView.showError("Panjang tidak boleh 0!")
            return
        }
        if( lebar == 0F ) {
            rectangleView.showError( "Lebar tidak boleh 0!" )
            return
        }

        val luas = panjang * lebar
        rectangleView.updateArea( luas )
    }

    fun rectanglePerimeter( panjang: Float, lebar: Float ) {
        if( panjang == 0F ) {
            rectangleView.showError("Panjang tidak boleh 0!")
            return
        }
        if( lebar == 0F ) {
            rectangleView.showError( "Lebar tidak boleh 0!" )
            return
        }

        val keliling = 2 * ( panjang + lebar )
        rectangleView.updatePerimeter( keliling )
    }

}