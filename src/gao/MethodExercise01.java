package gao;

import java.util.Scanner;

public class MethodExercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AA01 a = new AA01();
        //让用户输入该数
        if (a.isodd(sc.nextInt())){
            System.out.println("是奇数");
        }else System.out.println("是偶数");

    }
}

//编写类AA，有一个方法:判断一个数是奇数odd还是偶数，返回boolean

/*
*   1方法的返回类型boolean
    2方法的名字isodd
    3方法的形参(int num)
    4.方法体：判断
* */
class AA01{
    public boolean isodd(int n){
        /*if (n%2 != 0){
            return true;
        }else return false;*/
        //return  n%2 != 0 ? true:false;
        return n%2 != 0;

    }
}

