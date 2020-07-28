package com.example.palindrome

fun main(args:Array<String>){
    print(checkPalindrome("Was it a cat I saw?"))

}

fun checkPalindrome(wordString:String): Boolean {
    //keep only letter or digit in the string and take out all symbols

    val wordStrFiltered=wordString.toLowerCase().filter { it.isLetterOrDigit() }
    var counter=0
    for (i in wordStrFiltered.length-1 downTo wordStrFiltered.length/2){
        var frontCount=(wordStrFiltered.length-1)-i
        if (wordStrFiltered[frontCount]==wordStrFiltered[i]){
            counter+=1
        }
        else{
            counter=0
        }
    }

    return if(wordStrFiltered.length%2==0) {
        counter==wordStrFiltered.length/2

    } else{
        counter-1==wordStrFiltered.length/2
    }
}
