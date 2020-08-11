package com.example.mylibrary

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import com.google.android.material.card.MaterialCardView
import kotlinx.android.synthetic.main.devicecompnent.view.*

class MyDevice :
    MaterialCardView{
    constructor(context: Context?): super (context){ deviceSet(cornerRadus,nameDevice,countDevice, state, color, icon)}
    constructor(context: Context?, attrs: AttributeSet?): super (context,attrs){ deviceSet(cornerRadus,nameDevice,countDevice, state, color, icon)}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int): super (context, attrs, defStyleAttr){ deviceSet(cornerRadus,nameDevice,countDevice, state, color, icon)}

    val cornerRadus : Float = 8F
    val nameDevice : String = "test"
    val countDevice : String  = "0"
    val state : Boolean = false
    @DrawableRes val color : Int =R.color.colorPrimary
    @DrawableRes val icon : Int = R.drawable.ic_twotone_highlight_24
    fun deviceSet (cornerRadius : Float, nameDevice: String, countDevice : String, state : Boolean, @DrawableRes color: Int, @DrawableRes icon : Int){
        View.inflate(context,R.layout.devicecompnent,this)
        card.radius =cornerRadius
        textView.text=nameDevice
        textView2.text=countDevice
        switch1.isChecked=state
        card.background = context.getDrawable(color)
        imageView.setImageResource(icon)
    }
    fun deviceSet (){
        View.inflate(context,R.layout.devicecompnent,this)
        card.radius =8F
        textView.text="Hello"
        textView2.text="Tesssst"
        switch1.isChecked=false
        card.background = context.getDrawable(R.color.colorPrimary)
        imageView.setImageResource(icon)
    }



}