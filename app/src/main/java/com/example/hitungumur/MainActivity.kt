package com.example.hitungumur

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.setOnClickListener {
            //declare edit text
            var tahunLahir = etInputNomor.text.toString()

            //get tahun now
            var tahun : Int = Calendar.getInstance().get(Calendar.YEAR)

            //set Age year now
            //var umur = tahun - tahunLahir

            //hasil
            var umur: Int = 0
            if(tahunLahir.toInt() == tahun){
                tvUmur.text = "Usia $umur tahun"
            }
            if(tahunLahir.toIntOrNull() != null){
                umur = tahun - tahunLahir.toInt()
               tvUmur.text = "Umur = $umur tahun"
            } else{
                tvUmur.text = "Tahun tidak valid"
            }

        }
    }
}
