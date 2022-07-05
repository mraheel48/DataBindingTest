package com.example.databindingtest.dataModel

import androidx.lifecycle.ViewModel

class SimpleViewModel : ViewModel() {

    var likes = 0
        private set // This is to prevent external modification of the variable.

    fun onAdd() {
        likes++
    }

    val popularity: Popularity
        get() {
            return when {
                likes > 9 -> Popularity.STAR
                likes > 4 -> Popularity.POPULAR
                else -> Popularity.NORMAL
            }
        }
}

enum class Popularity {
    NORMAL,
    POPULAR,
    STAR
}
