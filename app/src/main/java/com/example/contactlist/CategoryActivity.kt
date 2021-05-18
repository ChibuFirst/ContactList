package com.example.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.contactlist.databinding.ActivityCategoryBinding

class CategoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupCategory(binding)
    }

    private fun setupCategory(binding: ActivityCategoryBinding) {
        val categories = listOf(
            Category("F", "Family"),
            Category("B", "Business"),
            Category("F", "Friends"),
            Category("C", "Colleagues"),
            Category("T", "Tutors"),
            Category("P", "Private"),
            Category("V", "VIP")
        )
        val adapter = CategoryAdapter(categories)
        binding.categoryRv.adapter = adapter
        binding.categoryRv.layoutManager = GridLayoutManager(this, 2)
        binding.categoryRv.setHasFixedSize(true)
    }
}