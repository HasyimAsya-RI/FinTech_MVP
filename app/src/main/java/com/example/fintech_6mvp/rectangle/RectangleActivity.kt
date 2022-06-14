package com.example.fintech_6mvp.rectangle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.fintech_6mvp.R

class RectangleActivity : AppCompatActivity() {
    private lateinit var eTxtPanjang:        EditText
    private lateinit var eTxtLebar:          EditText
    private lateinit var btnLuas:            Button
    private lateinit var btnKeliling:        Button
    private lateinit var txtHasil:           TextView
    private lateinit var rectanglePresenter: RectanglePresenter

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_rectangle )

        rectanglePresenter = RectanglePresenter( this )
        eTxtPanjang        = findViewById( R.id.eTxt_panjang )
        eTxtLebar          = findViewById( R.id.eTxt_lebar )
        btnLuas            = findViewById( R.id.btn_luas )
        btnKeliling        = findViewById( R.id.btn_keliling )
        txtHasil           = findViewById( R.id.txt_hasil )

        btnLuas.setOnClickListener {
            val panjang = eTxtPanjang.text.toString().toFloat()
            val lebar   = eTxtLebar.text.toString().toFloat()
            rectanglePresenter.rectangleArea( panjang, lebar )
        }
        btnKeliling.setOnClickListener {
            val panjang = eTxtPanjang.text.toString().toFloat()
            val lebar   = eTxtLebar.text.toString().toFloat()
            rectanglePresenter.rectanglePerimeter( panjang, lebar )
        }
    }

    fun updateArea( luas: Float ) {
        txtHasil.text = luas.toString()
    }

    fun updatePerimeter( keliling: Float ) {
        txtHasil.text = keliling.toString()
    }

    fun showError( eror: String ) {
        txtHasil.text = eror
    }
}