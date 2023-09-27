package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button0.setOnClickListener { setTextFields("0") }
        button1.setOnClickListener { setTextFields("1") }
        button2.setOnClickListener { setTextFields("2") }
        button3.setOnClickListener { setTextFields("3") }
        button4.setOnClickListener { setTextFields("4") }
        button5.setOnClickListener { setTextFields("5") }
        button6.setOnClickListener { setTextFields("6") }
        button7.setOnClickListener { setTextFields("7") }
        button8.setOnClickListener { setTextFields("8") }
        button9.setOnClickListener { setTextFields("9") }
        buttondel.setOnClickListener { setTextFields("/") }
        buttonminus.setOnClickListener { setTextFields("-") }
        buttonplus.setOnClickListener { setTextFields("+") }
        buttonumnozh.setOnClickListener { setTextFields("*") }

        buttoncell.setOnClickListener { textView.text = "" }

        buttonravno.setOnClickListener {
        val ex = ExpressionBuilder(textView.text.toString()).build()
          val resultat = ex.evaluate()
            textView.setText(resultat.toString())
        }

    }
    fun setTextFields(string: String){
    textView.append(string)

    }

}