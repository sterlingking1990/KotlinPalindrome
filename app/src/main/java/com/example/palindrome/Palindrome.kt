package com.example.palindrome

fun main(args:Array<String>){
    print(checkPalindrome("Was it a cat I saw?"))

}

fun checkPalindrome(wordString:String): Boolean {
    //keep only letter or digit in the string and take out all symbols
    val wordStrFiltered=wordString.toLowerCase().filter { it.isLetterOrDigit() }
    var counter=0
    //loop through in reverse down to the middle of the string
    for (i in wordStrFiltered.length-1 downTo wordStrFiltered.length/2){
        //get the position of the
        var frontCount=(wordStrFiltered.length-1)-i
        //compare characters from start of string to end of string
        if (wordStrFiltered[frontCount]==wordStrFiltered[i]){
            //keep count if equal- counter keeps record of when char from start matches character from end
            //each times its not equal counter becomes 0
            counter+=1
        }
        else{
            //return count to 0 if not equal
            counter=0
        }
    }
    //it becomes palindrome if the count of similar character from start is same from end uptil the middle

    //if string length is even and its palindrome then check that counter is equal to average length of the string

    return if(wordStrFiltered.length%2==0) {
        counter==wordStrFiltered.length/2

    } else{
        //string length is odd and it is palindrome check that counter-1 is equal to aveerage of string length
        counter-1==wordStrFiltered.length/2
    }
}
