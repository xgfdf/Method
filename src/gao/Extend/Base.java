package gao.Extend;

public class Base {//父类

    //四个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    //无参构造器
    public Base() {
        System.out.println("Base()....");
    }

    //父类提供一个公共方法，返回n4
    //子类是继承这个getN4方法的
    public int hi(){
        return n4;


    }

    //四个不同修饰符 修饰的方法
    public void test100(){
        System.out.println("test100");
    }
    protected void test200(){
        System.out.println("test200");
    }
    void test300(){
        System.out.println("test300");
    }
    private void test400(){
        System.out.println("test400");
    }


}
