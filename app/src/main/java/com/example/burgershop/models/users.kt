package com.example.burgershop.models

data class User(
    val password : String,
    val username : String,
    val name : String,
    val phone : String,
    val address : String,
)

val testUser1 = User(
    "1234",
    "test",
    "Подлесный Юрий",
    "+7(800)555-35-35",
    "г.Обнинск, пр.Ленина, 69"
);

