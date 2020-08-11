package com.example.mylibrary

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.google.android.material.card.MaterialCardView
import kotlinx.android.synthetic.main.devicecompnent.view.*

class MyDevice :
    MaterialCardView{

    constructor(context: Context?): super (context){ deviceSetDefault()}
    constructor(context: Context?, attrs: AttributeSet?): super (context,attrs){ deviceSetDefault()}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int): super (context, attrs, defStyleAttr){ deviceSetDefault()}

    fun deviceSetDefault (){
        View.inflate(context,R.layout.devicecompnent,this)
        card.radius =8F
        textView.text="Hello"
        textView2.text="Tesssst"
        switch1.isChecked=false
        card.background = context.getDrawable(R.color.colorPrimary)
    }
}