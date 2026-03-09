package com.example.tarea1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        val adapter = MyPageAdapter(this)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when(position) {
                0 -> "TextFields"
                1 -> "Botones"
                2 -> "Elementos de Selección"
                3 -> "Listas"
                else -> "Elementos de Información"
            }
            tab.setIcon(when(position) {
                0 -> android.R.drawable.ic_menu_edit
                1 -> android.R.drawable.ic_menu_send
                2 -> android.R.drawable.ic_menu_agenda
                3 -> android.R.drawable.ic_menu_sort_by_size
                else -> android.R.drawable.ic_menu_info_details
            })
        }.attach()

    }
}

class MyPageAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 5

    override fun createFragment(p0: Int): Fragment {
        return when(p0) {
            0 -> TextFieldsFragment()
            1 -> ButtonsFragment()
            2 -> SelectionElementsFragment()
            3 -> ListsFragment()
            else -> InformationFragment()
        }
    }
}