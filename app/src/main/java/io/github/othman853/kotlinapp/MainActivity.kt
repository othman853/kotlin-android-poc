package io.github.othman853.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retro = Retrofit.Builder().build()

        val lista = findViewById(R.id.lista) as ListView

        Toast.makeText(this, "asdadasd", Toast.LENGTH_SHORT).show()

        lista.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listOf("a", "b", "c"))

        lista.setOnItemClickListener { adapterView, view, i, l -> Toast.makeText(this, "Oi", Toast.LENGTH_SHORT).show() }

    }

}
