package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  arrayList = ArrayList<Model> ()
        arrayList.add(Model("Newsfeed", "ini adalah desc dari gambar tangan orng yg lagi nge tap, gk tau ngetap apaan",R.drawable.tap))
        arrayList.add(Model("Business", "ini desc tentang gambar gedung yg ada di atas",R.drawable.company))
        arrayList.add(Model("People", "ini desc tentang orng yg lagi kumpul kumpul padahal lagi social distancing",R.drawable.team))
        arrayList.add(Model("Notes", "ini desc notes...",R.drawable.notes))
        arrayList.add(Model("Feedback", "ini desc feedback orng orng",R.drawable.support))

        val myAdapter = MyAdapter(arrayList, this )
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter

    }
}
