package com.hexademical.androidmidtermapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private val oilArrs: Array<Oil> = arrayOf(
        Oil("เชลล์ ฟิวเซฟ แก๊สโซฮอล์ E20", 34.44),
        Oil("เชลล์ ฟิวเซฟ แก๊สโซฮอล์ 91", 35.28),
        Oil("เชลล์ ฟิวเซฟ แก๊สโซฮอล์ 95", 35.55),
        Oil("เชลล์ วี-เพาเวอร์ แก๊สโซฮอล์ 95", 43.04),
        Oil("เชลล์ ดีเซล B20", 34.94),
        Oil("ชลล์ ฟิวเซฟ ดีเซล", 34.94),
        Oil("เชลล์ ฟิวเซฟ ดีเซล B7", 34.94),
        Oil("เชลล์ วี-เพาเวอร์ ดีเซล", 34.94),
        Oil("เชลล์ วี-เพาเวอร์ ดีเซล B7", 45.66)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    
}