package com.wik4apps.lectureapp02


import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate")
        val btn = findViewById<Button>(R.id.hi_button)
        btn.setOnClickListener {
            val name = findViewById<EditText>(R.id.edit_text_name)
            val hi = findViewById<TextView>(R.id.hi_textview)
            hi.text = "Hi ${name.text}"
            btn.text = "Say Hi Again"
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart is called")
    }
    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.e("MainActivity", "onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart")
    }
}
