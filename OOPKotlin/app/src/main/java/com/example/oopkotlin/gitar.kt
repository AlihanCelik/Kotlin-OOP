package com.example.oopkotlin

class gitar : enstruman { // birden fazla interface ekleyebilirz interface dışında birden fazla ekleme olmaz

    var marka: String?=null
    var elektro:Boolean?=null
    override var enst: String
        get() = "klasik"
        set(value) {}

}