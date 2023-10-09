package com.Ryan.polymorrphismdemo1;

public class Animal {
    public int age;
    public String color;

    public Animal() {

    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void eat(String s) {
        System.out.println("吃");
    }
}

