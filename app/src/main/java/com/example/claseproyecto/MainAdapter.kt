package com.example.claseproyecto

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.claseproyecto.databinding.ItemPokemonBinding
import org.json.JSONArray
import org.json.JSONObject

class MainAdapter (private val pokemon: JSONArray): RecyclerView.Adapter<MainAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        val binding= ItemPokemonBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.render(pokemon[position] as JSONObject)
    }

    override fun getItemCount(): Int = pokemon.length()

    class MainHolder(val binding: ItemPokemonBinding): RecyclerView.ViewHolder(binding.root){
fun render (pokemon: JSONObject){
    binding.Nombre.setText(pokemon.getString("name"))
    binding.Avatar.setImageResource(R.drawable.pokemon_avatar)
}
    }
}