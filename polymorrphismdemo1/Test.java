package com.Ryan.polymorrphismdemo1;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog(2,"黑");
        Animal b = new Cat(3,"灰");

        Person p1 = new Person("老王", 30);
        Person p2 = new Person("老李",25);

        p1.keepPet(a, "骨头");
        a.eat("骨头");


        p2.keepPet(b, "鱼");
        b.eat("鱼");
    }
}
