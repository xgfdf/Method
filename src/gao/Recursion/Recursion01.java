package gao.Recursion;

public class Recursion01 {
    public static void main(String[] args) {
        T t1 = new T();
        //t1.test(4);

        int b = t1.f1(7);
        System.out.println(b);


    }
}

class T{
    public void test(int n){
        if (n > 2){
            test(n - 1);
        }else System.out.println("n="+n);
        //每次递归都会进入完整的方法，方法走完才回到被调用的地方，所以会执行输出语句，2，3，4输出3个结果
        //返回位置是调用方法的位置。并且继续执行方法后面的程序。
        //不是每次调用都会执行一次输出语句，原来是要调用结束后层层返回来执行输出啊
        //一个test（）就对应一个栈空间，if语句执行完也要继续执行System语句去将栈空间完全释放


    }


    //斐波那契数列
    public int f1(int n){
        if (n==1||n==2){
            return 1;
        }else  return f1(n-1)+f1(n-2);



    }

}
