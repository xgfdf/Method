package gao;

public class MethodDetail01 {
    public static void main(String[] args) {
        A a = new A();
        a.sayOK();

        a.m2();

    }
}

//同一个类中的方法调用:直接调用即可
class A {
    public void print(int n){
        System.out.println("print方法被调用n = " + n);
    }

    //因为在同一个类，sayOK调用 print直接调用就可以
    public void sayOK(){
        print(5);
        System.out.println("继续执行");
    }


    //跨类中的方法A 调用B类方法，需要通过对象名调用
    public void m2(){
        System.out.println("m2()方法被调用");

        //创建B对象，然后再调用方法即可
        B b = new B();
        b.hi();

    }
}

//跨类中的方法A类调用B类方法:
//需要通过对象名调用。比如对象名.方法名(参数)

class B{

    public void hi(){
        System.out.println("B类里的hi被执行");
    }
}
