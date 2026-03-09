package com.example.tarea1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TextFieldsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_text_fields, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editNombre = view.findViewById<EditText>(R.id.editNombre)
        val editEmail = view.findViewById<EditText>(R.id.editEmail)
        val editTelefono = view.findViewById<EditText>(R.id.editTelefono)
        val editPassword = view.findViewById<EditText>(R.id.editPassword)
        val editNumero = view.findViewById<EditText>(R.id.editNumero)
        val editComentarios = view.findViewById<EditText>(R.id.editComentarios)
        val txtResultado = view.findViewById<TextView>(R.id.txtResultado)
        val btnMostrar = view.findViewById<Button>(R.id.btnMostrar)

        btnMostrar.setOnClickListener {
            val nombre = editNombre.text.toString()
            val email = editEmail.text.toString()
            val telefono = editTelefono.text.toString()
            val password = editPassword.text.toString()
            val numero = editNumero.text.toString()
            val comentarios = editComentarios.text.toString()

            if (nombre.isEmpty() && email.isEmpty() && telefono.isEmpty() &&
                password.isEmpty() && numero.isEmpty() && comentarios.isEmpty()) {
                txtResultado.text = "No se ha ingresado ningún dato"
            } else {
                val sb = StringBuilder("Datos ingresados:\n")
                if (nombre.isNotEmpty()) sb.append("• Nombre: $nombre\n")
                if (email.isNotEmpty()) sb.append("• Email: $email\n")
                if (telefono.isNotEmpty()) sb.append("• Teléfono: $telefono\n")
                if (password.isNotEmpty()) sb.append("• Contraseña: ${"*".repeat(password.length)}\n")
                if (numero.isNotEmpty()) sb.append("• Número: $numero\n")
                if (comentarios.isNotEmpty()) sb.append("• Comentarios:\n $comentarios")
                txtResultado.text = sb.toString()
            }
        }
    }
}