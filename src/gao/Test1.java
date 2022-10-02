package gao;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[]{12,13,45,78};
        change(arr);
        System.out.println(arr[1]);

    }
    public static void change(int[] arr1){
        //引用类型的参数传输 存储的地址值；

        System.out.println(arr1[1]);
        arr1[1] = 100;
        System.out.println(arr1[1]);

    }
}
