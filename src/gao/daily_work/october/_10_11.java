package gao.daily_work.october;

import java.util.Scanner;

public class _10_11 {
    public static void main(String[] args) {
        f5();

    }

    public static void f1(){
        for (int i = 101; i <201 ; i++) {
            f1:for (int j = 2; j < i ; j++) {
                if (i % j == 0){
                    //boolean flag = false;
                    break f1;

                }else System.out.println(i);
                break ;

            }


        }

    }
    public static void f2(){

        int money = 5000;
        for (int i = 0; i < 120; i++) {
            money += money*0.001;

        }
        System.out.println(money);

    }
    public static void f4(){
        Scanner sc = new Scanner(System.in);
        int[] a = {3,2,1,5,4};
        int number = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number);
            System.out.println(true);
            break;


        }

    }

    //一亿小目标
    //小明现在一个月 的工资是10000元，他每个月的花销占工资的20%
    //公司承诺每年涨薪20%，请问小明多少年才能挣到一亿。
    public static void f5(){
        double salary = 10000;
        double sum = 0;
        int count = 1;
        while (sum<=100000000){
            salary = salary*12;
            sum = salary - salary*0.8;
            salary = salary*1.2;
            count++;

        }
        System.out.println(count);

    }
}

