package com.bcarranza.noteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bcarranza.noteapp.adapter.RecyclerTag

class NotesHub : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes_hub)
        supportActionBar?.hide()

        setupAdapter()
    }

    private fun setupAdapter()
    {
        val recycler = findViewById<RecyclerView>(R.id.recyclerTags)
        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recycler.adapter = RecyclerTag(this, TagProvider.tagsList)
    }
}