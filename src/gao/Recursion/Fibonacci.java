package gao.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        F f1 = new F();
        int a = f1.Fibonacci(33);
        System.out.println(a);

    }
}
class F{
    //斐波那契数列;
    //用递归的方式
    /*
    * n = 1    1
    * n = 2    1
    * n = 3    2
    * n = 4    3
    * n>2时，斐波那契数是前两个数的和
    * */
    public int Fibonacci(int n){

        if (n==1||n==2){
            return 1;
        }else  return Fibonacci(n-1)+Fibonacci(n-2);



    }
}

