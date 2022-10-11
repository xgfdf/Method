package gao.Extend.super_;

public class Son extends Father{

    public Son(){
        super();
        System.out.println("子类--构造方法");

    }


    public static void main(String[] args) {
        Son son = new Son();

    }
}
