package com.example.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("-------------Sınıflar-------------")
        var kullanici=kullanici("Alihan",19)
        var kullanici2=kullanici("Nisa",14)

        println("-------------Encapsulation-------------")
        var sanatci=Sanatci("Ali",20,"Pc Eng")
        println(sanatci.isim)
        // println(sanatcı.yas) eror verir
        println(sanatci.meslek)

        println("-------------Inheritance-------------") // miras alma
        val mehmet=ozelSanatci("Ali",19,"Pc")
        //mehmet.yas    ulaşılamaz private
        mehmet.sarkiSoyle()

        println("-------------Polymorphism-------------")
        // statik Polymorphism
        val islem=islemler()
        println(islem.carpma())
        println(islem.carpma(5,6))
        println(islem.carpma(5,6,7))

        // dinamik Polymorphism
        val kedi=hayvan()
        kedi.sesCıkar()             // hayvan ses çıkarıyor
        val kopek=köpek()
        kopek.sesCıkar()            // kopek ses çıkarıyor
        kopek.kopekFonksiyonu()     // hayvan ses çıkarıyor

        println("-------------Abstract & İnterface-------------")
        kullanici.insanFonksiyonu()   // ben insanım
                        // abstract sınıfı sayesinde insan fonkisyonub içindeki fonksiyonu kullanıcı yoluyla çağırabilirim
        var gitar = gitar()
        gitar.marka="gitar markası"
        gitar.elektro=true
        gitar.bilgi()
        println(gitar.enst)


        println("-----Lambda Gösterimleri----")
        yadığımıYazdir("test")
        val yazdiğimiYazdirLambda={verilenString:String -> println(verilenString) }   // aşağıdaki yazdığımıYazdir fun ile aynı özelliğe sahip
        yazdiğimiYazdirLambda("teste lambda")
        val carpmaIslemiLambda = {a:Int,b:Int -> a*b}
        println(carpmaIslemiLambda(6,7))
        val carpmaLambdaV2 : (Int,Int)->Int={a,b->a*b}
        println(carpmaLambdaV2(6,7))



    }
    fun yadığımıYazdir(string:String){
            println(string)
    }

}