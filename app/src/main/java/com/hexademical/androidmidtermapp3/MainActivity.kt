package com.hexademical.androidmidtermapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private lateinit var oilArrs: ArrayList<Oil>;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // because of if one day we do a real app we should get data from api and init to oilArrs
        val oilData = arrayOf(
            arrayOf("เชลล์ ฟิวเซฟ แก๊สโซฮอล์ E20", 35.28),
            arrayOf("เชลล์ ฟิวเซฟ แก๊สโซฮอล์ 91", 35.28),
            arrayOf("เชลล์ ฟิวเซฟ แก๊สโซฮอล์ 95", 35.55),
            arrayOf("เชลล์ วี-เพาเวอร์ แก๊สโซฮอล์ 95", 43.04),
            arrayOf("เชลล์ ดีเซล B20", 34.94),
            arrayOf("ชลล์ ฟิวเซฟ ดีเซล", 34.94),
            arrayOf("เชลล์ ฟิวเซฟ ดีเซล B7", 34.94),
            arrayOf("เชลล์ วี-เพาเวอร์ ดีเซล", 34.94),
            arrayOf("เชลล์ วี-เพาเวอร์ ดีเซล B7", 45.66),
        );

        // after get data from api
        oilArrs = ArrayList(); // initial array list
        for(oil in oilData){
            val oilInit = Oil(oil[0].toString(), oil[1].toString().toDouble())
            oilArrs.add(oilInit)
            Log.d("InitToOilArrays", "Name:${oilInit.getOilName()} / Price:${oilInit.getOilPrice()}")
        }


    }


}