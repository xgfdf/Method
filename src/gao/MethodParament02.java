package gao;

import java.util.Arrays;

public class MethodParament02 {
    public static void main(String[] args) {

        AAA a = new AAA();
        int[] arr = {1,2,3};
        a.test100(arr);
        System.out.println(Arrays.toString(arr));


        BBB b = new BBB();
        Person01 p = new Person01();
        p.name = "小明";
        p.age = 20;
        //b.test200(p)这里传入的是P这个对象的整体属性
        b.test200(p);

        System.out.println(p.age);


    }
}


//引用类型传递的是地址(传递也是值，但是值是地址)，可以通过形参影响实参!
class AAA{

    public void test100(int[] arr){
        arr[0] = 100;
        System.out.println(Arrays.toString(arr));




    }
}


//对象也是引用类型 是地址传递
class Person01{
    String name;
    int age;

}
class BBB{
    //test200这个方法，需要传进来的参数，是一个person类的值
    public void test200(Person01 p){
//        p.age = 100;

        //如果把上面的改成 p = null,main里面会输出什么？？
        p = null;

        //这两个p是不一样的，方法里面的p指向空，不影响main里面p的指向

        //接着再修改
        //加Person是重复定义，因为参数列表已经定义过了
        //p是对象名,新开辟的空间指向p
        p = new Person01();
        p.name = "哈哈";
        p.age = 99;
        //不会改变原来的对象，因为他又实例化了一个新的对象，p不再指向原来的地址，p指向了新的地址。自然不会改变原来的p

    }

}
