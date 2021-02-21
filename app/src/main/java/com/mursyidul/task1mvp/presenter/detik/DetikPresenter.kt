package com.mursyidul.task1mvp.presenter.detik

import com.mursyidul.task1mvp.model.detik.HasilKonversi

class DetikPresenter(var ppViewDetik :DetikInterface) {
     fun conversi(detik : String)
     {
         val cdetik = detik.toInt()
         val cjam = cdetik/3600
         val cdetik2 = cdetik -( 3600 *cjam)
         val cmenit = cdetik2/60
         val cdetik3 = cdetik2-(60*cmenit)

         val convert = HasilKonversi()
         convert.jam = cjam
         convert.menit = cmenit
         convert.detik = cdetik3

         ppViewDetik.hasilConversi(convert)
     }
}