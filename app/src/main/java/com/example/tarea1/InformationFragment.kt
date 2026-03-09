package com.example.tarea1

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast

class InformationFragment : Fragment() {

    private var isDownloading = false
    private val handler = Handler(Looper.getMainLooper())
    private lateinit var runnable: Runnable

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_information, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val progressBar = view.findViewById<ProgressBar>(R.id.progressBar)
        val btnDescarga = view.findViewById<Button>(R.id.btnDescarga)
        val txtProgress = view.findViewById<TextView>(R.id.txtProgess)

        btnDescarga.setOnClickListener {
            isDownloading = true
            btnDescarga.isEnabled = false
            btnDescarga.text = "Descargando..."
            var progreso = 0
            progressBar.progress = 0
            txtProgress.text = "Progreso: 0%"

            runnable = object : Runnable {
                override fun run() {
                    if (progreso < 100) {
                        progreso += 5
                        progressBar.setProgress(progreso, true)
                        txtProgress.text = "Progreso: $progreso%"

                        val delay = (200..800).random().toLong()
                        handler.postDelayed(this, delay)
                    } else {
                        isDownloading = false
                        btnDescarga.isEnabled = true
                        btnDescarga.text = "Simular Descarga"
                        Toast.makeText(requireContext(), "¡Descarga completada!", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            handler.postDelayed(runnable, 500)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        if (::runnable.isInitialized) {
            handler.removeCallbacks(runnable)
        }
    }
}