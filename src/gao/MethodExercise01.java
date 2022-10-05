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


        //使用print方法
        a.print(4,5,'@');;

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

    /*
    根据行、列、字符打印对应行数和列数的字符，
    比如:行: 4,列: 4,字符 #,则打印相应的效果

*   1 方法的返回类型 void
    2 方法的名字isodd
    3 方法的形参(int int char)
    4 方法体：循环
* */
    public void print(int n1, int n2,char a){
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(a);
            }
            System.out.println();

        }
    }




}

