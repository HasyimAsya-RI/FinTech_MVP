package com.example.fintech_6mvp.square

interface SquareView {
    fun showError       ( eror: String )
    fun updateArea      ( luas: Float )
    fun updatePerimeter ( keliling: Float )
}