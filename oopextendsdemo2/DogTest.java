package com.Ryan.oopextendsdemo2;

public class DogTest {
    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.BreakHome();
        husky.eat();
        husky.drink();
        husky.watchHome();

        Tianyuan t = new Tianyuan();
        t.eat();
        t.drink();
        t.watchHome();

        Sharpi s = new Sharpi();
        s.eat();
        s.drink();
        s.watchHome();
    }
}
