 package com.example.tutorialseu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainText = findViewById<TextView>(R.id.HelloText)
        val btnClickMe = findViewById<Button>(R.id.button1)
        var timesClicked = 0

        btnClickMe.setOnClickListener{
            mainText.text = "Bash mi e milo!"
            timesClicked += 1
            if (timesClicked>1){
                btnClickMe.text = "Zosto me klikna $timesClicked pati?!"
            }
            Toast.makeText(this,"Jako bilo ova Kotlinov!", Toast.LENGTH_SHORT).show()
        }

    }
}