package com.anjali.vta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class SuggestedCourses : AppCompatActivity() {
    private lateinit var h:String
    private lateinit var l:ListView
    private var yourDataList:ArrayList<String> = ArrayList()
    private lateinit var l4:String
    private lateinit var l5:String
    private lateinit var au:String
    private lateinit var hm:String
    private lateinit var hb:String
    private lateinit var sm:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suggested_courses)
        l=findViewById(R.id.listv)
        sm=""
        l5="ICT NVQ level5"
        l4="LCT NVQ level4"
        au="Auto Mobile"
        hm="Hotel Management"
        hb="Hair and Beauty"
        h=intent.getStringExtra("hq").toString()
        if (h=="n4"){
        yourDataList.add(l5)
        }

        if (h=="n3"){
            yourDataList.add(l5)
            yourDataList.add(l4)
        }

        if (h=="al"){
            yourDataList.add(l5)
            yourDataList.add(l4)
            yourDataList.add(au)
            yourDataList.add(hm)
            yourDataList.add(hb)
        }

        if (h=="ol"){
            yourDataList.add(l4)
            yourDataList.add(au)
            yourDataList.add(hm)
            yourDataList.add(hb)
                 }

        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, yourDataList)
        l.adapter = adapter


    }
}