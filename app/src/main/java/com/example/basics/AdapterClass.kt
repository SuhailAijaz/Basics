package com.example.basics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(val todo:ArrayList<ModalClass>):RecyclerView.Adapter<AdapterClass.InnerClass>() {

    class InnerClass(view:View):RecyclerView.ViewHolder(view) {
        val img:ImageView
        val textone:TextView
        val texttwo:TextView
        val textthree:TextView
        val textfour:TextView
        init {
            img=view.findViewById(R.id.imageview)
            textone=view.findViewById(R.id.textView4)
            texttwo=view.findViewById(R.id.textView5)
            textthree=view.findViewById(R.id.textView6)
            textfour=view.findViewById(R.id.textView7)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InnerClass {
return InnerClass((LayoutInflater.from(parent.context).inflate(R.layout.target_layout,parent,false)))
    }

    override fun onBindViewHolder(holder: InnerClass, position: Int) {
        holder.textone.text =todo[position].fname
        holder.texttwo.text =todo[position].mname
        holder.textthree.text =todo[position].lname
        holder.textfour.text =todo[position].prof
    }

    override fun getItemCount(): Int {
return todo.size
    }
}