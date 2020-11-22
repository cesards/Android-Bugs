package com.dejavulabs.android.motionlayout.descriptor.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.motion.widget.MotionLayout
import com.dejavulabs.android.motionlayout.descriptor.R

class CompoundMotionLayout @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
  defStyleAttr: Int = 0
) : MotionLayout(context, attrs, defStyleAttr) {

  init {
    inflate(context, R.layout.template_compound_motion_layout, this)
    loadLayoutDescription(R.xml.scene_02) // Layout doesn't show up
  }

  override fun onAttachedToWindow() {
    super.onAttachedToWindow()
    //loadLayoutDescription(R.xml.scene_02) //Layout doesn't show up either.
  }

  override fun onFinishInflate() {
    super.onFinishInflate()
    transitionToEnd()
    // loadLayoutDescription(R.xml.scene_02) Layout doesn't show up either.
  }
}
