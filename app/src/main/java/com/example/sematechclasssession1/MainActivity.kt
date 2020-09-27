package com.example.sematechclasssession1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val tag : String = "Main:";
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        Log.d(tag," On Create!")
        setContentView(R.layout.activity_main)

    }


    override fun onStart() {
        super.onStart()
        Log.d(tag," On Activity!")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag," On Resume!")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag," On Pause!")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag," On Stop!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag," On Destroy!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag," On Restart!")
    }



    }