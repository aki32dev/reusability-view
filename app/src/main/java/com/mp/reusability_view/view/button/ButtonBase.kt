package com.mp.reusability_view.view.button

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.mp.reusability_view.R

class ButtonBase : AppCompatButton {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        applyCustomAttributes()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        applyCustomAttributes()
    }

    private fun applyCustomAttributes() {
        background = ContextCompat.getDrawable(context, R.drawable.bg_bt)
        setPadding(48, 30, 48, 30)
        setTextColor(ContextCompat.getColor(context, R.color.white))
        setTypeface(Typeface.DEFAULT, Typeface.BOLD)
        textSize = 15F
        isAllCaps = false
    }
}