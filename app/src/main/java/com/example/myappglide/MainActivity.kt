package com.example.myappglide

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private var index = 0
    private val imageList = listOf(
        "https://www.dpreview.com/files/p/articles/6566520415/Diallo_110510edit.jpg",
        "https://www.dpreview.com/files/p/articles/6566520415/ADiallo3078.jpg",
        "https://www.dpreview.com/files/p/articles/6566520415/museumofglass.jpg",
        "https://www.dpreview.com/files/p/articles/6566520415/ADiallo9955.jpg",
        "https://www.dpreview.com/files/p/articles/6566520415/ADiallo1495.jpg",
        "https://s1.1zoom.ru/big0/435/Horses_Sunrises_and_sunsets_532587_1280x720.jpg",
        "https://s1.1zoom.ru/big0/393/United_Kingdom_Scenery_Sunrises_and_sunsets_Fields_532397_1280x854.jpg",
        "https://tableforchange.com/wp-content/uploads/2020/06/Kniga-sudeb.jpg",
        "https://s1.1zoom.ru/big0/52/Love_Sunrises_and_sunsets_Fingers_Hands_Heart_Sun_532758_1280x897.jpg",
        "https://s1.1zoom.ru/big0/278/Sunrises_and_sunsets_Sky_Scenery_Coast_Dogs_Stones_533059_1280x849.jpg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btLoad)
        val image = findViewById<ImageView>(R.id.img)

        button.setOnClickListener{
            if (index>9) index = 0
            Glide
                .with(this)
                .load(imageList[index])
                .into(image)
            index++
        }
    }
}