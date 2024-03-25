package com.example.myrecipeapp

sealed class Screen(val route: String) {
    //sealed class implies inheritance is not allowed. This class cannot be extended.
    object RecipeScreen:Screen("recipescreen")
    object DetailScreen:Screen("detailscreen")
}