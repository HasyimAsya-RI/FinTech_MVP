package com.example.fintech1832_mvp.square

interface SquareView {
    fun showError       ( eror: String )
    fun updateArea      ( luas: Float )
    fun updatePerimeter ( keliling: Float )
}