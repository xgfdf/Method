package gao;

//找出整形数组的最大值并返回
//返回值类型是整数
public class max {
    public static void main(String[] args) {

        //右侧的数组把地址交给arr1;
        int[] arr1 ={12,456,1025,346,1,35};

        //arr1传给方法arr;
        //arr里面的地址与arr1里面的地址一样
        //两个数组变量指向同一个数组对象，arr里面也是这些数据

        System.out.println(getArrMax(arr1));

    }
    //arr1接收的是一个地址
    public static int getArrMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }

        }
        return max;
    }
}
