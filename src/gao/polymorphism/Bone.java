package gao.polymorphism;

public class Bone extends Food{

    //当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器；
    // ===如果父类没有提供无参构造器，则必须在子类的构造器中用super
    // 去指定使用父类的哪个构造器完成对父类的初始化工作，
    // 否则，编译不会通过
    
    public Bone(String name) {
        super(name);//初始化从父类继承下来的属性

        //在创建子类对象时调用子类构造器前必须要先调用父类构造器
        // 的目的是初始化从父类继承下来的属性
    }
}
