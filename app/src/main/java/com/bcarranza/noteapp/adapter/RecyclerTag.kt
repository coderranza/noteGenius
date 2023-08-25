package com.bcarranza.noteapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bcarranza.noteapp.R
import com.bcarranza.noteapp.Tag

class RecyclerTag(private var context: Context, private var tagList:List<Tag>):RecyclerView.Adapter<RecyclerTag.MyHolder>() {

    inner class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        var labelTagName: TextView
        var cardTag: CardView

        init {
            labelTagName = itemView.findViewById(R.id.nameTag)
            cardTag = itemView.findViewById(R.id.tagCard)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.tag_button, parent, false)
        return MyHolder(itemView)
    }

    override fun getItemCount(): Int {
       return tagList.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var tag = tagList[position]
        holder.labelTagName.text = context.getString(tag.name)
    }
}