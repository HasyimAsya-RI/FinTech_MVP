package com.example.fintech_6mvp.rectangle

interface RectangleView {
    fun showError       ( eror: String )
    fun updateArea      ( luas: Float )
    fun updatePerimeter ( keliling: Float )
}