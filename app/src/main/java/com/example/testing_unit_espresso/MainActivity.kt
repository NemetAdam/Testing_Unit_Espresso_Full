package com.example.testing_unit_espresso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click_me = findViewById(R.id.button) as Button
        btn_click_me.setOnClickListener {
            textViewResult.text = editTextName.text
            Toast.makeText(this@MainActivity, "You clicked .", Toast.LENGTH_SHORT).show()
        }
    }
}
