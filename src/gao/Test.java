package gao;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);

    }
    //                         形参c
    public static void change(int c){
        //传入形参c的是值，不是变量a
        System.out.println(c);
        c = 20;
        System.out.println(c);

    }
}
