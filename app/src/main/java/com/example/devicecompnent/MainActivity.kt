package com.example.devicecompnent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.MyDevice

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val myDevice = MyDevice(this).apply {  }
       myDevice.deviceSet(16F,"ALOOOOO","10",true,R.color.colorAccent,R.drawable.ic_launcher_foreground)
    }
}