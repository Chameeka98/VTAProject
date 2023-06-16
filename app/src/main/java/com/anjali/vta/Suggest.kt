package com.anjali.vta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.RadioButton

class Suggest : AppCompatActivity() {
    private lateinit var btn:Button
    private lateinit var n4:RadioButton
    private lateinit var n3:RadioButton
    private lateinit var ol:RadioButton
    private lateinit var al:RadioButton
    private lateinit var other:RadioButton
    private lateinit var hq:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suggest)

        n4=findViewById(R.id.radioButton)
        n3=findViewById(R.id.radioButton2)
        al=findViewById(R.id.radioButton3)
        ol=findViewById(R.id.radioButton4)
        other=findViewById(R.id.radioButton5)
        var yourDataList=ArrayList<String>()
        hq=""

        n4.setOnClickListener(View.OnClickListener {
            hq="n4"
            var i=Intent(this,SuggestedCourses::class.java)
            i.putExtra("hq",hq)
            startActivity(i)
        })

        n3.setOnClickListener(View.OnClickListener {
            hq="n3"
            var i=Intent(this,SuggestedCourses::class.java)
            i.putExtra("hq",hq)
            startActivity(i)
        })

        ol.setOnClickListener(View.OnClickListener {
            hq="ol"
            var i=Intent(this,SuggestedCourses::class.java)
            i.putExtra("hq",hq)
            startActivity(i)
        })

        al.setOnClickListener(View.OnClickListener {
            hq="al"
            var i=Intent(this,SuggestedCourses::class.java)
            i.putExtra("hq",hq)
            startActivity(i)
        })

        other.setOnClickListener(View.OnClickListener {
            hq="other"
            var i=Intent(this,SuggestedCourses::class.java)
            i.putExtra("hq",hq)
            startActivity(i)
        })
    }
}