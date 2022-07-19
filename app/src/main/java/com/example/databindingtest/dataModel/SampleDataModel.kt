package com.example.databindingtest.dataModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SampleDataModel : ViewModel() {

    private val _textCount = MutableLiveData(0)
    var likes: LiveData<Int> = _textCount

    fun onAdd() {
        _textCount.value = (_textCount.value ?: 0) + 1
    }

    fun reMove() {
        _textCount.value = (_textCount.value ?: 0) - 1
    }
}