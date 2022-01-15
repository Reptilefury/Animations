package com.reptilefury.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reptilefury.animations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var shawIsShowing = true
    var degeaIsShowing = true
    var cr7IsShowing = true
    var maguireIsShowing = true
    var cavaniIsShowing = true
    var brunoIsShowing = true
    var bissakaIsShowing = true
    var pogbaIsShowing = true
    var baillyIsShowing = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        binding.ShawImageView.setOnClickListener {
            val shawImage = binding.ShawImageView
            val degeaImage = binding.DegeaImageView
            val cr7Image = binding.CR7ImageView
            val pogbaImage = binding.PogbaImageView
            val maguireImage = binding.MaguireImageView
            val cavaniImage = binding.CavaniImageView
            val brunoImage = binding.BrunoImageView
            val bissakaImage = binding.BissakaImageView
            val  baillyImage = binding.BaillyImageView
            if (shawIsShowing) {
                shawImage.animate().alpha(0f).setStartDelay(500).setDuration(2000)
                shawIsShowing = false
            } else if (degeaIsShowing) {
                degeaImage.animate().alpha(0f).setStartDelay(500).setDuration(2000)
                degeaIsShowing = false
            } else if (cr7IsShowing) {
                cr7Image.animate().alpha(0f).setStartDelay(500).setDuration(2000)
                cr7IsShowing = false
            } else if (maguireIsShowing) {
                maguireImage.animate().alpha(0f).setStartDelay(500).setDuration(2000)
                maguireIsShowing = false
            } else if (cavaniIsShowing) {
                cavaniImage.animate().alpha(0f).setDuration(500).setDuration(2000)
                cavaniIsShowing = false
            } else if (brunoIsShowing) {
                brunoImage.animate().alpha(0f).setStartDelay(400).setDuration(2000)
                brunoIsShowing = false
            } else if (bissakaIsShowing) {
                bissakaImage.animate().alpha(0f).setStartDelay(500).setDuration(2000)
                bissakaIsShowing = false
            } else if(baillyIsShowing){
             baillyImage.animate().alpha(0f).setStartDelay(500).setDuration(2000)
                baillyIsShowing = false
            }
            else if (pogbaIsShowing){
                pogbaImage.animate().alpha(0f).setStartDelay(500).setDuration(2000)
                pogbaIsShowing = false
            }
        }
    }
}







