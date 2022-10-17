package gao.polymorphism;

public class Fish extends Food{
    //父类已经把默认构造器覆盖了
    public Fish(String name) {

        super(name);//调用父类带一个参数的构造器
    }
}
