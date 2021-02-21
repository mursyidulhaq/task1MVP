package com.mursyidul.task1mvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mursyidul.task1mvp.R
import com.mursyidul.task1mvp.model.pangkat.Hasil
import com.mursyidul.task1mvp.presenter.pangkat.PangkatInterface
import com.mursyidul.task1mvp.presenter.pangkat.PangkatPresenter
import kotlinx.android.synthetic.main.activity_pangkat.*

class PangkatActivity : AppCompatActivity(), PangkatInterface {

    private var presenter :PangkatPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pangkat)

        presenter = PangkatPresenter(this)
        hitung.setOnClickListener {
            val angka = inputangka.text.toString()
            val pangkat = inputpangkat.text.toString()
            if (angka.isEmpty())
            {
                inputangka.error = "angka tidak boleh kosong"
            }
            else if (pangkat.isEmpty())
            {
                inputpangkat.error = "pangkat tidak boleh kosong"
            }else
            {
                presenter?.hitung(angka,pangkat)
            }


        }

    }

    override fun hasilhirung(hasil: Hasil) {
        txthasil.setText(hasil.hasilpangkat.toString())
    }
}