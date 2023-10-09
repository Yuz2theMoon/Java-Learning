package com.Ryan.polymorrphismdemo1;

public class Cat extends Animal {
    public Cat() {

    }
    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String s) {
        System.out.println(this.age + "岁的" + this.color + "颜色的猫正在吃" + s);
    }

    public void catchMouse() {
        System.out.println("正在逮老鼠");
    }
}
