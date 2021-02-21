package com.mursyidul.task1mvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mursyidul.task1mvp.R
import com.mursyidul.task1mvp.model.faktorial.HasilFaktorial
import com.mursyidul.task1mvp.presenter.faktorial.FaktorialInterface
import com.mursyidul.task1mvp.presenter.faktorial.FaktorialPresenter
import kotlinx.android.synthetic.main.activity_faktorial.*

class FaktorialActivity : AppCompatActivity(), FaktorialInterface {
    private var presenter : FaktorialPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faktorial)

        presenter = FaktorialPresenter(this)
        faktorial.setOnClickListener {

            val inputangka = inputangkafaktorial.text.toString()
            if (inputangka.isEmpty())
            {
                inputangkafaktorial.error = "data harus di inputkan"
            }else
            {
                presenter?.hitungFaktorial(inputangka)
            }

        }
    }

    override fun hasilFaktorial(hasil: HasilFaktorial) {
        txthasilfaktorial.setText(hasil.hasil.toString())
    }
}