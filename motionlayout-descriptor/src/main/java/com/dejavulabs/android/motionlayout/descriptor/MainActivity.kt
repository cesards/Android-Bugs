package com.dejavulabs.android.motionlayout.descriptor

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.dejavulabs.android.motionlayout.descriptor.databinding.ActivityMainBinding

class MainActivity : Activity() {
  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.programatically.setOnClickListener {
      startActivity(Intent(this, MotionSceneCompoundViewActivity::class.java))
    }
    binding.xml.setOnClickListener {
      startActivity(Intent(this, MotionSceneThroughXMLActivity::class.java))
    }
  }
}
