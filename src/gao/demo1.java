package gao;
public class demo1 {
    public static void main(String[] args) {
        System.out.println(sum(10));

    }
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
