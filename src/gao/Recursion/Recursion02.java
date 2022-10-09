package gao.Recursion;

public class Recursion02 {
    public static void main(String[] args) {
        Peach p1 = new Peach();
        int p11 = p1.peach(10);
        System.out.println(p11);

    }
}
/*      猴子吃桃子问题:有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后

        每天猴子都吃其中的一半，然后再多吃一个。当到第10天时，想再吃时(即还没吃)

        发现只有1个桃子了。问题:最初共多少个桃子?*/
//正着推不好推，逆向思维，第一天有一个🍑，第二天多要一个🍑，再×2就是四个🍑。
// 以此类推，到第十天有多少🍑
class Peach{
    public int peach(int n){
        if (n == 1) {
            return 1;
        }else {
            return (peach(n-1)+1)*2;

        }
    }

}
