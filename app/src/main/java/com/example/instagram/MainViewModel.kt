package com.example.instagram

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.business.model.UserPost
import com.example.business.processing.UserPostMapper

class MainViewModel : ViewModel() {

    val userPostLiveData = MutableLiveData<UserPost>()
    val name = MutableLiveData("apasa")

    fun getUserPost() {
        val userPost = UserPostMapper.getUserPostMapper()
        userPostLiveData.value = userPost
    }

    fun modifyLiveData() {
        userPostLiveData.value = UserPost("salut")
        name.value = "Andi"
    }
}