package com.example.intenciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Tecladito : AppCompatActivity() {
    private var currentText: String = "0"
    private lateinit var editText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tecladito)

        editText = findViewById(R.id.IngresoText)

        // Listener para los botones de números
        findViewById<Button>(R.id.button1).setOnClickListener {
            appendText("1")
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            appendText("2")
        }

        findViewById<Button>(R.id.button4).setOnClickListener {
            appendText("4")
        }

        findViewById<Button>(R.id.button5).setOnClickListener {
            appendText("5")
        }

        // Listener para el botón "B"
        findViewById<Button>(R.id.buttonB).setOnClickListener {
            if (currentText.length > 1) {
                currentText = currentText.substring(0, currentText.length - 1)
            } else {
                currentText = "0"
            }
            editText.setText(currentText)
        }

        // Listener para el botón "C"
        findViewById<Button>(R.id.buttonC).setOnClickListener {
            currentText = "0"
            editText.setText(currentText)
        }
    }

    private fun appendText(str: String) {
        if (currentText == "0") {
            currentText = str
        } else {
            currentText += str
        }
        editText.setText(currentText)
    }
}