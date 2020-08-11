package com.example.devicecompnent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.MyDevice

class MainActivity : AppCompatActivity() {
    lateinit var  myDevice : MyDevice
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myDevice = MyDevice(this)
        myDevice.deviceSetDefault()

    }
}