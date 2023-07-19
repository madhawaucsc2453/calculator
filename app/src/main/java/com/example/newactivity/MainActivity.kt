
package com.example.newactivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity




 class MainActivity :AppCompatActivity() {

     @SuppressLint("SetTextI18n")
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
         val myTextView = findViewById<TextView>(R.id.myTextView)
         myTextView.text = "Hello World!"


     }
   override fun onStart(){
         super.onStart()
         startMyService()
         }
   private fun startMyService(){
        val serviceIntent=Intent(this,MyService::class.java)
       startService(serviceIntent)
         }
   }



