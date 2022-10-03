package com.bignerdranch.android.themostdifficultapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bignerdranch.android.themostdifficultapplication.databinding.ActivityMainBinding

private const val ARG_COUNTER = "com.bignerdranch.android.themostdifficultapplication.arg_counter"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        counter = savedInstanceState?.getInt(ARG_COUNTER) ?: 0

        binding.counterTextView.text = counter.toString()

        binding.incrementButton.setOnClickListener { onCLickIncrementButton() }
        binding.clearCounterButton.setOnClickListener { onClickClearCounterButton() }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(ARG_COUNTER, counter)
    }

    private fun onCLickIncrementButton() {
        counter++
        binding.counterTextView.text = counter.toString()
    }

    private fun onClickClearCounterButton() {
        counter = 0
        binding.counterTextView.text = counter.toString()
    }

}