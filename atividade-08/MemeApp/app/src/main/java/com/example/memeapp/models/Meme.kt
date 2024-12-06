package com.example.memeapp.models

import com.example.memeapp.R

data class Meme(
    val id: Int,
    val nome: String,
    val description: String,
    val creator: String,
    val category: String,
    val imageRes: Int,
    val likes: Int = 0,
    var isFavorite: Boolean = false
)

val memeList = listOf(
    Meme(
        id = 1,
        nome = "Doge",
        description = "Um cão Shiba Inu icônico, famoso por frases engraçadas.",
        creator = "Usuários da internet",
        category = "Animais",
        imageRes = R.drawable.doge,
        likes = 12000,
        isFavorite = true
    ),
    Meme(
        id = 2,
        nome = "Distracted Boyfriend",
        description = "Um namorado olhando para outra mulher enquanto sua namorada está chocada.",
        creator = "Antonio Guillem",
        category = "Relacionamentos",
        imageRes = R.drawable.distracted_boyfriend,
        likes = 8500
    ),
    Meme(
        id = 3,
        nome = "Woman Yelling at a Cat",
        description = "Uma mulher gritando e um gato confuso sentado à mesa.",
        creator = "Taylor Armstrong",
        category = "Reações",
        imageRes = R.drawable.woman_and_cat,
        likes = 10000
    ),
    Meme(
        id = 4,
        nome = "Leonardo DiCaprio Cheers",
        description = "Leonardo DiCaprio brindando com uma taça de champanhe.",
        creator = "Cena do filme The Great Gatsby",
        category = "Filmes",
        imageRes = R.drawable.dicaprio,
        likes = 9200,
        isFavorite = false
    ),
    Meme(
        id = 5,
        nome = "Success Kid",
        description = "Um bebê com um punho cerrado, simbolizando vitória ou sucesso.",
        creator = "Laney Griner",
        category = "Motivação",
        imageRes = R.drawable.succes_kids,
        likes = 15000
    ),
    Meme(
        id = 6,
        nome = "Two Buttons",
        description = "Um homem suando enquanto tenta decidir entre dois botões.",
        creator = "Usuários da internet",
        category = "Escolhas",
        imageRes = R.drawable.two_buttons,
        likes = 7300
    ),
    Meme(
        id = 7,
        nome = "Grumpy Cat",
        description = "O gato rabugento icônico, famoso por seu olhar de desgosto.",
        creator = "Usuários da internet",
        category = "Animais",
        imageRes = R.drawable.grumpy_cat,
        likes = 14000
    ),
    Meme(
        id = 8,
        nome = "Pepe the Frog",
        description = "Um sapo verde, usado como reação em diversas situações.",
        creator = "Matt Furie",
        category = "Reações",
        imageRes = R.drawable.pepe_frog,
        likes = 18000,
        isFavorite = true
    )
)
