package gao;

import java.util.Scanner;

public class Method01 {
    public static void main(String[] args) {

        //方法写好后，可以不去调用
        //先创建对象，然后调用方法
        Person p1 = new Person();
        p1.speak(); //调用方法，计算机会去找Person里面的speak()方法
        p1.cal01();

        //让用户输入这个n值
        Scanner sc = new Scanner(System.in);
        p1.cal02(sc.nextInt());

        int res = p1.getSum(12,23);
        System.out.println(res);

    }
}
    class Person{
        String name;
        int age;

        //方法 / 成员方法
        /*
        * 1、public 表示方法是公开的
        * 2、void 表示方法没有返回值
        * 3、speak() speak是方法名  ()是形参列表
        * 4、{}方法体  写要运行的代码
        * */

        public void speak(){
            System.out.println("你好啊！");
        }
        public void cal01(){
            int sum = 0;
            for (int i = 1; i <1000 ; i++) {
                sum+=i;


            }
            System.out.println("计算结果是："+ sum);
        }
        //添加一个成员方法，该方法可以就收一个数字n,计算1+2+...+n的结果;
        public void cal02(int n){
            int sum = 0;
            for (int i = 1; i <=n; i++) {
                sum+=i;

            }
            System.out.println("计算结果是"+sum);
        }
        //前面打印在方法里面，所以不需要返回，后面是数据返回来再打印

        //(int m,int n)形参列表，两个形参，可以接受用户输入的值
        //return res  表示把res的值返回
        public int getSum(int m,int n){
            int res = m+n;
            return res;
        }
    }

