package gao.Constructor;

public class ConstructorDetail {
    public static void main(String[] args) {
        Person_D person_d = new Person_D("小明",20);

    }
}
/*
* 一个类可以定义多个不同的构造器，即构造器重载
* */
class Person_D{
    String name;
    int age;

    //第一构造器
    public Person_D(String pName,int pAge){
        name = pName;
        age = pAge;
    }

    //第二个构造器，只指定人名，不指定年龄
    public Person_D(String pName){
        name = pName;
    }

}
