package com.mursyidul.task1mvp.presenter.faktorial

import androidx.core.util.rangeTo
import com.mursyidul.task1mvp.model.faktorial.HasilFaktorial
import java.math.BigInteger

class FaktorialPresenter(var ppViewFaktorial :FaktorialInterface) {

    fun hitungFaktorial(inputAngkaFakktorial : String)
    {
        val cinputangkafaktorial = inputAngkaFakktorial.toDouble()
        var factorial = BigInteger.ONE
        for (i in 1..(cinputangkafaktorial.toInt()))
        {
             //factorial *=i.toLong()
            factorial = factorial.multiply(BigInteger.valueOf(cinputangkafaktorial.toLong()))
        }
        val hasil = HasilFaktorial()
        hasil.hasil = factorial
        ppViewFaktorial.hasilFaktorial(hasil)
    }

}