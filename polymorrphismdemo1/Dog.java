package com.Ryan.polymorrphismdemo1;

public class Dog extends Animal {
    public Dog() {
    }
    public Dog(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String s) {
        System.out.println(this.age + "岁的" + this.color + "颜色的狗正在吃" + s);
    }

    public void watchHome() {
        System.out.println("正在看家");
    }

}
