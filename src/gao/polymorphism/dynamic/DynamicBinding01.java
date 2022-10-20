package gao.polymorphism.dynamic;

public class DynamicBinding01 {
    public static void main(String[] args) {

        Father01 father01 = new Son01();

        //如果我们吧子类的sum()方法去掉，输出结果是什么？
        //father.sum()先看子类，子类没有这个方法，向上找父类，
        //但是父类的sum()方法里面又有一个getI()方法
        //子类和父类都有getI()方法，子类重写了父类的getI方法，这时候调用哪个？

        //## 动态绑定机制
        //1.当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
        //2.当调用对象属性时，没有动态绑定机制，哪里声明，那里使用

        //这时候就要看实例对象father的运行类型是什么了
        //所以调用子类的getI方法
        //子类的getI方法返回一个属性，就直接返回在子类声明的这个属性i 就是20

        System.out.println(father01.sum());//30


        //再把子类的sum1()方法去掉，结果是多少
        System.out.println(father01.sum1());//20

    }
}
class Father01{
    public int i = 10;
    public int sum(){
        return getI() + 10;
    }
    public int sum1(){
        return i+10;
    }
    public int getI(){
        return i;
    }
}
class Son01 extends Father01{

    public int i = 20;
  /*  public int sum(){
        return getI() + 20;
    }*/
  /*  public int sum1(){
        return i+10;
    }*/
    public int getI(){
        return i;
    }
}

