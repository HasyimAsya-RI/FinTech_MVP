package com.example.fintech_6mvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fintech_6mvp.rectangle.RectangleActivity
import com.example.fintech_6mvp.square.SquareActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        val btnRectangle: Button = findViewById( R.id.btn_rectangle )
        val btnSquare:    Button = findViewById( R.id.btn_square )

        btnRectangle.setOnClickListener {
            val intent = Intent( this, RectangleActivity::class.java )
            startActivity( intent )
        }
        btnSquare.setOnClickListener {
            val intent = Intent( this, SquareActivity::class.java )
            startActivity( intent )
        }
    }
}