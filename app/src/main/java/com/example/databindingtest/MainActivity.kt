package com.example.databindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingtest.dataModel.SampleDataModel
import com.example.databindingtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val dataViewModel by lazy {
        ViewModelProvider(this)[SampleDataModel::class.java]
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val model = ViewModelProvider(this)[SampleDataModel::class.java]

        binding.lifecycleOwner = this
        binding.viewmodel = model
    }
}