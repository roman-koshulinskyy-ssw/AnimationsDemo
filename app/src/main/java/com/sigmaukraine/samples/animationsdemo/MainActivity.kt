package com.sigmaukraine.samples.animationsdemo

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.sigmaukraine.samples.animationsdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setupViews()
        setContentView(binding.root)
    }

    private fun setupViews() {
        with(binding) {
            slideDownButton.setOnClickListener {
                val animation: Animation =
                    AnimationUtils.loadAnimation(applicationContext, R.anim.slide_down)
                it.startAnimation(animation)
            }
            slideUpButton.setOnClickListener {
                val animation: Animation =
                    AnimationUtils.loadAnimation(applicationContext, R.anim.slide_up)
                it.startAnimation(animation)
            }
            zoomInButton.setOnClickListener {
                val animation: Animation =
                    AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_in)
                it.startAnimation(animation)
            }
            zoomOutButton.setOnClickListener {
                val animation: Animation =
                    AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
                it.startAnimation(animation)
            }
            fadeInButton.setOnClickListener {
                val animation: Animation =
                    AnimationUtils.loadAnimation(applicationContext, R.anim.fade_in)
                it.startAnimation(animation)
            }
            fadeOutButton.setOnClickListener {
                val animation: Animation =
                    AnimationUtils.loadAnimation(applicationContext, R.anim.fade_out)
                it.startAnimation(animation)
            }
            rotateClockwiseButton.setOnClickListener {
                val animation: Animation =
                    AnimationUtils.loadAnimation(applicationContext, R.anim.rotate_clockwise)
                it.startAnimation(animation)
            }
            rotateCounterClockwiseButton.setOnClickListener {
                val animation: Animation =
                    AnimationUtils.loadAnimation(applicationContext, R.anim.rotate_counter_clockwise)
                it.startAnimation(animation)
            }
        }
    }
}