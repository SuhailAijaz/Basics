package com.example.basics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {

private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val data= ArrayList<ModalClass>()
    for(i in 1..10000) {
    data.add(ModalClass(R.drawable.user,"suhail", "Shah", "Aijaz","Android Developer"))
}
        val madapter =AdapterClass(data)
        recyclerView=findViewById(R.id.recycler_View)
            recyclerView.apply {
            layoutManager=LinearLayoutManager(this@MainActivity2)
                adapter=madapter
                setHasFixedSize(true)

        }



    }
}
