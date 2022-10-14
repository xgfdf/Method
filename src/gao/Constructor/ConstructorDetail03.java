package gao.Constructor;

public class ConstructorDetail03 {
    public static void main(String[] args) {
        //Dog03 dog03 = new Dog03();  这样不传参数就不对了！！

        Dog03 dog03 = new Dog03("小明");
        System.out.println(dog03.name);

    }
}
/*一旦定义了自己的构造器,默认的构造器就覆盖了
  就不能再使用默认的无参构造器，除非显式的定义一下， */
//你如果覆盖了默认构造器，自己不显式定义，你如果new时不传参数就会报错
class Dog03{
    String name;

    public Dog03(String pName){

        name = pName;
    }

}
