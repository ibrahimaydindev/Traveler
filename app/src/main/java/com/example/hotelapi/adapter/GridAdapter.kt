package com.example.hotelapi.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hotelapi.R
import com.example.hotelapi.models.GridModel
import com.example.hotelapi.ui.LoginActivity

class GridAdapter(var contex :Context, var arrayList:ArrayList<GridModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holder= LayoutInflater.from(parent.context).inflate(R.layout.griditem_layout,parent,false)
        return Holder(holder)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model: GridModel= arrayList[position]
        holder.itemView.findViewById<ImageView>(R.id.idMaps).setImageResource(model.Image)
        holder.itemView.findViewById<TextView>(R.id.idMapsText).text=model.title
       holder.itemView.setOnClickListener { v: View? ->
           when(position){
               0->{
                   val context: Context = v!!.context
                   val intent = Intent(context, LoginActivity::class.java)
                     context.startActivity(intent)
               }
               1->{
                   val context: Context = v!!.context
                   val intent = Intent(context, LoginActivity::class.java)
                   context.startActivity(intent)
               }
                2->{
                     val context: Context = v!!.context
                     val intent = Intent(context, LoginActivity::class.java)
                     context.startActivity(intent)
                }
                3->{
                     val context: Context = v!!.context
                     val intent = Intent(context, LoginActivity::class.java)
                     context.startActivity(intent)
           }
                4->{
                     val context: Context = v!!.context
                     val intent = Intent(context, LoginActivity::class.java)
                     context.startActivity(intent)
                }
                5->{
                     val context: Context = v!!.context
                     val intent = Intent(context, LoginActivity::class.java)
                     context.startActivity(intent)
                }
               6->{
                     val context: Context = v!!.context
                     val intent = Intent(context, LoginActivity::class.java)
                     context.startActivity(intent)
                }
           }
       }
    }
    override fun getItemCount(): Int {
        return arrayList.size
    }

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image = itemView.findViewById<ImageView>(R.id.idMaps)
        var title = itemView.findViewById<TextView>(R.id.idMapsText)

    }

}