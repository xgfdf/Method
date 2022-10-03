package gao;

public class Method02 {
    public static void main(String[] args) {
        //遍历一个map数组，输出数组的各元素值
        int[][] map = {{1,2,3},{4,5,6},{7,8,9}};

        /*for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");

            }
            System.out.println();
        }*/

        //如果要求多次遍历呢？？这个时候写一个方法就比较好

        //使用方法完成输出
        Mytools tool = new Mytools();
        tool.printArr(map);

    }
}

//把输出的功能，写到一个类的方法中，然后调用该方法即可

/*方法的好处：
    提高代码的复用性
    将实现的细节封装起来，然后供其他用户调用
* */
class Mytools{

    //方法就收一个二维数组
    public void printArr(int[][] map1){

        //对传入的数组就行遍历
        for (int i = 0; i < map1.length; i++) {
            for (int j = 0; j < map1[i].length; j++) {
                System.out.print(map1[i][j] + "\t");

            }
            System.out.println();
        }

    }


}

