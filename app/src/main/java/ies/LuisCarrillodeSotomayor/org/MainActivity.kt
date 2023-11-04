package ies.LuisCarrillodeSotomayor.org

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ies.LuisCarrillodeSotomayor.org.adapter.ParqueAdapter
import ies.LuisCarrillodeSotomayor.org.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Uso del ViewBinding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = LinearLayoutManager(this)

        binding.RecyclerParques.layoutManager = manager
        // Uso del RecyclerView
        binding.RecyclerParques.adapter = ParqueAdapter(ListadoParques.listparque)




    }
}