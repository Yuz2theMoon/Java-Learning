package com.Ryan.RuntimeDemo;

import java.io.IOException;
import java.sql.SQLOutput;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        // 1. get runtime object
        Runtime r1 = Runtime.getRuntime();

        // 2. exit Stop JVM
        //Runtime.getRuntime().exit(0);

        // 3. Get cpu thread count 获取cpu线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        // 4. total memory in byte
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024); // 8180

        // 5. Total memory size that has been fetched 已获取的内存总大小
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024); // 512

        // 6. FreeMemory
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024); // 508

        // 7. run cmd
        // shutdown
        // -s shut down after 1 min
        // -s -t choose time to shut down
        // -a cancel shutdown
        // shutdown and restart
        // Runtime.getRuntime().exec("notepad");
        // Runtime.getRuntime().exec("shutdown -s -t 3600");
        Runtime.getRuntime().exec("shutdown -a");

    }
}
