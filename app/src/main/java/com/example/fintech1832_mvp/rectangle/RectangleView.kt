package com.example.fintech1832_mvp.rectangle

interface RectangleView {
    fun showError       ( eror: String )
    fun updateArea      ( luas: Float )
    fun updatePerimeter ( keliling: Float )
}