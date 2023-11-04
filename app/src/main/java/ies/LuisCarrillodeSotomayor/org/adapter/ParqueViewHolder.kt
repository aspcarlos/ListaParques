package ies.LuisCarrillodeSotomayor.org.adapter

import android.content.ClipData.Item
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import ies.LuisCarrillodeSotomayor.org.Parque
import ies.LuisCarrillodeSotomayor.org.databinding.ListaparquesBinding
import android.widget.Toast
import com.bumptech.glide.Glide

class ParqueViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ListaparquesBinding.bind(view)

    fun render(parqueModel: Parque) {
        binding.NombreParque.text = parqueModel.nombre
        binding.DescripcionParque.text = parqueModel.descripcion

        Glide.with(binding.ImagenParque.context).load(parqueModel.foto).into(binding.ImagenParque)

        binding.ImagenParque.setOnClickListener{ Toast.makeText(binding.ImagenParque.context, parqueModel.nombre, Toast.LENGTH_SHORT).show()}
        itemView.setOnClickListener{ Toast.makeText(binding.ImagenParque.context, parqueModel.nombre, Toast.LENGTH_SHORT).show()}

    }

}