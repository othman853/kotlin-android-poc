package io.github.othman853.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = findViewById(R.id.lista) as ListView
        val addItemBtn = findViewById(R.id.btn_add_item) as Button
        val addItemEditText = findViewById(R.id.etxt_item) as EditText

        lista.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ArrayList<String>())

        lista.setOnItemClickListener { adapterView, view, i, l -> Toast.makeText(this, "Oi", Toast.LENGTH_SHORT).show() }

        addItemBtn.setOnClickListener { view -> (lista.adapter as ArrayAdapter<String>).add(addItemEditText.text.toString()) }
    }

}
