package com.example.gaadsmobile.vmodels

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

class BadgeViewModel {
    companion object {
        @JvmStatic
        @BindingAdapter("bind:badgeUrl")
        fun loadBadge(view: ImageView, badgeUrl: String?) {
            Picasso.get()
                .load(badgeUrl)
                .into(view)
        }
    }
}