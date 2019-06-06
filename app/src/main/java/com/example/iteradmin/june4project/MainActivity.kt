package com.example.iteradmin.june4project

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)

        //val lm:RecyclerView.LayoutManager=LinearLayoutManager(this)
        val lm:RecyclerView.LayoutManager=GridLayoutManager(this,2)
        recyclerView.layoutManager=lm

        val c1=Card("https://www.animationmagazine.net/wordpress/wp-content/uploads/Captain-Tsubasa-post.jpg",
                "Anime","Tsubasa Ozora")
        val c2=Card("http://img1.wikia.nocookie.net/__cb20111224221426/inazuma/es/images/7/70/0e1a1e23.jpg",
                "Anime","Shawn Frost")
        val dataset= arrayOf(c1,c2)


        recyclerView.adapter=TitanAdapter(this,dataset)

    }
}
