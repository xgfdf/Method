package gao;

public class MethodCopy {
    public static void main(String[] args) {

        Person02 p = new Person02();
        p.name = "米兰";
        p.age = 100;

        Mytools01 tools = new Mytools01();

        Person02 p3 = tools.copyPerson(p);
        //至此 p和p2都是Person02对象，但是两个独立的对象，属性相同

        System.out.println(p.age + p.name);
        System.out.println(p3.age + p3.name);
        //上面的输出结果相同

        //通过对象比较 看是否为同一个对象
        System.out.println(p == p3);// 结果为false

    }
}

class Person02{
    String name;
    int age;
}
class Mytools01{
    /*
    * 编写一个方法copyPerson, 可以复制一个Person对象， 返回复制的对象。克隆对象，
注意要求得到新对象和原来的对象是两个独立的对象， 只是他们的属性相同
编写方法的思路
    1. 方法的返回类型 Person02
    2. 方法的名字 copyPerson
    3. 方法的形参(person02 p)
    4.方法体，创建一个新对象并复制属性，返回即可

    * */
    public Person02 copyPerson(Person02 p){
        //创建一个新对象
        Person02 p2 = new Person02();

        //把原来对象的名字、年龄赋给p2; 属性复制
        p2.name = p.name;
        p2.age = p.age;

        return p2;
    }
}
