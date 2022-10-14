package gao.Extend.Base_4;

public class Sub1 extends Base1 {

    public Sub1() {
        //
        super("smith",18);
        System.out.println("子类的Sub1()构造器被调用");
    }



    public Sub1(String name) {

        super("tom",20);
        System.out.println("子类的(String name)构造器被调用");
    }
}
