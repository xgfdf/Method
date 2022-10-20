package gao.polymorphism.dynamic;

public class DynamicBinding {
    public static void main(String[] args) {
        Father father = new Son();//向上转型

        System.out.println(father.sum());//调用方法看运行类型
        System.out.println(father.sum1());//调用方法看运行类型

    }
}
class Father{
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
class Son extends Father{

    public int i = 20;
    public int sum(){
        return getI() + 20;
    }
    public int sum1(){
        return i+10;
    }
    public int getI(){
        return i;
    }
}
