package com.example.tarea1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ButtonsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buttons, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val btnNormal = view.findViewById<Button>(R.id.btnNormal)
        val imgBtn = view.findViewById<ImageButton>(R.id.imgBtn)
        val fab = view.findViewById<FloatingActionButton>(R.id.fab)

        btnNormal.setOnClickListener {
            Toast.makeText(requireContext(), "Has presionado un Boton Normal", Toast.LENGTH_SHORT).show()
        }

        imgBtn.setOnClickListener {
            Toast.makeText(requireContext(), "Has presionado un ImageButton (Icono)", Toast.LENGTH_SHORT).show()
        }

        fab.setOnClickListener {
            Toast.makeText(requireContext(), "Has presionado un Floating Action Button", Toast.LENGTH_SHORT).show()
        }


    }

}