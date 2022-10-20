package gao.polymorphism.foreword;

import gao.polymorphism.foreword.Animal;

public class Dog extends Animal {
    //如果父类没有提供无参构造器，
    // 则必须在子类的构造器中
    // 用super去指定使用父类的哪个构造器完成对父类的初始化工作

    public Dog(String name) {
        super(name);
    }
}
