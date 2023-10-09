package com.Ryan.oopextendsdemo3;

public class Employee {
    String id;
    String name;
    public void wokeType() {
        System.out.println("工作");
    }

}
class Teacher extends Employee {
    @Override
    public void wokeType() {
        System.out.println("上课");
    }
}

class AdminStaff extends Employee {
    @Override
    public void wokeType() {
        System.out.println("行政");
    }
}

class Lecture extends Teacher {
    @Override
    public void wokeType() {
        System.out.println("上大课");
    }
}

class Tutor extends Teacher {
    @Override
    public void wokeType() {
        System.out.println("上小课");
    }
}

class Maintainer extends AdminStaff {
    @Override
    public void wokeType() {
        System.out.println("维护");
    }
}

class Buyer extends AdminStaff {
    @Override
    public void wokeType() {
        System.out.println("采购");
    }
}