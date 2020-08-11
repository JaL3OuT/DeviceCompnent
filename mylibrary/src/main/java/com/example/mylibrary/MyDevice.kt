package com.example.mylibrary

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.view.get
import com.google.android.material.card.MaterialCardView
import kotlinx.android.synthetic.main.devicecompnent.view.*

class MyDevice :
    MaterialCardView {

    var name: TextView
    var count: TextView
    var icon: ImageView
    var state: Switch

    constructor(context: Context?) : super(context)

    constructor(
        context: Context?,
        attrs: AttributeSet?
    ) : super(context, attrs) {
        setAttrs(attrs, 0)
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        setAttrs(attrs, defStyleAttr)
    }

    init {
        LayoutInflater.from(context).inflate(
            R.layout.devicecompnent,
            this,
            true
        )

        state = findViewById(R.id.switch1)
        icon = findViewById(R.id.imageView)
        count = findViewById(R.id.textView)
        name = findViewById(R.id.textView2)
    }

    private fun setAttrs(attrs: AttributeSet?, i: Int) {
        if (attrs != null) {
            context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.MyDeviceAttrs,
                0,
                0
            ).apply {
                try {
                    setCardBackground(this)
                    setName(this)
                    setCount(this)
                    setIcon(this)
                    setState(this)
                    setCardBackground(this)
                    setcardraduis(this)
                } finally {
                    recycle()
                }
            }
        }
    }

    private fun setcardraduis(typedArray: TypedArray) {
        val ra = typedArray.getFloat(
            R.styleable.MyDeviceAttrs_radius, 16F
        )
        radius = ra
    }

    private fun setCardBackground(typedArray: TypedArray) {
        val color = typedArray.getColor(
            R.styleable.MyDeviceAttrs_color_background,
            context.getColor(R.color.colorAccent)
        )
        //setBackgroundColor(context.getColor(R.color.colorAccent))
        backgroundTintList = ColorStateList.valueOf(color)
        card.setCardBackgroundColor(color)

    }

    private fun setState(typedArray: TypedArray) {
        val stateBool = typedArray.getBoolean(
            R.styleable.MyDeviceAttrs_state,
            false
        )
        state.isChecked = stateBool
    }

    private fun setIcon(typedArray: TypedArray) {
        val image = typedArray.getDrawable(
            R.styleable.MyDeviceAttrs_icon
        ) ?: ContextCompat.getDrawable(
            context,
            R.drawable.ic_twotone_highlight_24
        )
        icon.setImageDrawable(image)
    }

    private fun setCount(typedArray: TypedArray) {
        val message = typedArray.getString(
            R.styleable.MyDeviceAttrs_count_device
        ) ?: "0"
        count.text = message
    }

    private fun setName(typedArray: TypedArray) {
        val message = typedArray.getString(
            R.styleable.MyDeviceAttrs_name_device
        ) ?: "0"
        name.text = message
        name.setTextColor(context.getColor(R.color.colorPrimary))
    }


}