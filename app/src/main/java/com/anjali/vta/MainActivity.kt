package com.anjali.vta

import android.content.Context
import android.content.Intent
import android.graphics.SurfaceTexture
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.media.MediaPlayer
import android.view.Surface
import android.view.TextureView
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), TextureView.SurfaceTextureListener {

    private lateinit var mediaPlayer: MediaPlayer
private lateinit var button:Button
private lateinit var c:Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button)
        c=this
button.setOnClickListener(View.OnClickListener {
    var i=Intent(c,Homescreen::class.java)
    startActivity(i)
})
        val textureView = findViewById<TextureView>(R.id.videoTextureView)
        textureView.surfaceTextureListener = this
    }

    override fun onSurfaceTextureAvailable(surface: SurfaceTexture, width: Int, height: Int) {
        val surface = Surface(surface)
        mediaPlayer = MediaPlayer.create(this, R.raw.video) // Replace "your_video_file" with the name of your video file
        mediaPlayer.setSurface(surface)
        mediaPlayer.isLooping = true
        mediaPlayer.start()
    }

    override fun onSurfaceTextureSizeChanged(surface: SurfaceTexture, width: Int, height: Int) {
        // No implementation needed
    }

    override fun onSurfaceTextureDestroyed(surface: SurfaceTexture): Boolean {
        mediaPlayer.stop()
        mediaPlayer.release()
        return true
    }

    override fun onSurfaceTextureUpdated(surface: SurfaceTexture) {
        // No implementation needed
    }
}
