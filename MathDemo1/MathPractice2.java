package com.Ryan.MathDemo1;

public class MathPractice2 {
    public static void main(String[] args) {
        // Count Narcissistic number from 100~999
        int count = 0;
        for (int i = 100; i <= 999 ; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100 % 10;

            // The sum of the power 3, compared to itself
            double sum = Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3);
            if(sum == i) {
                count++;
                // System.out.println(i);
            }

        }
        System.out.println(count);
    }
}
