package com.example.tarea1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lists, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        val editText = view.findViewById<EditText>(R.id.editText)
        val btnAdd = view.findViewById<Button>(R.id.btnAdd)

        val dataset = mutableListOf<String>()
        val adapter = CustomAdapter(dataset)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        btnAdd.setOnClickListener {
            val txt = editText.text.toString()
            if (txt.isNotEmpty()) {
                dataset.add(txt)
                adapter.notifyItemInserted(dataset.size - 1)
                editText.text.clear()
                Toast.makeText(requireContext(), "Agregaste un elemento", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Ingresa un texto", Toast.LENGTH_SHORT).show()
            }
        }


    }
}

class CustomAdapter(private val dataSet: MutableList<String>) :
    RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.lista, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataSet[position]

        holder.textView.setOnClickListener {
            Toast.makeText(holder.textView.context, "Has seleccionado: ${dataSet[position]}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount() = dataSet.size
}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val textView: TextView = view.findViewById(R.id.txtList)
}
