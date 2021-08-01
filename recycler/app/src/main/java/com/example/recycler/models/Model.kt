package com.example.recycler.models

data class Hobby(var title: String )

object Supplier {
    val hobbies = listOf<Hobby>(
        Hobby("Reading"),
        Hobby("Codding"),
        Hobby("Eating"),
        Hobby("Praying"),
        Hobby("Reading"),
        Hobby("Codding"),
        Hobby("Eating"),
        Hobby("Praying"),
        Hobby("Reading"),
        Hobby("Codding"),
        Hobby("Eating"),
        Hobby("Praying"),
    )
}