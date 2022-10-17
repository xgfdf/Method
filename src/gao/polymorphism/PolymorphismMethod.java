package gao.polymorphism;

public class PolymorphismMethod {
    public static void main(String[] args) {

        //方法重载体现多态
        A a = new A();
        //这里传入不同的参数，调用sum方法，会调用不同的方法
        //对sum方法来说，就是多种状态的体现
        System.out.println(a.sum(1, 2));
        System.out.println(a.sum(1, 2, 3));


        //方法重写体现多态
        B b = new B();
        //虽然都是say方法，但是对象不一样，
        //调用自己对应的C方法
        a.say();
        b.say();

    }
}
class B{//父类

    public void say(){
        System.out.println("B类say()被调用");
    }
}
class A extends B{

    //两个sum()构成重载
    public int sum(int n1,int n2){
        return n1+n2;
    }

    public int sum(int n1,int n2,int n3){
        return n1+n2+n3;
    }

    //子类say方法的重写
    public void say(){
        System.out.println("A类say()被调用");
    }

}
