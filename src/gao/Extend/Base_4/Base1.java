package gao.Extend.Base_4;

public class Base1 {

    public int n1 = 100;
    protected  int n2 = 200;
    int n3 = 300;
    private int n4 = 400;


    public Base1() {
    }

    public Base1(String name, int age) {
        System.out.println("父类的(String name,int age)被调用");
    }
    
    public Base1(String name) {
        System.out.println("父类的(String name)被调用");
    }
}
