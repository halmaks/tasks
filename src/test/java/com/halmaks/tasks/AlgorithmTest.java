package com.halmaks.tasks;

import org.junit.jupiter.api.Test;

import static com.halmaks.tasks.Algorithm.*;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {

    @Test
    void stringPalindromeTest1() {
        assertEquals(false, stringPalindrome(
                "checkmy"
        ));
    }
    @Test
    void stringPalindromeTest2() {
        assertEquals(true, stringPalindrome(
                "c"
        ));
    }
    @Test
    void stringPalindromeTest3() {
        assertEquals(true, stringPalindrome(
                "checkkcehc"
        ));
    }
    @Test
    void stringPalindromeTest4() {
        assertEquals(true, stringPalindrome(
                "!!!%2nan%2!!!"
        ));
    }

    @Test
    void integerPalindromeTest1() {
        assertEquals(true, integerPalindrome(
                117949711
        ));
    }

    @Test
    void integerPalindromeTest2() {
        assertEquals(false, integerPalindrome(
                333949711
        ));
    }

    @Test
    void integerPalindromeTest3() {
        assertEquals(true, integerPalindrome(
                1
        ));
    }

    @Test
    void armstrongNumber() {
    }

    @Test
    void reverseAStringTest1() {
        assertEquals("ymesrever", reverseAString(
                "reversemy"
        ));
    }
    @Test
    void reverseAStringTest2() {
        assertEquals("Hi!", reverseAString(
                "!iH"
        ));
    }
    @Test
    void reverseAStringTest3() {
        assertEquals("Oh22111aaa%%%", reverseAString(
                "%%%aaa11122hO"
        ));
    }

    @Test
    void theSquareRootOfANumberTest1() {
        assertEquals(3.90,
                theSquareRootOfANumber(100),
                0.01
        );
    }

    @Test
    void theSquareRootOfANumberTwoTest1() {

    }

    @Test
    void stringAnagramTest1() {
        assertEquals(true,stringAnagram (
                "something", "methingso"
        ));
    }

    @Test
    void stringAnagramTest2() {
        assertEquals(false,stringAnagram (
                "something", "mebodyso"
        ));
    }
}