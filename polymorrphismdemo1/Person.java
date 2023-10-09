package com.Ryan.polymorrphismdemo1;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a, String s) {
        System.out.println("年龄为" + this.age + "岁的" + this.name + "养了一只" +
                a.color + "的" + a.age + "的宠物");
    }
}
