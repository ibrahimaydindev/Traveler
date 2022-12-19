package com.example.hotelapi.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {

    var sayac=0

    val dinlenenveri: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    fun arttir(){
        sayac++
        dinlenenveri.value=sayac
    }


}
