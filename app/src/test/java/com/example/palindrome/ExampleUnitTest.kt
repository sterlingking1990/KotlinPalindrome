package com.example.palindrome

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
//    @Test
//    fun addition_isCorrect() {
//        assertEquals(4, 2 + 2)
//    }

    @Test
    fun first_letterCapitalIsPalindrome(){
        assertEquals(checkPalindrome("Madam"),true)
    }

    @Test
    fun all_lettersInStringCapitalIsPalindrome(){
        assertEquals(checkPalindrome("MALLAM"),true)
    }

    @Test
    fun check_StringWithNumbersIsPalindrome(){
        assertEquals(checkPalindrome("MA3AM"),true)
    }

    @Test
    fun  check_NumeralStringIsPalindrome(){
        assertEquals(checkPalindrome("2121212"),true)
    }

    @Test
    fun some_upperCaseSomeLowerCaseIsPalindrome(){
        assertEquals(checkPalindrome("MalAm"),true)
    }

    @Test
    fun check_twoPalindromeWordsIsNotPalindrome(){
        assertEquals(checkPalindrome("Madam Mallam"),false)
    }

    @Test
    fun sentence_withPunctuationIsPalindrome(){
        assertEquals(checkPalindrome("Eva, can I see bees in a cave?"),true)
    }

    @Test
    fun sentence_withPalindromeNumbersNotPalindrome(){
        assertEquals(checkPalindrome("Eva, can I see 333 in a cave?"),false)
    }

    @Test
    fun numeral_stringWithSpacesIsPalindrome(){
        assertEquals(checkPalindrome("321 909 123"),true)
    }

    @Test
    fun numeral_stringWithSpecialCharactersIsPalindrome(){
        assertEquals(checkPalindrome("*#555*606*555#"),true)
    }


}