package com.example.practicepro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Nextpage : lifecycle() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nextpage)
    }

    fun btn_next(view: View)
    {
        val next=Intent(this,selectskill::class.java)
        startActivity(next)
    }
}
