package life.sabujak.gifttextinputview

import android.content.Context
import android.graphics.Color
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.LinearLayout
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class GiftTextInputView(context: Context, attrs: AttributeSet?) : TextInputLayout(context, attrs) {


    private val view: View by lazy {
        val params = LinearLayout.LayoutParams(MATCH_PARENT,
                context.resources.getDimension(R.dimen.sizeBorder).toInt())
        View(context).apply {
            layoutParams = params
            setBackgroundColor(Color.BLUE)
        }
    }

    private val textInputEditText: TextInputEditText by lazy {
        val params = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
        TextInputEditText(context).apply {
            layoutParams = params
            background = null
            setPadding(0, paddingTop, 0, context.resources.getDimension(R.dimen.sizePadding).toInt())
        }
    }

    override fun onFocusChanged(gainFocus: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        println("onFocusChanged gainFocus :::: $gainFocus")
        println("onFocusChanged direction :::: $direction")
        println("onFocusChanged previouslyFocusedRect :::: $previouslyFocusedRect")
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect)
    }


    onFocus
    init {
        addView(textInputEditText)
        addView(view)
    }
}