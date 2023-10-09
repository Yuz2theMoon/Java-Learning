package com.Ryan.MathDemo1;

public class MathDemo1 {
    public static void main(String[] args) {
        /*
        public static int        abs(int a)                absolute value 绝对值
        public static double     ceil(double a)            Round up 向上取整
        public static double     floor(double a)           Round down 向下取整
        public static int        round(int a)              四舍五入
        public static int        max(int a, int b)         max number
        public static double     pow(double a, double b)   Returns the value of a to the bth power
        public static double     random()                  Return randomized value of double, range[0.0,1.0)
         */
        // abs
        // range: -2147483648 ~ 2147483647
        System.out.println(Math.abs(-88)); // 88

        // ceil
        System.out.println(Math.ceil(12.34)); // 13.0
        System.out.println(Math.ceil(-13.4)); // 12.0

        // floor
        System.out.println(Math.floor(2.34)); //2.0
        System.out.println(Math.floor(2.54)); //2.0
        System.out.println(Math.floor(-12.34)); //-13.0

        // max and min
        System.out.println(Math.max(2,3)); // 3
        System.out.println(Math.min(2,3)); // 2

        // pow
        // advise:
        // Second parameter: generally passes a positive integer greater than or equal to 1
        System.out.println(Math.pow(4,0.5));//2.0
        System.out.println(Math.pow(2,-2)); //0.25


    }
}
