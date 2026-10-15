
package com.example.playjuegos

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar el diseño de la pantalla principal
        setContentView(R.layout.activity_main)

        // Buscar el botón NEW PLAYER
        val jugador = findViewById<Button>(R.id.button2)

        // Detectar cuando pulsamos NEW PLAYER
        jugador.setOnClickListener {
            lanzarNewPlayer()
        }
    }

    // Función para abrir la pantalla NewPlayer
    fun lanzarNewPlayer() {
        val intent = Intent(this, NewPlayer::class.java)
        startActivity(intent)
    }
}
