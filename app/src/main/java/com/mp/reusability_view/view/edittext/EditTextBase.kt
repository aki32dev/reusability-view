package com.mp.reusability_view.view.edittext

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.ContextCompat
import com.mp.reusability_view.R

class EditTextBase : AppCompatEditText {
    var valid = true

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        applyCustomAttributes()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        applyCustomAttributes()
    }

    private fun applyCustomAttributes() {
        background = ContextCompat.getDrawable(context, R.drawable.bg_et)
        setPadding(39, 30, 39, 30)
        compoundDrawablePadding = 16
        textSize = 15F
    }

    fun setBackground(value: Boolean) {
        if (value) {
            background = ContextCompat.getDrawable(context, R.drawable.bg_et)
        } else {
            background = ContextCompat.getDrawable(context, R.drawable.bg_et_wrong)
        }
    }
}