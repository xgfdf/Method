package gao;

import java.util.Arrays;

public class MethodDetail {
    public static void main(String[] args) {

        AA a = new AA();
        int[] res = a.getSumAndSub(2,6);
        System.out.println(Arrays.toString(res));

        a.f2();



    }
}
//一个方法最多只有一个返回值，怎么返回多个结果，
//可以用数组
class AA{
    public int[] getSumAndSub(int n1,int n2){

        //创建一个数组
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

    //返回类型可以为任意类型，基本类型和引用类型（数组、对象）

    /*
    * 如果方法要求有返回数据类型，则方法体中最后的执行语句必须为return值;
      而且要求返回值类型必须和return的值类型一致或兼容
    * */
    public double f1(){
        int d1 = 1;
        return d1;//虽然类型不一样，但是可以自动类型转换
    }

    //如果方法是void,则方法体中可以没有return语句，或者只写return ;
    public void f2(){
        System.out.println("123");
        System.out.println("但如果头发");
        return;//可以作为方法的结束语句
        //System.out.println("32");


    }

}