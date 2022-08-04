package com.genius_koder.dogglers_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DogCardAdapter(
    private val context : Context?,
    private val layout : Int
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    class DogCardViewHolder(view : View):RecyclerView.ViewHolder(view) {
        val name : TextView = view.findViewById(R.id.dog_name)
        val age : TextView = view.findViewById(R.id.dog_age)
        val hobbies : TextView = view.findViewById(R.id.dog_hobbies)

        val img : ImageView = view.findViewById(R.id.dog_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {

        val adapterLayout : View
        if(layout==Layout.GRID) {
             adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.grid_list_item, parent, false)
        }
        else {
             adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.vertical_horizontal_list_item, parent, false)
        }
        return DogCardViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val data = DataSource.dogs[position]
        holder.img.setImageResource(data.imageResourceId)
        holder.name.text = data.name
        holder.age.text = data.age
        holder.hobbies.text = context?.resources?.getString(R.string.dog_hobbies,data.hobbies)
    }

    override fun getItemCount(): Int {
        return DataSource.dogs.size
    }
}