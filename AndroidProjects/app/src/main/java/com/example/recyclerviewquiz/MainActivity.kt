package com.example.recyclerviewquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

val contacts = mutableListOf<Contact>()



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rvContacts = findViewById<RecyclerView>(R.id.rvContacts)
        rvContacts.adapter = ContactsAdapter(this, contacts)
        rvContacts.layoutManager = LinearLayoutManager(this)

        createContacts()
    }
}

fun createContacts() {
    for(i in 1..150){
        contacts.add(Contact("Person #$i", i))
    }
}
