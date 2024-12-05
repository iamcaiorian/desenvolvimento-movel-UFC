package com.example.carapp.models

import com.example.carapp.R

data class Car (
    val id: Int,
    val brand: String,
    val model: String,
    val imageRes: Int,
    val year: Int,
    val color: String,
    val mileage: Double,
    val price: Double,
    val description: String
)

val carList = listOf(
    Car(
        id = 1,
        brand = "Toyota",
        model = "Corolla",
        imageRes = R.drawable.corolla,
        year = 2015,
        color = "Silver",
        mileage = 10235.50,
        price = 18500.00,
        description = "Sedan, reliable and efficient"
    ),
    Car(
        id = 2,
        brand = "Honda",
        model = "Civic",
        imageRes = R.drawable.civic,
        year = 2018,
        color = "Black",
        mileage = 54321.75,
        price = 22000.00,
        description = "Sedan, compact and economical"
    ),
    Car(
        id = 3,
        brand = "Ford",
        model = "Ranger",
        imageRes = R.drawable.ranger,
        year = 2021,
        color = "White",
        mileage = 18000.00,
        price = 45000.00,
        description = "Pickup, durable and tough"
    ),
    Car(
        id = 4,
        brand = "BMW",
        model = "X5",
        imageRes = R.drawable.x5,
        year = 2020,
        color = "Blue",
        mileage = 12000.00,
        price = 55000.00,
        description = "SUV, luxurious and stylish"
    ),
    Car(
        id = 5,
        brand = "Nissan",
        model = "Altima",
        imageRes = R.drawable.altima,
        year = 2019,
        color = "Gray",
        mileage = 35000.00,
        price = 23000.00,
        description = "Sedan, spacious and family-friendly"
    ),
    Car(
        id = 6,
        brand = "Chevrolet",
        model = "Silverado",
        imageRes = R.drawable.silverado,
        year = 2022,
        color = "Red",
        mileage = 5000.00,
        price = 47000.00,
        description = "Pickup, high performance"
    ),
    Car(
        id = 7,
        brand = "Hyundai",
        model = "Tucson",
        imageRes = R.drawable.tucson,
        year = 2020,
        color = "Green",
        mileage = 15000.00,
        price = 32000.00,
        description = "SUV, compact and economical"
    ),
    Car(
        id = 8,
        brand = "Volkswagen",
        model = "Golf",
        imageRes = R.drawable.golf,
        year = 2016,
        color = "White",
        mileage = 40000.00,
        price = 18000.00,
        description = "Hatchback, reliable and efficient"
    ),
    Car(
        id = 9,
        brand = "Audi",
        model = "Q7",
        imageRes = R.drawable.q7,
        year = 2021,
        color = "Black",
        mileage = 10000.00,
        price = 62000.00,
        description = "SUV, luxurious and stylish"
    ),
    Car(
        id = 10,
        brand = "Mercedes-Benz",
        model = "C-Class",
        imageRes = R.drawable.c_class,
        year = 2017,
        color = "Silver",
        mileage = 30000.00,
        price = 34000.00,
        description = "Sedan, classic design"
    )
//    Car(
//        id = 11,
//        brand = "Toyota",
//        model = "Camry",
//        year = 2018,
//        color = "Blue",
//        mileage = 25000.00,
//        price = 24000.00,
//        description = "Sedan, reliable and efficient",
//        isFavorite = true
//    ),
//    Car(
//        id = 12,
//        brand = "Honda",
//        model = "Accord",
//        year = 2019,
//        color = "Gray",
//        mileage = 31000.00,
//        price = 26000.00,
//        description = "Sedan, spacious and comfortable",
//        isFavorite = false
//    ),
//    Car(
//        id = 13,
//        brand = "Ford",
//        model = "Escape",
//        year = 2020,
//        color = "Red",
//        mileage = 12000.00,
//        price = 30000.00,
//        description = "SUV, family-friendly",
//        isFavorite = false
//    ),
//    Car(
//        id = 14,
//        brand = "BMW",
//        model = "3 Series",
//        year = 2017,
//        color = "Black",
//        mileage = 40000.00,
//        price = 35000.00,
//        description = "Sedan, sporty and dynamic",
//        isFavorite = true
//    ),
//    Car(
//        id = 15,
//        brand = "Chevrolet",
//        model = "Cruze",
//        year = 2016,
//        color = "White",
//        mileage = 45000.00,
//        price = 15000.00,
//        description = "Sedan, compact and economical",
//        isFavorite = false
//    ),
//    Car(
//        id = 16,
//        brand = "Hyundai",
//        model = "Elantra",
//        year = 2021,
//        color = "Silver",
//        mileage = 8000.00,
//        price = 22000.00,
//        description = "Sedan, reliable and efficient",
//        isFavorite = true
//    ),
//    Car(
//        id = 17,
//        brand = "Volkswagen",
//        model = "Passat",
//        year = 2019,
//        color = "Blue",
//        mileage = 27000.00,
//        price = 25000.00,
//        description = "Sedan, spacious and stylish",
//        isFavorite = false
//    ),
//    Car(
//        id = 18,
//        brand = "Audi",
//        model = "A4",
//        year = 2018,
//        color = "Black",
//        mileage = 35000.00,
//        price = 42000.00,
//        description = "Sedan, luxurious and comfortable",
//        isFavorite = true
//    ),
//    Car(
//        id = 19,
//        brand = "Mercedes-Benz",
//        model = "E-Class",
//        year = 2021,
//        color = "Gray",
//        mileage = 15000.00,
//        price = 60000.00,
//        description = "Sedan, cutting-edge technology",
//        isFavorite = false
//    ),
//    Car(
//        id = 20,
//        brand = "Toyota",
//        model = "RAV4",
//        year = 2020,
//        color = "White",
//        mileage = 14000.00,
//        price = 35000.00,
//        description = "SUV, compact and reliable",
//        isFavorite = true
//    )
)

