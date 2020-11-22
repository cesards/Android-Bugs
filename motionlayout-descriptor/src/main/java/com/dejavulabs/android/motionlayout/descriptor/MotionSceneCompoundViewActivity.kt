package com.dejavulabs.android.motionlayout.descriptor

import android.app.Activity
import android.os.Bundle
import com.dejavulabs.android.motionlayout.descriptor.databinding.ActivityMotionSceneCompoundViewBinding

class MotionSceneCompoundViewActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_motion_scene_compound_view)
  }
}
