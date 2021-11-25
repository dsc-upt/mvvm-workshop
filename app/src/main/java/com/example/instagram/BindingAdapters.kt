package com.example.instagram

import android.widget.Button
import androidx.databinding.BindingAdapter
import com.example.business.model.UserPost

@BindingAdapter("post", "nameUser", requireAll = true)
fun changeButtonName(view: Button, post: UserPost, nameUser: String ) {
    view.setOnClickListener {
        view.text = post.id + nameUser
    }
}