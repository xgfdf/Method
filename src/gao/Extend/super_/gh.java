package gao.Extend.super_;

public class gh {
     int a; //访问权限 + 全局静态变量+ 类型+ 名字
    gh sghh = new gh();
    public static void main(String[] args) {
        //a = 0;
        f1();
    }

    public static void f1() {
       //a = 20;
       for (int i = 0; i<5;i++){
           System.out.println(i);
       }
        System.out.println();
    }
}
