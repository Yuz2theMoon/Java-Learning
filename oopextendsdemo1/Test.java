package com.Ryan.oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        son s = new son();
        s.show();
    }
}

class Father {
    String name  = "father";
    public void drink(){
        System.out.println("drink water");
    }
    public void eat() {
        System.out.println("eat food");
    }
}

class son extends Father{
    String name = "son";
    public void show() {
        String name = "123";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name); // 就近原则
    }
    // 当父类方法不能满足子类需求时，需要重写
    @Override
    public void drink() {
        System.out.println("drink water 2");
    }

    @Override
    public void eat() {
        System.out.println("eat food 2");
    }

}