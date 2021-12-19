package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class Person(val name: String, val age: Int)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contacts = createContacts()
        val rvContacts = findViewById<RecyclerView>(R.id.rvContacts)
        rvContacts.adapter = ContactsAdapter(this, contacts)
        rvContacts.layoutManager = LinearLayoutManager(this)

    }

    private fun createContacts(): List<Person> {
        val contacts = mutableListOf<Person>()
        for(i in 1..100){
            contacts.add(Person("Person $i", i))
        }
        return contacts
    }
}