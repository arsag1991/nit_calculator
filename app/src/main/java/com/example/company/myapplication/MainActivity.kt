package com.example.company.myapplication

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.company.myapplication.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException
import java.util.*
import kotlin.coroutines.EmptyCoroutineContext.plus



class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bPlus.setOnClickListener { result(bPlus) }
        bMinus.setOnClickListener { result(bMinus) }
        bMult.setOnClickListener { result(bMult) }
        bDiv.setOnClickListener { result(bDiv) }
    }
    fun result (v: View){
        val arg1 :Int = edName1.getText().toString().toInt()
        val arg2 :Int = edName2.getText().toString().toInt()

            when (v) {
                bPlus -> try {answer.text = (arg1 + arg2).toString()}
                         catch (e: Exception){answer.text = "Input Error"}
                bMinus -> try {(arg1 - arg2).toString()}
                         catch (e: Exception){answer.text = "Input Error"}
                bMult -> try {answer.text = (arg1 * arg2).toString()}
                         catch (e: Exception){answer.text = "Input Error"}
                bDiv -> try {answer.text = (arg1 / arg2).toString()}
                         catch (e: Exception){answer.text = "Input Error"}
            }
        }
    }

