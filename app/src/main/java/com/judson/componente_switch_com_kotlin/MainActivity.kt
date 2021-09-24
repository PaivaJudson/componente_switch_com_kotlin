package com.judson.componente_switch_com_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sw_switch.setOnCheckedChangeListener { buttonView, isChecked -> isChecked
            var ligadoOuDesligado = ""
            if (isChecked){
                ligadoOuDesligado = "Ligado"
            }else{
                ligadoOuDesligado = "Desligado"
            }
            txt_status.text = ligadoOuDesligado
        }
    }
}