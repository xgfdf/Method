package gao.polymorphism.detail_;

public class PolyDetail {
    public static void main(String[] args) {

        //向上转型: 父类的引用指向了子类的对象
        //语法：父类类型引用名 = new 子类类型();
        Animal animal = new Cat();
        Object obj = new Cat();//可以吗? 可以 Object 也是 Cat的父类

        //向上转型调用方法的规则如下:
        //(1)可以调用父类中的所有成员(需遵守访问权限)
        //(2)但是不能调用子类的特有的成员
        //(#)因为在编译阶段，能调用哪些成员,是由编译类型来决定的

        //编译器会认为你要调的方法是写在编译类型的，但是编译编译类型Animal里面没有
        //animal.catchMouse();

        //(4)最终运行效果看子类(运行类型)的具体实现, 即调用方法时，按照从子类(运行类型)开始查找方法
        //，然后调用，规则我前面我们讲的方法调用规则一致。
        animal.eat();//猫吃鱼..
        animal.run();//跑
        animal.show();//hello,你好
        animal.sleep();//睡

        //如果重新用Cat创建的对象，和animal指向的对象不是同一个，这样就有了向下转型，明白了吧
        //说简单点就是为了少用一个new字，省点空间


        //老师希望，可以调用Cat的 catchMouse方法
        //多态的向下转型
        //(1)语法：子类类型 引用名 =（子类类型）父类引用;
        //问一个问题? cat 的编译类型 Cat,
        // 运行类型也是 Cat，因为已经强制转换成Cat了
        Cat cat = (Cat) animal;
        //因为之前animal指向Cat对象，所以把animal强转成Cat类，相当于生成了一个新的引用，也指向这个Cat对象
        cat.catchMouse();//猫抓老鼠



        //(2)要求父类的引用必须指向的是当前目标类型的对象
         //要求animal必须先指向Cat这个对象   Animal animal = new Cat();

        //只能把一个指向猫Cat的animal强制转换成猫类，不能转换成狗类;

        Dog dog = (Dog) animal;//可以吗？

        System.out.println("ok~~");
    }
}
