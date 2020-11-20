package com.example.practicepro

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.security.auth.Destroyable

open class lifecycle : AppCompatActivity() {
    val TAG:String="Lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} Oncreate" )
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG, "${javaClass.simpleName}Onstart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "${javaClass.simpleName} Onresume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(TAG, "${javaClass.simpleName}Onrestart")
        super.onRestart()
    }

    override fun onStop() {
        Log.d(TAG,"${javaClass.simpleName}Onstop")
        super.onStop()
    }

    override fun onPause() {
        Log.d(TAG,"${javaClass.simpleName}Onpause")
        super.onPause()
    }

    override fun onDestroy() {
        Log.d(TAG,"${javaClass.simpleName}Ondestroy")
        super.onDestroy()
    }
}