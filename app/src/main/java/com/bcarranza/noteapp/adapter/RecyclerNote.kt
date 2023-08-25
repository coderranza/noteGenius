package com.bcarranza.noteapp.adapter

import android.content.Context
import android.provider.ContactsContract
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.bcarranza.noteapp.R

class RecyclerNote(private var context: Context, private var noteList:List<ContactsContract.CommonDataKinds.Note>):RecyclerView.Adapter<RecyclerNote.MyHolder>() {

    inner class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        var cardNote: CardView
        var textNoteTitle: TextView
        var textNoteDate: TextView
        var textNoteDetail: TextView
        var imgNoteIcon: ImageView

        init {
            cardNote = itemView.findViewById(R.id.cardNote)
            textNoteTitle = itemView.findViewById(R.id.txtNoteTitle)
            textNoteDate = itemView.findViewById(R.id.txtNoteDate)
            textNoteDetail = itemView.findViewById(R.id.txtNoteDetail)
            imgNoteIcon = itemView.findViewById(R.id.imgNoteIcon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        TODO("Not yet implemented")
    }
}