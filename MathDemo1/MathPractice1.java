package com.Ryan.MathDemo1;

public class MathPractice1 {
    public static void main(String[] args) {
        // Determining whether a number is prime or not
        System.out.println(isPrime(997));
    }

    public static boolean isPrime(int number) {
        int count = 0;
        /* Math.sqrt(number) calculates the square root of a given number,
         and then the for loop tests all integers from 2 to that square root.
         If there exists an integer that divides number, then the number is not prime.

         This optimization reduces the number of loops and increases the efficiency of the algorithm,
         especially for large numbers. When determining prime numbers,
         you don't have to test all the way to the number itself, but only to its square root.
         */
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if (number % i == 0) {
                return false;
            }
        }
        System.out.println(count);
        return true;
    }

}
