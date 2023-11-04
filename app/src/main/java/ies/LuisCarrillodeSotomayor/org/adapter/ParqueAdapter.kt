package ies.LuisCarrillodeSotomayor.org.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ies.LuisCarrillodeSotomayor.org.Parque
import ies.LuisCarrillodeSotomayor.org.R


class ParqueAdapter(private val listparque:List<Parque>): RecyclerView.Adapter<ParqueViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParqueViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.listaparques, parent, false)
        return ParqueViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: ParqueViewHolder, position: Int) {
        val item = listparque[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return listparque.size
    }

}
