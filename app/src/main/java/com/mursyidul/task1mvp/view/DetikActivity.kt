package com.mursyidul.task1mvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mursyidul.task1mvp.R
import com.mursyidul.task1mvp.model.detik.HasilKonversi
import com.mursyidul.task1mvp.presenter.detik.DetikInterface
import com.mursyidul.task1mvp.presenter.detik.DetikPresenter
import com.mursyidul.task1mvp.presenter.pangkat.PangkatPresenter
import kotlinx.android.synthetic.main.activity_detik.*

class DetikActivity : AppCompatActivity(), DetikInterface {

    private var presenter : DetikPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detik)
        presenter = DetikPresenter(this)
        convert.setOnClickListener {
            val detik = inputdetik.text.toString()
            if (detik.isEmpty())
            {
                inputdetik.error = "data tidak boleh kosong"
            }else
            {
                presenter?.conversi(detik)
            }
        }
    }

    override fun hasilConversi(hasil: HasilKonversi) {
        jam.setText(hasil.jam.toString()+"Jam")
        menit.setText(hasil.menit.toString()+"Menit")
        detik.setText(hasil.detik.toString()+"Detik")

    }
}