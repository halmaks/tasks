package com.halmaks.tasks;

import java.util.Scanner;

public class SumOfDigits {

    public Integer calculateSum(String input) {
        int x = new Scanner(input).nextInt();
        if (x == 0) {
            return 0;
        }
        x = Math.abs(x);
        int sum = 0;
        for (int i = 1; i <= x; i *= 10) {
            sum += (x % (10 * i)) / i;
        }
        return sum;
    }
}
