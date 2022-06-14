package com.example.fintech_6mvp.square

class SquarePresenter( private val squareView: SquareActivity) {

    fun squareArea( sisi: Float ) {
        // Validasi
        if( sisi == 0F ) {
            squareView.showError("Sisi tidak boleh 0!")
            return
        }

        val luas = sisi * sisi
        squareView.updateArea( luas )
    }

    fun squarePerimeter( sisi: Float ) {
        if( sisi == 0F ) {
            squareView.showError("Sisi tidak boleh 0!")
            return
        }

        val keliling = 4 * sisi
        squareView.updatePerimeter( keliling )
    }

}