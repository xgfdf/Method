package gao.Constructor;

public class Constructor01 {
    public static void main(String[] args) {
        //当new（创建）一个对象时，直接通过构造器指定名字和年龄
        Person p1 = new Person("smith",100);

        System.out.println(p1.name+"\t"+p1.age);
    }
}
class Person{
    String name;
    int age;

    //构造器没有返回值，不能写void
    //构造器的名称和类Person一样
    //(String pName,int pAge)是构造器形参列表，规则和成员方法一样
    public Person(String pName,int pAge){
        System.out.println("构造器被调用， 完成对象属性的初始化");
        name = pName;
        age = pAge;
    }


}
