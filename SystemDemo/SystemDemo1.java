package com.Ryan.SystemDemo;

public class SystemDemo1 {
    public static void main(String[] args) {
        /*
              public static void exit(int status)             terminate JVM
              public static long currentTimeMillis()
              public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
         */

        long l = System.currentTimeMillis();
        System.out.println(l);

        // copy array
        // data type must be the same!
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];

        // copy arr1 to arr2
        // parameter 1: array source
        // parameter 2: Copy from the first index of the data source array. 从数据源数组的第几个索引开始拷贝
        // parameter 3: Destination 目的地
        // parameter 4: Index of the destination array 目的地数组的索引
        // parameter 5: Number of copies 拷贝的个数
        // System.arraycopy(arr1,0,arr2,0,10);
        // 0 0 7 8 9 0 0 0 0 0
        System.arraycopy(arr1,6,arr2,2,3);

        // verify array
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }


        // 0：If the status is zero — exit(0), the program will have a successful termination.
        // A non-zero status — exit(1) indicates abnormal termination of the JVM
        System.exit(0);

        System.out.println("Is the program terminated?");

    }
}
