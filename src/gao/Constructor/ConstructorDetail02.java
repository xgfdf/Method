package gao.Constructor;

public class ConstructorDetail02 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog.name);

    }
}
/*如果没有定义构造器，系统会自动给类生成一个默认无参构造器
(也叫默认构造器)，比如Person() {},
使用javap指令反编译看看

一旦定义了自己的构造器,默认的构造器就覆盖了
就不能再使用默认的无参构造器，除非显式的定义一下， 即: Person(）{ }*/
//你如果覆盖了默认构造器，自己不显式定义，你如果new时不传参数就会报错
class Dog{
    String name;
    int age;

   Dog(){

   }//这个就是系统自动给类生成的一个默认无参构造器



    Dog(String pName){

    }


}