package com.example.practica7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val TAG = "LoginActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enlazar los EditText y el Button
        val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        // Configurar el click del botón
        buttonLogin.setOnClickListener {
            // Obtener los valores de usuario y contraseña
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            // Mostrar el nombre de usuario y contraseña en un Toast
            Toast.makeText(this, "Usuario: $username, Contraseña: $password", Toast.LENGTH_SHORT).show()

            // Registrar en el Logcat
            Log.d(TAG, "Usuario: $username, Contraseña: $password")
        }
    }
}
