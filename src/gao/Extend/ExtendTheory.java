package gao.Extend;

public class ExtendTheory {
    public static void main(String[] args) {
        Son son = new Son();
        /*按照查找关系来返回信息
        (1) 首先看子类是否有该属性
        (2) 如果子类有这个属性，并且可以访问，则返回信息
        (3) 如果子类没有这个属性，就看父类有没有这个属性(如果父类有该属性，并且可以访问，就返回信息..)
        (4) 如果父类没有就按照(3)的规则，继续找上级父类，直到object... */

        System.out.println(son.name);//儿子
        //System.out.println(son.age);//54
        System.out.println(son.hobby);//上网

        //如果父类的age属性是私有的，子类继承了所有的属性和方法，非私有的属性和方法可以在子类直接访问，
        // 但是私有属性和方法不能在子类直接访问，要通过父类提供公共的方法去访问
        System.out.println(son.getAge());
    }
}
class GrandPa{
    String name = "爷爷";
    String hobby = "上网";
}
class Father extends GrandPa{
    String name = "爸爸";
    private int age = 54;

    public int getAge() {
        return age;
    }
}
class Son extends Father{
    String name = "儿子";
}
