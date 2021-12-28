package com.example.recyclerviewquiz

data class Contact(val name: String, val age: Int) {
    val imageURL ="https://picsum.photos/150?random=$age"
}