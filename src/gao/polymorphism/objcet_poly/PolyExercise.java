package gao.polymorphism.objcet_poly;

public class PolyExercise {
    public static void main(String[] args) {

        Sub sub = new Sub();
        System.out.println(sub.sum);//这个是访问属性，访问属性看编译类型

        //方法看运行类型
        sub.display();

        Base base = sub;//这其实就是向上转型，
        //把子类引用赋给 父类
        //之前之类引用sub指向Sub()这个空间，
        // 现在父类引用也指向这个空间


        System.out.println(base == sub);//都指向同一空间，肯定是true;

        System.out.println(base.sum);//访问属性 看编译类型，编译类型是Base，输出10

        base.display();//访问方法，看运行类型，运行类型是Sub,输出20

    }

}
class Base{//父类
    int sum = 10;

    public void display(){
        System.out.println(this.sum);
    }

}
class Sub extends Base{
    int sum = 20;

    @Override
    public void display() {
        System.out.println(this.sum);
    }
}
