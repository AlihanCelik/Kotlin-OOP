package com.example.oopkotlin

class kullanici :insan {
    var isim : String? = null
    var yas:Int? = null

    constructor(isim:String,yas:Int){
        this.isim=isim
        this.yas=yas
        println("constructor çalıştı")

    }
    init {
        println("init cagrıldı") //ilk bu değer döner.
    }

}