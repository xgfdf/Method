package gao.polymorphism.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof  BB);// true
        System.out.println(bb instanceof  AA);// true

        //aa 编译类型 AA, 运行类型是BB
        //BB是AA子类

        //instanceof比较操作符，用于判断对象的运行类型是否为XX类型或XX(类型的子类型)
        AA aa = new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);

        Object obj = new Object();
        System.out.println(obj instanceof AA);//false
        String str = "hello";
        //System.out.println(str instanceof AA);
        System.out.println(str instanceof Object);//true
    }
}

class AA {} //父类
class BB extends AA {}//子类