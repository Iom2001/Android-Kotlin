package com.example.androidkotlin.models

class LateClick {
    var text1: String
    var txtFile: String? = null
    var tr: Int? = 0

    constructor(text: String, tr: Int) {
        this.text1 = text
        this.tr = tr
    }

    constructor(text: String, txtFile: String) {
        this.text1 = text
        this.txtFile = txtFile
    }


}