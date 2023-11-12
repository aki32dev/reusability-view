package com.mp.reusability_view.view.textview

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.mp.reusability_view.R

class TextViewHeading1 : AppCompatTextView {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        applyCustomAttributes()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        applyCustomAttributes()
    }

    @SuppressLint("Recycle", "ResourceAsColor")
    private fun applyCustomAttributes() {
        setTextColor(ContextCompat.getColor(context, R.color.primary))
        setTypeface(Typeface.DEFAULT, Typeface.BOLD)
        textSize = 30F
    }
}