package com.anjali.vta

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class Homescreen : AppCompatActivity() {
    private lateinit var btn: Button
    private lateinit var btn2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)



btn=findViewById(R.id.button2)
        btn2=findViewById(R.id.button3)
        btn.setOnClickListener(View.OnClickListener {
            var i=Intent(this,Browse::class.java)
            startActivity(i)

        })
        btn2.setOnClickListener(View.OnClickListener {
            var i=Intent(this,Suggest::class.java)
            startActivity(i)
        })
    }
}