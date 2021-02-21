package com.mursyidul.task1mvp.presenter.pangkat

import com.mursyidul.task1mvp.model.pangkat.Hasil

class PangkatPresenter(var ppViewPangkat : PangkatInterface) {
    fun hitung(inputanka :String, inputpangkat :String)
    {
        val cinputangka = inputanka.toInt()
        val cinputpangkat = inputpangkat.toInt()
        val total = Math.pow(cinputangka.toDouble(), cinputpangkat.toDouble())

        val hasil = Hasil()
        hasil.hasilpangkat = total

        ppViewPangkat.hasilhirung(hasil)

    }

}