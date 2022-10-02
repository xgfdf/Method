package gao;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        judge(a);

    }
    public static void judge(int n){
        if (n % 2 == 0){
            //n是整形，怎么返回字符串呢？？

            //return ();
            System.out.println("这个数是偶数");

        }
        else System.out.println("这个数是奇数");
    }
}
