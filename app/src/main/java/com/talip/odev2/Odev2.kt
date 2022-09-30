package com.talip.odev2

class Odev2 {

    fun soru1 (cel: Double): Double {
        return (cel * 1.8) + 32

    }

    fun soru2 (width:Double,height:Double) {
        println("Alan: ${((width*2)+(height*2))}")
    }

    fun soru3 (sayi: Int): Int {
        var result = 1
        if (sayi == 1){
            result = 1
        }else{
            for (i in 1..sayi) {
                result *= i
            }
        }

        return result
    }

    fun soru4 (kelime : String, harf : String){
        var result = 0
        kelime.forEach {
            if(it.toString() == harf){
                result ++
            }
        }
        println("$kelime kelimesinde $harf harfinden $result tane vardır")
    }


    //KELİMENİN İÇİNDE GEÇEN HARFLERİN O KELİME İÇİNDE TOPLAM KAÇ TANE GEÇTİĞİNİ GÖSTERMEK İSTERSEK
/*  fun soru4 (str:String){
        var set = mutableSetOf<Char>()
        var map = mutableMapOf<Char,Int>()
        str.forEach {
            set.add(it)
        }

        for (i in set){
            var top =0
            for ( x in str){

                if(x == i){
                    top ++

                }
            }

            map.put(i,top)
        }

        for ((x,y) in map){
            println("$x harfi $y tane vardır")
        }

         */

    fun soru5 (kenarSayisi : Int) : Int{
        return (kenarSayisi-2)*180
    }

    fun soru6(gunSayisi : Int) : Int{
        var result = 0

        if(gunSayisi <=20){
            result = gunSayisi*8*10
        }else{
            var mesai = gunSayisi-20
            result = (20*8*10)+(mesai*20*8)
        }

        return result
        
    }

    fun soru7(kota:Int):Int{
        var result = 0
        if(kota <=50){
            result = 100
        }else{
            var asim = kota -50
            result = 100 +(asim*4)
        }
        return result
    }


}
