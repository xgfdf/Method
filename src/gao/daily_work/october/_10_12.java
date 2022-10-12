package gao.daily_work.october;

import java.lang.reflect.Array;

public class _10_12 {
    public static void main(String[] args) {
        f2();

    }

/*
*
1		 * 数组A={"苹果","西瓜","桃","西瓜","梨","苹果","梨","橘子","西瓜"}
		 * 请统计出数组中一共有几种水果？
2 		 * 随机生成10以内的5个数，要求数字不能重复
3 		 * 数组A={1,2,3,5,4}
		 * 数组B={7,8,6,10,9}
		 * 请将两个数组合并成一个集合
4        数组A={1,3,1,2,3,1}
		 * 数组B={4,1,5,7,6,3}
		 * 请将两个数组合并成一个集合，且集合中的数不能重复

* */
    public static void f1(){
        String[] A = {"苹果","西瓜","桃","西瓜","梨","苹果","梨","橘子","西瓜"};



        for (int i = 0; i < Array.getLength(A); i++) {
            int count = 0;
            for (int j = 0; j < Array.getLength(A); j++) {

                if (A[j]== A[i]){
                    count++;
                }
            }
            if (count ==1){
                System.out.println(A[i]);
            }

            }
    }


        public static void f2() {
            int min = 0; // 定义随机数的最小值
            int max = 10; // 定义随机数的最大值
            // 产生一个0~10的数
            int s = (int) min + (int) (Math.random() * (max - min));
            if (s % 2 == 0) {
                // 如果是偶数就输出
                System.out.println("随机数是：" + s);
            } else {
                // 如果是奇数就加1后输出
                System.out.println("随机数是：" + (s + 1));
            }
        }

        /*public static void f4(){
          int[] A= {1,3,1,2,3,1};
            int[] B={4,1,5,7,6,3};
            Set<Long> hashSet = new HashSet<>();
            hashSet.addAll(Arrays.asList(A));
            hashSet.addAll(Arrays.asList(B));


        }*/






}