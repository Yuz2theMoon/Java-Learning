package com.Ryan.oopextendsdemo2;

public class Dog {
    public void drink(){
        System.out.println("drink water");
    }
    public void watchHome() {
        System.out.println("watch home");
    }
    public void eat() {
        System.out.println("吃狗粮");
    }
}

class Husky extends Dog{
    public void BreakHome() {
        System.out.println("拆家");
    }
}
class Sharpi extends Dog{
    @Override
    public void eat() {
        System.out.println("吃狗粮，吃骨头");
    }
}
class Tianyuan extends Dog{
    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}