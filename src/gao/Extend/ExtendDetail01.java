package gao.Extend;

public class ExtendDetail01 {
    public static void main(String[] args) {

        Sub sub = new Sub();// 子类必须调用父类的构造器，完成父类的初始化
        /* 在执行上面代码时，打印下面语句
        父类Base()构造器被调用....
        子类Sub()构造器被调用... */
        System.out.println("===第二个对象");
        Sub sub1 = new Sub("jack");//当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器

        //打印结果
        /*
            父类Base()构造器被调用....
            子类Sub()构造器被调用...
            ===第二个对象
            父类Base()构造器被调用....
            子类Sub()构造器被调用...
        */

        sub1.test100();





        //sub.test300();
        //sub.hi();
        //sub.sayOk();
    }
}
