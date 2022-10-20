package gao.polymorphism.detail_;

public class PolyDetail02 {
    public static void main(String[] args) {

        //属性不能重写，要看= 号左边（编译类型）
        //方法可以重写，要看运行类型

        //属性没有重写之说！属性的值看编译类型
        Base base = new Sub();//向上转型
        System.out.println(base.count);// ？ 看编译类型 10
        Sub sub = new Sub();
        System.out.println(sub.count);//?  20

        System.out.println(sub.a);//5
        //子类继承父类所有的非私有的成员变量和方法
    }
}

class Base { //父类
    int count = 10;//属性
    int a = 5;
}
class Sub extends Base {//子类
    int count = 20;//属性
}
