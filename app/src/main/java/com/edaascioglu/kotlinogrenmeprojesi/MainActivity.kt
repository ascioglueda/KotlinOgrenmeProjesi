package com.edaascioglu.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("merhaba kotlin")
        println(5*10)
        var a=5
        var b=10
        println(a*b)

        var yas=50
        println(yas/5*8)

        val x=5
        val y=20

        println(x+y)
        println(yas*x)

        println("--------Int-------")
        val benimIntegerim: Int
        benimIntegerim=5
        var yeniInteger: Int=20

        println(benimIntegerim/2)

        println("--------Long-------")

        var benimLong: Long=100
        benimLong=30000000000
        println(benimLong)


        println("--------Double&Float-------")
        val pi=3.14
        println(pi*2)
         val floatPi:Float= 3.14f
         println(floatPi *2)
         val yeniDouble=5.0
        println(yeniDouble/2)


        //string -metin
        println("--------String-------")
         val benimString="benim yeni metnim"
        println(benimString.length)
        val isim="Eda"
        val soyisim="Ascioglu"

        val tamisim = isim +" "+ soyisim
        println(tamisim)

        //boolean
        println("--------boolean-------")
        var benimBoolean= true
        benimBoolean = false
        //< -> kücüktür
        //> -> buyuktur
        //!= ->esit degildir
        //<= ->kucuk esittir
        //>= ->buyuk esittir
        //&& -> ve
        // || -> veya

        println(3<5)//true
        println(4!=4)//false

        //veri tipi donusturme
        println("--------donusturme-------")
         var benimInt =10
         val benimLongaCevrilenInt= benimInt.toLong()
        println(benimLongaCevrilenInt)

        var kullaniciGirdisi="50"
        var kullaniciInt=kullaniciGirdisi.toInt()

        println(kullaniciInt /2)

        //Array-Dizi
        println("--------dizi-------")
        val stringOrnegi="Atıl"
        val benimDizim=arrayOf(stringOrnegi,"Samancioglu","Zeynep","Eda","Ascioglu")

         println(benimDizim[0])
         println(benimDizim.get(1))
        println(benimDizim.get(2))
         benimDizim[2]="Mahmut"
        println(benimDizim.get(2))
        benimDizim.set(3,"ayşe")
        println(benimDizim[3])

        val numaraDizisi=doubleArrayOf(1.0,2.0,3.5)
                println(numaraDizisi.get(2))
        val karisikDizi = arrayOf("Atıl",24,16.5,true,false)
             println(karisikDizi.get(3))

        //ArrayList-Listeler
        println("--------ArrayList-------")

        val isimListesi=arrayListOf<String>("Atıl","Zeynep","Osman")
        println(isimListesi.get(1))

        isimListesi.add("Mehmet")
        isimListesi.add("Atlas")
        println(isimListesi.get(4))

        val karisikArrayList=arrayListOf<Any>()
        karisikArrayList.add("Atıl")
        karisikArrayList.add(5)
        karisikArrayList.add(true)

        val intArrayList=ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(20)
        println(intArrayList.get(1))

        //Set
        println("--------Set-------")
        val ornekDizi =arrayOf(7,8,9,9,9,8,10)
        println("index 2: ${ornekDizi[2]}")
        println("index 3: ${ornekDizi[3]}")

        //for each

        val digerSet =HashSet<String>()
        digerSet.add("Atıl")
        digerSet.add("Atıl")
        digerSet.add("Atıl")
        digerSet.add("Samancıoğlu")

        digerSet.forEach{
            println(it)
        }
        //Map
        println("---------Map---------")
        //Anahtar Kelime-Deger(KEY-VALUE PAİRİNG)

        val yemekKaloriMap= hashMapOf<String ,Int>()
           yemekKaloriMap.put("Elma",100)
           yemekKaloriMap.put("Et",300)
           yemekKaloriMap.put("Tavuk",200)

            println(yemekKaloriMap.get("Et"))

        val benimMapim =HashMap<String ,String>()
        benimMapim.put("Örnek","Deger")

        val yeniMap=hashMapOf<String ,Int>("Atıl" to 40,"Örnek" to 50)
        println(yeniMap.get("Örnek"))


        //Matematiksel işlemler
        println("---------Matematiksel işlemler---------")

        var sayi= 8
        println(sayi)
        sayi=sayi+1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        var digerSayi=10
        println(digerSayi> sayi)
        // && ve---|| veya

        //remainder -kalanı bulmak
        println(11%3)
        //If kontrolleri
        println("----------ıf kontrolleri----")

        val skor=10
        if(skor<10) {
            println("Oyunu Kaybettin")
        }
        else if(skor>=20 && skor<20)
        {
            println("skorun 10 ve 20 arasında çok iyi skor aldın")
        }


        //When-Switch

        println("----------When--------")
        var notRakami =3
        var notStringi=""
        when (notRakami){

            0->notStringi="Gecersiz Not"
            1->notStringi="Zayif"
            2->notStringi="Kötü"
            3->notStringi="Orta"
            4->notStringi="İyi"
            else->notStringi="Pek İyi"
        }
        println(notStringi)
        /* if (notRakami==0){
            notString="Gecersiz Not"
        }
        else if(notRakami==1){
            notString="zayif"
        }
        else if(notRakami==2){
          notString="Orta"
        }
        else if(notRakami==3){
            notString="İyi"
        }
        else if(notRakami==4){
            notString="İyi"
       }
        else{
            notString="pek iyi"
        }
        println(notString)*/

       //Döngüler
        val baskaBirDizi = arrayOf(5,10,15,20,25,30)
           for( num in baskaBirDizi){
               println(num/5+3)
           }
    }
}
       //Fonksiyonlar

