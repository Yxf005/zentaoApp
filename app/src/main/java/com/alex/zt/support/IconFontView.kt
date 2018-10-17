package com.alex.zt.support

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView

/**
 * .
 * @author <a href="mailto:parselife@gmail.com">alex</a>
 * @version v1.0, 2018/10/17
 */
class IconFontView : TextView {

    constructor(context: Context?) : super(context) {
        initFont()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        initFont()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initFont()
    }

    private fun initFont() {
        val iconfont = Typeface.createFromAsset(context.applicationContext.assets, "iconfont/iconfont.ttf")
        typeface = iconfont
    }
}