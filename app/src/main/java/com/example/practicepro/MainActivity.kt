package com.example.practicepro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : lifecycle() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       start_btn.setOnClickListener {
           val i=Intent(this,Nextpage::class.java)
           startActivity(i)

       }
    }
}