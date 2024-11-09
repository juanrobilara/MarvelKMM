package com.unlam.marvel.android.ui.screens

import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.example.marvel.android.databinding.ListItemCharacterBinding
import com.unlam.marvel.domain.models.Character

class CharacterViewHolder(private val binding: ListItemCharacterBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(character: Character) {
        binding.name.text = character.name
        binding.description.text = character.description

        if (character.thumbnailUrl.isNotEmpty()) {
            Picasso.get()
                .load(character.thumbnailUrl)
                .into(binding.image)
        } else {
            binding.image.setImageURI(null)
        }
    }

}