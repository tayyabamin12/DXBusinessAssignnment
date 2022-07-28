package com.dx.DXBusiness.ui.home.adapter

import android.content.Context
import android.content.res.ColorStateList
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.dx.DXBusiness.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CustomAdapter(private val mList: List<String>, private val context: Context) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
  
    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_recycler_item, parent, false)
  
        return ViewHolder(view)
    }
  
    // binds the list items to a view
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
  
        val title = mList[position]
  
        // sets the image to the imageview from our itemHolder class
        when(position){
            0 -> {
                holder.imageView.setImageResource(R.drawable.noun_order_filled)
                holder.textView.setTextColor(context.resources.getColor(R.color.purple_500))
                holder.consLayout.setBackgroundResource(R.color.teal_200)
                holder.fab.setBackgroundColor(context.resources.getColor(R.color.purple_500))
                holder.fab.backgroundTintList = ColorStateList.valueOf(context.resources.getColor(R.color.purple_500))
                holder.fab.setImageDrawable(context.resources.getDrawable(R.drawable.ic_baseline_arrow_forward_blue))
            }
            1 -> {
                holder.imageView.setImageResource(R.drawable.noun_workflow)
                holder.textView.setTextColor(context.resources.getColor(R.color.teal_200))
                holder.consLayout.setBackgroundResource(R.color.purple_500)
                holder.fab.backgroundTintList = ColorStateList.valueOf(context.resources.getColor(R.color.teal_200))
                holder.fab.setImageDrawable(context.resources.getDrawable(R.drawable.ic_baseline_arrow_forward_ios_24))
            }
            2 -> {
                holder.imageView.setImageResource(R.drawable.noun_chat_filled)
                holder.textView.setTextColor(context.resources.getColor(R.color.purple_500))
                holder.consLayout.setBackgroundResource(R.color.teal_200)
                holder.fab.backgroundTintList = ColorStateList.valueOf(context.resources.getColor(R.color.purple_500))
                holder.fab.setImageDrawable(context.resources.getDrawable(R.drawable.ic_baseline_arrow_forward_blue))
            }
            3 -> {
                holder.imageView.setImageResource(R.drawable.noun_contact)
                holder.textView.setTextColor(context.resources.getColor(R.color.teal_200))
                holder.consLayout.setBackgroundResource(R.color.purple_500)
                holder.fab.backgroundTintList = ColorStateList.valueOf(context.resources.getColor(R.color.teal_200))
                holder.fab.setImageDrawable(context.resources.getDrawable(R.drawable.ic_baseline_arrow_forward_ios_24))
            }
        }
  
        // sets the text to the textview from our itemHolder class
        holder.textView.text = title
  
    }
  
    // return the number of the items in the list
    override fun getItemCount(): Int {
        return 4
    }
  
    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val consLayout: ConstraintLayout = itemView.findViewById(R.id.constraint_layout)
        val imageView: ImageView = itemView.findViewById(R.id.iv_icon)
        val textView: TextView = itemView.findViewById(R.id.tv_item_name)
        val fab: FloatingActionButton = itemView.findViewById(R.id.fab_item)
    }
}