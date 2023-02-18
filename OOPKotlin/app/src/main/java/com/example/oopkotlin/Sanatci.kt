package com.example.oopkotlin

open class Sanatci(isim:String,yas:Int,meslek:String) {      // inheritance kalıtım almak istediğimiz sinıfın başına open yazarız

    //Encapsulation
    var isim:String="Alihan"
        private set
        get                                               // diğer bir classın içinde isim değiştiirilemez ama çağrılır
    private var yas:Int= 19                               // diğer classtan ulaşılamaz
    var meslek:String="Bilgisayar Mühendisi"              // eğer yazmassak başka clasta çağıramayız

}