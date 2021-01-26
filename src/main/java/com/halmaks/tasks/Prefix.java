package com.halmaks.tasks;

import java.util.ArrayList;

public class Prefix {

    public static ArrayList<Integer> searchWithPrefix(String[] input, String prefix) {
        char[] prefixInChar = prefix.toCharArray();
        ArrayList<Integer> arrayWithValues = new ArrayList<Integer>();
        for (int i = 0; i < input.length; i++) {
            char[] currentInChar = input[i].toCharArray();
            boolean flag = false;
            for (int j = 0; j < prefixInChar.length; j++) {
                if (prefixInChar[j] != (currentInChar[j])) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if(flag) {
                arrayWithValues.add(i);
            }
        }
        return arrayWithValues;
    }
}
