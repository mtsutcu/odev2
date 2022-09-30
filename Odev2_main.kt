package com.talip.odev2

fun main() {
    val odev2 = Odev2()

    println("Çıkış için e'ye basabilirsiniz.")


    while (true){
        println("Hangi soruyu seçmek istediğinizi girin:")
        var choice = readLine()
        when(choice){
            "1"->{
                println("Fahrenhiet'e dönüştürmek istediğiniz dereceyi girin:")
                var d = readLine()

                if(d?.toDoubleOrNull() != null){
                    println("Sonuç: ${odev2.soru1(d.toDouble())}")
                }
                else{
                    println("Hata oluştu..")
                    continue
                }
            }
            "2"->{
                println("Diktörgenin kısa kenarını giriniz:")
                var width = readLine()
                println("Diktörgenin uzun kenarını giriniz:")
                var height = readLine()
                if(width?.toDoubleOrNull() != null && height?.toDoubleOrNull() != null){
                    odev2.soru2(width.toDouble(),height.toDouble())
                }
                else{
                    println("Hata oluştu..")
                    continue
                }
            }
            "3"->{
                println("Sayi giriniz:")
                var s = readLine()
                if(s?.toIntOrNull() != null){
                    println("Faktoriyel: ${odev2.soru3(s.toInt())}")
                } else{
                    println("Hata oluştu..")
                    continue
                }
            }
            "4"->{
                println("Kelime giriniz:")
                var word = readLine()
                println("Harf giriniz")
                var ch = readLine()
                if(word != null && ch != null){
                    odev2.soru4(word,ch)
                }  else{
                    println("Hata oluştu..")
                    continue
                }
            }
            "5"->{
                println("Kenar sayısını giriniz:")
                var s = readLine()
                if (s?.toIntOrNull() != null){
                    println("İç açılar toplamı: ${odev2.soru5(s.toInt())}")
                }  else{
                    println("Hata oluştu..")
                    continue
                }
            }
            "6"->{
                println("Çalışılan gün sayisini giriniz:")
                var g = readLine()
                if(g?.toIntOrNull() != null){
                    println("Hesaplanan maaş: ${odev2.soru6(g.toInt())}")
                } else{
                    println("Hata oluştu..")
                    continue
                }

            }
            "7"->{
                println("Kota miktarını giriniz:")
                var k = readLine()
                if(k?.toIntOrNull() != null){
                    println("Hesaplanan ücret: ${odev2.soru7(k.toInt())}")
                }   else{
                    println("Hata oluştu..")
                    continue
                }
            }
            "e"->break
        }
    }

}