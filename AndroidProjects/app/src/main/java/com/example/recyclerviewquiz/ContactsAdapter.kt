package com.example.recyclerviewquiz

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class ContactsAdapter(private val context:Context, private val contacts: List<Contact>): RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.contacts_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bind(contact)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(contact: Contact) {
            var tvName = itemView.findViewById<TextView>(R.id.tvName)
            var tvAge = itemView.findViewById<TextView>(R.id.tvAge)
            var ivProfile = itemView.findViewById<ImageView>(R.id.ivProfile)
            tvName.text = contact.name
            tvAge.text = "Age: ${contact.age}"
            Glide.with(context).load(contact.imageURL).into(ivProfile)
        }

    }

}