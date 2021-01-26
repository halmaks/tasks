package com.halmaks.tasks;

public class Algorithm {

    static boolean stringPalindrome (String inputString) {

        char[] data = inputString.toCharArray();
        boolean isPalindrome = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != data[data.length - 1 - i]) {
                break;
            }
            isPalindrome = true;
        }
        return isPalindrome;
    }

    static boolean integerPalindrome (int inputNumber) {
        int k = 0;
        for (int i = 1; inputNumber / i >= 1; i *= 10) {
            k = i;
        }
        boolean isPalindrome = true;

        int curentLeft = 0;
        int curentRigth = 0;

        for (int i = 10; i <= k; i *= 10) {

            curentLeft = (inputNumber % (k * 10)) / k;
            curentRigth = inputNumber % i / (i / 10);
            if (curentLeft != curentRigth) {
                isPalindrome = false;
                break;
            }
            k = k / 10;
        }
        return isPalindrome;
    }



    static void armstrongNumber () {



    }



    static String reverseAString (String inputStr) {
        char inputINChar[] = inputStr.toCharArray();
        char outputStr[] = inputStr.toCharArray();

        for(int i = 0; i < inputINChar.length; i++) {
            outputStr[i] = inputINChar[inputINChar.length - i - 1];
        }
        return String.valueOf(outputStr);
    }

    static double theSquareRootOfANumber (int number) {
        //  100 10
        // 1000 34
        double sqrRoot = 0;
        int numOrder = 0;

        for (int i = 1; i < Integer.MAX_VALUE; i *= 10) {
            if (number / i == 0) {
                numOrder++;
                break;
            }
        }
        int baseNum = 1;
        for (int i = 1; i <= numOrder / 2; i++) {
            baseNum *= 10;
        }

        double tmp = 0;
        for (int i = baseNum; i < baseNum * 4; i++) {
            if (i * i <= number) {
                tmp = (double) i;
            }
        }

        for (double i = tmp; i <= tmp + 1.0; i += 0.1) {
            if (i * i <= number) {
                sqrRoot = i;
            }
        }
        return sqrRoot;
    }

    static double theSquareRootOfANumberTwo (int number) {

        double sqrRoot = 0;
        int numOrder = 0;


        return 0.0;
    }


    /*
     * String Anagram. Write a
     * program to check if two
     * given String is Anagram of
     * each other. Your function
     * should return true if two
     * Strings are Anagram, false
     * otherwise. A string is said
     * to be an anagram if it
     * contains the same
     * characters and same length,
     * but in a different order,
     * e.g. army and Mary are
     * anagrams. You can ignore
     * cases for this problem, but
     * you should clarify that
     * from your interview.
     */
    static boolean stringAnagram (String firstStr, String secondStr) {

        char tmp1[] = firstStr.toCharArray();
        char tmp2[] = secondStr.toCharArray();
        boolean result = false;
        if (tmp1.length != tmp2.length) {
            return result;
        }

        for(int i = 0; i < tmp1.length; i++) {
            boolean lable = false;
            for (int k = 0; k < tmp1.length; k++) {
                if(tmp1[i] == tmp2[k]) {
                    lable = true;
                }
            }
            if(lable == false) {
                return result;
            }
        }

        result = true;
        return result;
    }

}
