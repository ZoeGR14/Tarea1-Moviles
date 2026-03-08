package com.example.tarea1

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.ScrollView
import android.widget.Toast
import android.widget.ToggleButton
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.google.android.material.switchmaterial.SwitchMaterial

class SelectionElementsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selection_elements, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val chipGroup = view.findViewById<ChipGroup>(R.id.chipGroup)
        val btnChip = view.findViewById<Button>(R.id.btnChip)

        val check1 = view.findViewById<CheckBox>(R.id.checkBox1)
        val check2 = view.findViewById<CheckBox>(R.id.checkBox2)
        val check3 = view.findViewById<CheckBox>(R.id.checkBox3)
        val btnCheck = view.findViewById<Button>(R.id.btnCheck)

        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup)
        val btnRadio = view.findViewById<Button>(R.id.btnRadio)

        val toggleButton = view.findViewById<ToggleButton>(R.id.toggleButton)
        val layout = view.findViewById<ScrollView>(R.id.scrollView)

        val switch1 = view.findViewById<SwitchMaterial>(R.id.switch1)
        val switch2 = view.findViewById<SwitchMaterial>(R.id.switch2)
        val btnSwitch = view.findViewById<Button>(R.id.btnSwitch)


        btnChip.setOnClickListener {
            val checkedChips = chipGroup.getCheckedChipIds()
            if (checkedChips.isEmpty()) {
                Toast.makeText(requireContext(), "No se han seleccionado Chips", Toast.LENGTH_SHORT)
                    .show()
            } else {
                var text = "Chips seleccionados: "
                for (id in checkedChips) {
                    val chip = chipGroup.findViewById<Chip>(id)
                    text = text + chip.text + ", "
                }
                Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()
            }
        }

        btnCheck.setOnClickListener {
            var text = "Opciones seleccionadas: "
            var bool = false
            if (check1.isChecked) {
                text = text + check1.text + ", "
                bool = true
            }
            if (check2.isChecked) {
                text = text + check2.text + ", "
                bool = true
            }
            if (check3.isChecked) {
                text = text + check3.text
                bool = true
            }

            if (bool === false) {
                Toast.makeText(
                    requireContext(),
                    "No se han seleccionado opciones",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()

            }
        }

        btnRadio.setOnClickListener {
            val selectedId = radioGroup.checkedRadioButtonId
            val radio = view.findViewById<RadioButton>(selectedId)
            if (radio == null) {
                Toast.makeText(requireContext(), "No se ha seleccionado ninguna opción", Toast.LENGTH_SHORT).show() } else {
                Toast.makeText(
                    requireContext(),
                    "Opción seleccionada: " + radio.text,
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        toggleButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                layout.setBackgroundColor(Color.parseColor("#E5E6C9"))
            } else {
                layout.setBackgroundColor(Color.parseColor("#F8F8EC"))

            }
        }

        btnSwitch.setOnClickListener {
            var text = "Opciones seleccionadas: "
            var bool = false
            if (switch1.isChecked) {
                text = text + switch1.text + ", "
                bool = true
            }
            if (switch2.isChecked) {
                text = text + switch2.text
                bool = true
            }

            if (bool === false) {
                Toast.makeText(
                    requireContext(),
                    "No se han seleccionado opciones",
                    Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()
            }
        }
    }
}