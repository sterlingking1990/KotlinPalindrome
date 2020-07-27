package com.example.palindrome

fun main(args:Array<String>){


}

fun checkPalindrome(wordString:String){
    //keep only letter or digit in the string and take out all symbols
    val wordStrFiltered=wordString.filter { it.isLetterOrDigit() }
    var counter=0
    for (i in wordStrFiltered.length-1 downTo wordStrFiltered.length/2){
        var frontCount=(wordString.length-1)-i
        if (wordStrFiltered[frontCount]==wordString[i]){
            counter+=1
        }
        else{
            counter=0
        }
    }
}
