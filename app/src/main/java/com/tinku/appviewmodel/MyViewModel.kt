package com.tinku.appviewmodel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel(val defValue:Int) : ViewModel() {

    private var _count = defValue

    var count: MutableLiveData<Int> = MutableLiveData(_count)

    fun increment() {
        _count++
        count.value = _count
    }
    fun decrement() {
        _count--
        count.value = _count
    }
}