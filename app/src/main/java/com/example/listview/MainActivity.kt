package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrMonAn : ArrayList<MonAn> = ArrayList()
        arrMonAn.add(MonAn("Chao bao ngu",15000,R.drawable.ic_launcher_background))
        arrMonAn.add(MonAn("Chao bao ngu",15000,R.drawable.ic_launcher_background))
        arrMonAn.add(MonAn("Chao bao ngu",15000,R.drawable.ic_launcher_background))
        arrMonAn.add(MonAn("Chao bao ngu",15000,R.drawable.ic_launcher_background))
        arrMonAn.add(MonAn("Chao bao ngu",15000,R.drawable.ic_launcher_background))

        lvMonAn.adapter = MonAnAdapter(this,arrMonAn)

        btnAdd.setOnClickListener {
            var intent : Intent = Intent(applicationContext,DetailList :: class.java)
            startActivity(intent)


        }
    }
}