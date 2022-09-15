package com.example.fintech1832_mvp.square

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.fintech1832_mvp.R

class SquareActivity : AppCompatActivity() {
    private lateinit var eTxtSisi:        EditText
    private lateinit var btnLuas:         Button
    private lateinit var btnKeliling:     Button
    private lateinit var txtHasil:        TextView
    private lateinit var squarePresenter: SquarePresenter

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_square )

        squarePresenter = SquarePresenter( this )
        eTxtSisi        = findViewById(R.id.eTxt_sisi )
        btnLuas         = findViewById( R.id.btn_luas )
        btnKeliling     = findViewById( R.id.btn_keliling )
        txtHasil        = findViewById( R.id.txt_hasil )

        btnLuas.setOnClickListener {
            val sisi = eTxtSisi.text.toString().toFloat()
            squarePresenter.squareArea( sisi )
        }
        btnKeliling.setOnClickListener {
            val sisi = eTxtSisi.text.toString().toFloat()
            squarePresenter.squarePerimeter( sisi )
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